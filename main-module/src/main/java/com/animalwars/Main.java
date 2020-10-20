package com.animalwars;

import java.util.Scanner;

import com.animalwars.entities.Lion;
import com.animalwars.entities.Lynx;
import com.animalwars.entities.Moose;
import com.animalwars.entities.Tiger;
import com.animalwars.services.AnimalService;
import com.animalwars.services.WarService;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter tiger's name: ");
		Tiger tiger = new Tiger(scanner.nextLine());
		
		System.out.println("Enter lion's name: ");
		Lion lion = new Lion(scanner.nextLine());
		
		System.out.println("Enter lynx's name: ");
		Lynx lynx = new Lynx(scanner.nextLine());
		
		System.out.println("Enter moose's name: ");
		Moose moose = new Moose(scanner.nextLine());
		
		scanner.close();
		
		AnimalService animalService = new AnimalService();
		
		animalService.addAnimal(tiger);
		animalService.addAnimal(lion);
		animalService.addAnimal(lynx);
		animalService.addAnimal(moose);
		
		WarService ring = new WarService();
		
		ring.startChampionship(animalService.getAnimals());

	}

}
