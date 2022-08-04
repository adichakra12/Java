package com.Zookeeper;

public class Mammal {
	
	protected int energyLevel = 0;

	public Mammal() {
		this.energyLevel = 100;
	}
	
	public int displayEnergy() {
		System.out.println(this.energyLevel);
		return energyLevel;
	}

}
