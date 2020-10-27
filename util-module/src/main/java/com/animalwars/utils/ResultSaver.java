package com.animalwars.utils;

import com.animalwars.entities.Animal;

import java.io.*;

public class ResultSaver {

  private ResultSaver() {
  }

  public static void saveLog(String result) {
    try (FileWriter fileWriter = new FileWriter("results.txt")) {
      try (BufferedWriter writer = new BufferedWriter(fileWriter)) {
        writer.write(result);
      }
    } catch (IOException exception) {
      System.out.println("Error!");
    }
  }

  public static void serialize(Object obj) {
    try (FileOutputStream fileOutputStream = new FileOutputStream(
            "d:\\JavaLearningProjects\\AnimalWars2\\serial\\" + obj.toString() + ".info");
         ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
      objectOutputStream.writeObject(obj);
    } catch (IOException e) {
      System.out.println("Serialization error");
      e.printStackTrace();
    }
  }

  public static Animal deserialize(String objName) {
    try (FileInputStream fileInputStream = new FileInputStream(
            "d:\\JavaLearningProjects\\AnimalWars2\\serial\\" + objName + ".info");
         ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
      return (Animal) objectInputStream.readObject();
    } catch (IOException | ClassNotFoundException e) {
      System.out.println("Deserialization error");
      e.printStackTrace();
      return null;
    }
  }

}
