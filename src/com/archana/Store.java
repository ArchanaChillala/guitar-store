package com.archana;

import com.archana.instruments.GuitarSpec;
import com.archana.instruments.MandolinSpec;

import static com.archana.specs.Builder.*;
import static com.archana.specs.Style.A;
import static com.archana.specs.Style.F;
import static com.archana.specs.Type.ACOUSTIC;
import static com.archana.specs.Type.ELECTRIC;
import static com.archana.specs.Wood.*;

public class Store {

    public static void main(String[] args) {
	    Inventory inventory = new Inventory();
        loadInstrumentsTo(inventory);

	    GuitarSpec searchItem = new GuitarSpec(COLLINGS, "FF", ELECTRIC, MAPLE, BRAZILIAN_ROSEWOOD);
	    System.out.println("Matching Instruments : " + inventory.searchGuitar(searchItem));
    }

    private static void loadInstrumentsTo(Inventory inventory) {

        //Loading Guitars
        inventory.addInstrument("123", 220, new GuitarSpec(FENDER, "BB", ELECTRIC, INDIAN_ROSEWOOD, MAHOGANY));
        inventory.addInstrument("133", 330, new GuitarSpec(GIBSON, "FF", ACOUSTIC, MAPLE, INDIAN_ROSEWOOD));
        inventory.addInstrument("136", 330, new GuitarSpec(MARTIN, "JJ", ACOUSTIC, MAPLE, BRAZILIAN_ROSEWOOD));

        //Loading Mandolins
        inventory.addInstrument("123", 220, new MandolinSpec(FENDER, "BB", F, ELECTRIC, INDIAN_ROSEWOOD, MAHOGANY));
        inventory.addInstrument("133", 330, new MandolinSpec(GIBSON, "FF", F, ACOUSTIC, MAPLE, INDIAN_ROSEWOOD));
        inventory.addInstrument("136", 330, new MandolinSpec(MARTIN, "JJ", A, ACOUSTIC, MAPLE, BRAZILIAN_ROSEWOOD));
    }
}
