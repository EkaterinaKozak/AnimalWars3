package com.animalwars.api.service;

import java.util.List;

import com.animalwars.entities.Animal;

public interface IWarService {
	
	void spar(Animal animal1, Animal animal2);
	
	Animal battle(Animal redWrestler, Animal blueWrestler);
	
	void startChampionship(List<Animal> animalList);

}
