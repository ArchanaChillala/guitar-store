package com.archana;


import java.util.ArrayList;
import java.util.List;

import static org.apache.commons.lang.StringUtils.isNotBlank;

public class Inventory {
   private List<Guitar> guitars = new ArrayList();

   public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood, Wood topWood) {
       Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
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

   public List<Guitar> searchGuitar(Guitar requiredGuitar) {
       List<Guitar> matchingGuitars = new ArrayList<Guitar>();
       for(Guitar guitar : guitars) {
           if(isGuitarAMatch(requiredGuitar, guitar)) {
               matchingGuitars.add(guitar);
           }
       }
      return matchingGuitars;
   }

   private boolean isGuitarAMatch(Guitar requiredGuitar, Guitar guitar) {
       Builder builder = requiredGuitar.getBuilder();
       String model = requiredGuitar.getModel();
       Wood backWood = requiredGuitar.getBackWood();
       Wood topWood = requiredGuitar.getTopWood();

       return builder.equals(guitar.getBuilder()) ||
           isNotBlank(model) && model.equalsIgnoreCase(guitar.getModel()) ||
           backWood.equals(guitar.getBackWood()) ||
           topWood.equals(guitar.getTopWood());
   }
}

