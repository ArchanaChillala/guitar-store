package com.archana;

import static com.archana.Builder.FENDER;
import static com.archana.Builder.GIBSON;
import static com.archana.Builder.MARTIN;
import static com.archana.Type.ACOUSTIC;
import static com.archana.Type.ELECTRIC;
import static com.archana.Wood.*;

public class GuitarStore {

    public static void main(String[] args) {
	    Inventory inventory = new Inventory();

	    //Loading Guitars to Inventory
	    inventory.addGuitar("123", 220, FENDER, "BB", ELECTRIC, INDIAN_ROSEWOOD, MAHOGANY);
	    inventory.addGuitar("133", 330, GIBSON, "FF", ACOUSTIC, MAPLE, INDIAN_ROSEWOOD);
	    inventory.addGuitar("136", 330, MARTIN, "JJ", ACOUSTIC, MAPLE, BRAZILIAN_ROSEWOOD);

	    SearchTool searchTool = new SearchTool(inventory);
        System.out.println("Matching Guitars : " + searchTool.searchGuitar(inventory.getGuitar("133")));
    }
}
