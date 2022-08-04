package com.Zookeeper;

public class GorillaTest {

	public static void main(String[] args) {
		//Create a new gorilla:
				Gorilla harambe = new Gorilla();
				
				harambe.throwSomething();
				harambe.displayEnergy();
				harambe.throwSomething();
				harambe.displayEnergy();
				harambe.throwSomething();
				harambe.displayEnergy();
				
				harambe.eatBanana();
				harambe.displayEnergy();
				harambe.eatBanana();
				harambe.displayEnergy();
				
				harambe.climb();
				
				
				System.out.print("Harambe's enery level is: ");
				harambe.displayEnergy();
	}

}
