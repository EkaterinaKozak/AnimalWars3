package com.animalwars.entities;

public class Tiger extends Animal {
	public Tiger(String name) {
		setName(name);
		setEnergy(6 + (int) (Math.random() *10));
		setHit(2 + (int) (Math.random() *2));
	}


}
