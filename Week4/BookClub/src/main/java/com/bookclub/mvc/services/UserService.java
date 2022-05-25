package com.bookclub.mvc.services;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import com.bookclub.mvc.models.User;
import com.bookclub.mvc.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	//Validate user for duplicate email or mismatch passwords
	public void validate(User newUser, Errors errors) {
		//Passwords Match Check
		if(!newUser.getPassword().equals(newUser.getConfirm())) {
			errors.rejectValue("password", "Mismatch", "Password does not match!");
		}
		//Email duplicate check
		if(userRepo.findByEmail(newUser.getEmail())!=null) {
			errors.rejectValue("email","unique", "Email is already taken!");
		}
	}
    public User register(User newUser) {
       String hashedPass = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
       newUser.setPassword(hashedPass);
       
        return userRepo.save(newUser);
    }
    public User findByEmail(String email) {
    	return userRepo.findByEmail(email);
    }
    public User findById(Long id) {
    	return userRepo.findById(id).orElse(null);
    }
    
    //Authenticate User
    public boolean authenticateUser(String email, String password) {
    	//find user by email first
    	User user = userRepo.findByEmail(email);
    	//If can't find by email, return false
    	if(user == null) {
    		return false;
    	} else {
    		//if passwords match return true
    		if(BCrypt.checkpw(password, user.getPassword())) {
    			return true;
    		} else {
    			return false;
    		}
    	}
    }
}
