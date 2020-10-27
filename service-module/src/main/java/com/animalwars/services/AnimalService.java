package com.animalwars.services;

import com.animalwars.api.dao.IAnimalDao;
import com.animalwars.api.service.IAnimalService;
import com.animalwars.dao.AnimalDao;
import com.animalwars.entities.Animal;

import java.util.List;

public class AnimalService implements IAnimalService {
	
	private IAnimalDao animalDao = new AnimalDao();
	
	public void addAnimal(Animal animal) {
		animalDao.addAnimal(animal);
	}
	
	public List<Animal> getAnimals() {
		return animalDao.getAnimals();
	}
}
