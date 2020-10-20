package com.animalwars.dao;

import java.util.ArrayList;
import java.util.List;

import com.animalwars.api.dao.IAnimalDao;
import com.animalwars.entities.Animal;

public class AnimalDao implements IAnimalDao {
	
	private List<Animal> animalList = new ArrayList<>();
	
	public void addAnimal(Animal animal) {
		animalList.add(animal);
	}
	
	public List<Animal> getAnimals() {
		return animalList;
	}

}
