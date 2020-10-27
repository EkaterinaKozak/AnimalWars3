package com.animalwars.api.service;

import com.animalwars.entities.Animal;

import java.util.List;

public interface IWarService {

  void spar(Animal animal1, Animal animal2);

  Animal battle(Animal redWrestler, Animal blueWrestler);

  void startChampionship(List<Animal> animalList);

}
