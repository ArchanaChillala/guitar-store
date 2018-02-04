package com.archana;


import java.util.ArrayList;
import java.util.List;

import static org.apache.commons.lang.StringUtils.isNotBlank;

public class Inventory {
   private List<Guitar> guitars = new ArrayList();

   public void addGuitar(String serialNumber, double price, String builder, String model, String backWood, String topWood) {
       Guitar guitar = new Guitar(serialNumber, price, builder, model, backWood, topWood);
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
       String builder = requiredGuitar.getBuilder();
       String model = requiredGuitar.getModel();
       String backWood = requiredGuitar.getBackWood();
       String topWood = requiredGuitar.getTopWood();

       return isBuilderMatching(builder, guitar) ||
           isModelMatching(model, guitar) ||
           isBackWoodMatching(backWood, guitar) ||
           isTopWoodMatching(topWood, guitar);
   }

   private boolean isBuilderMatching(String builder, Guitar guitar) {
       return isNotBlank(builder) && builder.equalsIgnoreCase(guitar.getBuilder());
   }

   private boolean isModelMatching(String model, Guitar guitar) {
       return isNotBlank(model) && model.equalsIgnoreCase(guitar.getModel());
   }

   private boolean isBackWoodMatching(String backWood, Guitar guitar) {
       return isNotBlank(backWood) && backWood.equalsIgnoreCase(guitar.getBackWood());
   }
   private boolean isTopWoodMatching(String topWood, Guitar guitar) {
       return isNotBlank(topWood) && topWood.equalsIgnoreCase(guitar.getTopWood());
   }

}

