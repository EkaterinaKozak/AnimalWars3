package com.animalwars.entities;

public class Lion extends Animal {
	
	public Lion(String name) {
		setName(name);
		setEnergy(5 + (int) (Math.random() *10));
		setHit(3 + (int) (Math.random() *3));
	}


}
