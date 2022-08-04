package com.Zookeeper;

public class Gorilla extends Mammal{

	public Gorilla() {
		this.energyLevel = 100;
	}
	
	public void throwSomething() {
		System.out.println("The gorilla threw something!");
		energyLevel -= 5;
	}
	
	public void eatBanana() {
		System.out.println("The gorilla ate a banana and has satisified its hunger!");
		energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("Look at that! The gorilla climbed that big tree!");
		energyLevel -= 10;
	}

}
