package com.archana;


import com.archana.domain.Builder;
import com.archana.domain.Type;
import com.archana.domain.Wood;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
   private List<Guitar> guitars = new ArrayList();

    public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood, Wood topWood) {
       GuitarSpec guitarSpec = new GuitarSpec(builder, model, type, backWood, topWood);
       Guitar guitar = new Guitar(serialNumber, price, guitarSpec);
       guitars.add(guitar);
   }

   public Guitar getGuitar(String serialNumber) {
       for(Guitar guitar : guitars) {
           if(serialNumber.equals(guitar.getSerialNumber())) {
               return guitar;
           }
       }
       return null;
   }

    public List<Guitar> searchGuitar(GuitarSpec requiredSpec) {
        List<Guitar> matchingGuitars = new ArrayList<Guitar>();
        for(Guitar guitar : guitars) {
            if((guitar.getGuitarSpec().matches(requiredSpec))) {
                matchingGuitars.add(guitar);
            }
        }
        return matchingGuitars;
    }
}

