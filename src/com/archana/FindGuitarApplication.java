package com.archana;

public class FindGuitarApplication {

    public static void main(String[] args) {
	    Inventory inventory = new Inventory();

	    //Adding Guitars
	    inventory.addGuitar("123", 220, "AAA", "BB", "CC", "DD");
	    inventory.addGuitar("133", 330, "EEE", "FF", "GG", "HH");
	    inventory.addGuitar("136", 330, "AAA", "JJ", "GG", "KK");

        System.out.println("Matching Guitars : " + inventory.searchGuitar(inventory.getGuitar("133")));
    }
}
