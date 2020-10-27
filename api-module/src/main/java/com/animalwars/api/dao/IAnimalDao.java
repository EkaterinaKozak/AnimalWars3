package com.animalwars.api.dao;

import com.animalwars.entities.Animal;

import java.util.List;

public interface IAnimalDao {

  void addAnimal(Animal animal);

  List<Animal> getAnimals();

}
