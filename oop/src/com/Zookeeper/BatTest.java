package com.Zookeeper;

public class BatTest {

	public static void main(String[] args) {
		
				Bat nosfaratu = new Bat();
				
				nosfaratu.displayEnergy();
				
				nosfaratu.attackTown();
				nosfaratu.displayEnergy();
				nosfaratu.attackTown();
				nosfaratu.displayEnergy();
				nosfaratu.attackTown();
				nosfaratu.displayEnergy();

				nosfaratu.eatHumans();
				nosfaratu.displayEnergy();
				nosfaratu.eatHumans();
				nosfaratu.displayEnergy();
				
				nosfaratu.fly();
				nosfaratu.displayEnergy();
				nosfaratu.fly();
				
				System.out.print("Nosfaratu's enery level is: ");
				nosfaratu.displayEnergy();

	}

}
