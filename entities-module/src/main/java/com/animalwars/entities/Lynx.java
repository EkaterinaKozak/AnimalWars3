package com.animalwars.entities;

public class Lynx extends Animal {
	
	public Lynx(String name) {
		setName(name);
		setEnergy(5 + (int) (Math.random() *10));
		setHit(5 + (int) (Math.random() *3));
	}


}
