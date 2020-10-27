package com.animalwars;

import com.animalwars.services.AnimalService;
import com.animalwars.services.WarService;

public class Main {

	public static void main(String[] args) {

		AnimalService animalService = new AnimalService();
		
		WarService ring = new WarService();
		
		ring.startChampionship(animalService.getAnimals());
	}
}
