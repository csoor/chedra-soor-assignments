package com.bookclub.mvc.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bookclub.mvc.models.Book;
import com.bookclub.mvc.models.User;
import com.bookclub.mvc.services.UserService;
import com.bookclub.mvc.services.BookService;

@Controller
public class MainController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private BookService bookService;
	
	//Login and Register Routes
	@RequestMapping("/")
	public String index(@ModelAttribute("user") User user) {
		return "index.jsp";
	}
	@PostMapping("/registration")
	public String register(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
		if(result.hasErrors()) {
			return "index.jsp";
		} else {
			User newUser = userService.register(user);
			session.setAttribute("userId", newUser.getId());
			return "redirect:/dashboard";
		}
	}
	@PostMapping("/login")
	public String login(@RequestParam("email") String email, @RequestParam("password") String password, HttpSession session, RedirectAttributes redirectAttributes) 
	{
		
		// If user is authenticated, save their user id session
		if(userService.authenticateUser(email, password)) {
			User user = userService.findByEmail(email);
			
			session.setAttribute("userId", user.getId());
			return "redirect:/dashboard";
		} else {
			redirectAttributes.addFlashAttribute("error", "Incorrect email or password");
			return "redirect:/";
		}
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	//Books Routes
	@RequestMapping("/dashboard")
	public String dashbaord(Model m, HttpSession session) {
		if(session.getAttribute("userId")!=null) {
			User user = userService.findById((Long)session.getAttribute("userId"));
			//System.out.println(user);
			m.addAttribute("user", user);
			m.addAttribute("books", bookService.all());
			return "books.jsp";
		} else {
			return "redirect:/";
		}
	}
    @PostMapping("/books")
    public String createBook(@Valid @ModelAttribute("book") Book book, BindingResult result) {

    	if (result.hasErrors()) {
    		return "add.jsp";
    	}
    	
    	bookService.create(book);
    	
    	return "redirect:/dashboard";
    }
    @RequestMapping("/add")
    public String addPage(@ModelAttribute("book") Book book, Model model, HttpSession session) {
    	
    	User user = userService.findById((Long)session.getAttribute("userId"));
    	model.addAttribute("user", user);
    	
    	return "add.jsp";
    }
    @RequestMapping("/books/edit/{id}")
    public String editPage(Model model, @PathVariable("id") Long id, HttpSession session) {
    	
    	if(session.getAttribute("userId") !=null) {
        	Book book = bookService.findById(id);
        	model.addAttribute("book", book);
        	
        	return "edit.jsp";
    	} else {
    		return "redirect:/";
    	}
    	
    }
    
    @RequestMapping("/books/{id}")
    public String showPage(Model model, @PathVariable("id") Long id, HttpSession session) {
    	if(session.getAttribute("userId") == null) {
    		return "redirect:/";
    	}
    	Book book = bookService.findById(id);
    	model.addAttribute("book", book);
    	model.addAttribute("user", userService.findById((Long)session.getAttribute("userId")));
    	
    	return "book.jsp";
    }
    @PostMapping("/books/{id}")
    public String updateBook(@Valid @ModelAttribute("book") Book book, BindingResult result, Model model) {
    	
    	if (result.hasErrors()) {
    		return "edit.jsp";
    	}
    	
    	System.out.println("Book to be saved to DB: " + book.getId());

        bookService.update(book);
        
    	
    	return "redirect:/dashboard";
    }
    
}
