package com.codingdojo.zookeeper2;

public class Bat extends Mammal{
	
	public Bat() {
		super(300);
		// TODO Auto-generated constructor stub
	}

	public void fly()
	{
		System.out.println("Take off ");
		energyLevel -= 50;
		displayLevel();
	}
	public void eatHumans()
	{
		System.out.println("Nummies Human ");
		energyLevel += 25;
		displayLevel();
	}
	public void attackTown()
	{
		System.out.println("Burn! Burn! The town is in chaos ");
		energyLevel -= 100;
		displayLevel();
	}
}
