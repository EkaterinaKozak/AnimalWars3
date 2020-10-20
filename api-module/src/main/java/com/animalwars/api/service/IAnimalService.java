package com.animalwars.api.service;

import java.util.List;

import com.animalwars.entities.Animal;

public interface IAnimalService {
	
	void addAnimal(Animal animal);
	
	List<Animal> getAnimals();

}
