package com.codingdojo.caresoft.clinicapp;

public class Physician extends User implements HIPAACompliantUser{

	public Physician() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Physician(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean assignPin(int pin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
