package com.animalwars.dao;

import com.animalwars.api.dao.IAnimalDao;
import com.animalwars.entities.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AnimalDao implements IAnimalDao {

  private List<Animal> animalList = new ArrayList<>();

  public void addAnimal(Animal animal) {
    animalList.add(animal);
  }

  public List<Animal> getAnimals() {
    Connection con = null;
    Statement stmt = null;
    try {
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/war?serverTimezone=UTC", "root", "narrenturm");
      try {
        stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM animal WHERE id = '1' ");
        if (rs.next()) {
          Tiger tiger = new Tiger();
          tiger.setName(rs.getString("name"));
          tiger.setEnergy(rs.getInt("energy"));
          tiger.setHit(rs.getInt("hit"));
          animalList.add(tiger);
        }
        rs = stmt.executeQuery("SELECT * FROM animal WHERE id = '2' ");
        if (rs.next()) {
          Lion lion = new Lion();
          lion.setName(rs.getString("name"));
          lion.setEnergy(rs.getInt("energy"));
          lion.setHit(rs.getInt("hit"));
          animalList.add(lion);
        }
        rs = stmt.executeQuery("SELECT * FROM animal WHERE id = '3' ");
        if (rs.next()) {
          Lynx lynx = new Lynx();
          lynx.setName(rs.getString("name"));
          lynx.setEnergy(rs.getInt("energy"));
          lynx.setHit(rs.getInt("hit"));
          animalList.add(lynx);
        }
        rs = stmt.executeQuery("SELECT * FROM animal WHERE id = '4' ");
        if (rs.next()) {
          Moose moose = new Moose();
          moose.setName(rs.getString("name"));
          moose.setEnergy(rs.getInt("energy"));
          moose.setHit(rs.getInt("hit"));
          animalList.add(moose);
        }
      } catch (SQLException e) {
        e.printStackTrace();
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }

    return animalList;
  }
}
