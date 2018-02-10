package com.archana;

import com.archana.instruments.GuitarSpec;
import com.archana.instruments.MandolinSpec;

import static com.archana.instruments.InstrumentType.GUITAR;
import static com.archana.instruments.InstrumentType.MANDOLIN;
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
	    System.out.println("Matching Instruments : " + inventory.searchInstrument(searchItem));
    }

    private static void loadInstrumentsTo(Inventory inventory) {

        //Loading Guitars
        inventory.addInstrument("123", 220, GUITAR, new GuitarSpec(FENDER, "BB", ELECTRIC, INDIAN_ROSEWOOD, MAHOGANY));
        inventory.addInstrument("133", 330, GUITAR,new GuitarSpec(GIBSON, "FF", ACOUSTIC, MAPLE, INDIAN_ROSEWOOD));
        inventory.addInstrument("136", 330, GUITAR, new GuitarSpec(MARTIN, "JJ", ACOUSTIC, MAPLE, BRAZILIAN_ROSEWOOD));

        //Loading Mandolins
        inventory.addInstrument("125", 220, MANDOLIN, new MandolinSpec(FENDER, "BB", F, ELECTRIC, INDIAN_ROSEWOOD, MAHOGANY));
        inventory.addInstrument("138", 330, MANDOLIN, new MandolinSpec(GIBSON, "FF", F, ACOUSTIC, MAPLE, INDIAN_ROSEWOOD));
        inventory.addInstrument("147", 330, MANDOLIN, new MandolinSpec(MARTIN, "JJ", A, ACOUSTIC, MAPLE, BRAZILIAN_ROSEWOOD));
    }
}
