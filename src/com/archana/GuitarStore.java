package com.archana;

import static com.archana.domain.Builder.*;
import static com.archana.domain.Type.ACOUSTIC;
import static com.archana.domain.Type.ELECTRIC;
import static com.archana.domain.Wood.*;

public class GuitarStore {

    public static void main(String[] args) {
	    Inventory inventory = new Inventory();
        loadGuitarsTo(inventory);

	    GuitarSpec searchItem = new GuitarSpec(COLLINGS, "FF", ELECTRIC, MAPLE, BRAZILIAN_ROSEWOOD);
	    System.out.println("Matching Guitars : " + inventory.searchGuitar(searchItem));
    }

    private static void loadGuitarsTo(Inventory inventory) {
        inventory.addGuitar("123", 220, FENDER, "BB", ELECTRIC, INDIAN_ROSEWOOD, MAHOGANY);
        inventory.addGuitar("133", 330, GIBSON, "FF", ACOUSTIC, MAPLE, INDIAN_ROSEWOOD);
        inventory.addGuitar("136", 330, MARTIN, "JJ", ACOUSTIC, MAPLE, BRAZILIAN_ROSEWOOD);
    }
}
