package com.animalwars.api.service;

import com.animalwars.entities.Animal;

import java.util.List;

public interface IAnimalService {

  void addAnimal(Animal animal);

  List<Animal> getAnimals();

}
