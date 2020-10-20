package com.animalwars.api.dao;

import java.util.List;

import com.animalwars.entities.Animal;

public interface IAnimalDao {
	
	void addAnimal(Animal animal);
	
	List<Animal> getAnimals();

}
