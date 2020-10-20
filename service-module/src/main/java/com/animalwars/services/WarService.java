package com.animalwars.services;
import java.util.List;

import com.animalwars.api.service.IWarService;
import com.animalwars.entities.Animal;
import com.animalwars.utils.ResultSaver;

public class WarService implements IWarService {
	
	public void spar(Animal animal1, Animal animal2) {
		animal2.setEnergy(animal2.getEnergy() - animal1.getHit());
		animal1.setEnergy(animal1.getEnergy() - 1);
		System.out.println(animal1.getName() + " is hitting.");
		System.out.println(animal2.getName() + " has " + animal2.getEnergy() + " energy left.");
	}
	
	public Animal battle (Animal redWrestler, Animal blueWrestler) {
		ResultSaver.serialize(redWrestler);
		ResultSaver.serialize(blueWrestler);
		System.out.println("There is " + redWrestler.getName() + " in the red corner of the ring.");
		System.out.println("There is " + blueWrestler.getName() + " in the blue corner of the ring.");
		Animal winner = null;
		for (int i = 1; i < 12; i++) {
			System.out.println("The round #" + i);
			spar(redWrestler, blueWrestler);
			if(blueWrestler.getEnergy() <= 0) {
				System.out.println("Knockout! " + blueWrestler.getName() + " was defeated in the " + i + " round.");
				winner = redWrestler;
				redWrestler = ResultSaver.deserialize(redWrestler.toString());
				break;
			}
			spar(blueWrestler, redWrestler);
			if(redWrestler.getEnergy() <= 0) {
				System.out.println("Knockout! " + redWrestler.getName() + " was defeated in the " + i + " round.");
				winner = blueWrestler;
				blueWrestler = ResultSaver.deserialize(blueWrestler.toString());
				break;
			}
		}
		return winner;
	}
	
	public void startChampionship(List<Animal> animalList) {
		Animal redFinalist = battle(animalList.get(0), animalList.get(1));
		Animal blueFinalist = battle(animalList.get(2), animalList.get(3));
		Animal champion = battle(redFinalist, blueFinalist);
		System.out.println("Applause! The winner of the championship is " + champion.getName() + ".");
		ResultSaver.saveLog("First finalist - " + redFinalist.getName() + "\n" +
							"Second finalist - " + blueFinalist.getName() + "\n" +
							"Winner - " + champion.getName());
	}
}
