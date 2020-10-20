package com.animalwars.entities;

import java.io.Serializable;

public abstract class Animal implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String name;
	private int energy;
	private int hit;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEnergy() {
		return energy;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	
	
}
