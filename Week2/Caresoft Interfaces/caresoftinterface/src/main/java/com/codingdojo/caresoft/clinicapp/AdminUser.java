package com.codingdojo.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser,HIPAACompliantAdmin {
//... imports class definition...
    
    // Inside class:
    private String role;
    private ArrayList<String> securityIncidents;
    // TO DO: Implement a constructor that takes an ID and a role
    public AdminUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdminUser(Integer id, String role) {
		super(id);
		// TODO Auto-generated constructor stub
		this.setRole(role);
		this.securityIncidents = new ArrayList<String>();
	}
    // TO DO: Implement HIPAACompliantAdmin!
	@Override
	public ArrayList<String> reportSecurityIncidents() {
		// TODO Auto-generated method stub
		return securityIncidents;
	}
	// TO DO: Implement HIPAACompliantUser!
	@Override
	public boolean assignPin(int pin) {
		// TODO Auto-generated method stub
		if(pin <= 4)
		{
			return true;
		}
		this.pin = pin;
		return false;
	}
	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		// TODO Auto-generated method stub
		if(this.id == confirmedAuthID)
		{
			return true;
		}
		return false;
	}

    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    //Getter and Setter
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
    

    
    

}
