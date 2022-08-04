package com.Zookeeper;

public class Bat extends Mammal {

	public Bat() {
		this.energyLevel = 300;
	}
	
	public void fly() {
		System.out.println("caw!");
		energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("Dracula drained the blood of that weak human!");
		energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("We are being attacked by a vampire bat! Take cover!");
		energyLevel -= 100;
	}

}
