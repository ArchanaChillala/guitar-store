package com.archana;

import com.archana.instruments.Instrument;
import com.archana.instruments.InstrumentSpec;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.archana.specs.InstrumentType.*;
import static com.archana.specs.Builder.*;
import static com.archana.specs.Style.*;
import static com.archana.specs.Type.*;
import static com.archana.specs.Wood.*;

public class Store {

    public static void main(String[] args) {
	    Inventory inventory = new Inventory();
        loadInstrumentsTo(inventory);

        Map properties = new HashMap();
        properties.put("builder", FENDER);
        properties.put("model", "FF");
        properties.put("type", ELECTRIC);
        properties.put("topWood", MAPLE);
        properties.put("backWood", INDIAN_ROSEWOOD);

        InstrumentSpec searchItem = new InstrumentSpec(properties);
	    List<Instrument> matchingInstruments = inventory.searchInstrument(searchItem);
	    if(matchingInstruments.isEmpty())
            System.out.println("Sorry, No matching instruments found ");
	    else
            System.out.println("Matching Instruments : " + matchingInstruments);
    }

    private static void loadInstrumentsTo(Inventory inventory) {

        //Loading Guitars
        Map properties = new HashMap();
        properties.put("builder", FENDER);
        properties.put("model", "FF");
        properties.put("type", ELECTRIC);
        properties.put("topWood", MAPLE);
        properties.put("backWood", INDIAN_ROSEWOOD);
        inventory.addInstrument("123", 220, GUITAR, new InstrumentSpec(properties));

        //Loading Mandolins
        properties.put("builder", GIBSON);
        properties.put("model", "FF");
        properties.put("type", ACOUSTIC);
        properties.put("style", F);
        properties.put("topWood", MAHOGANY);
        properties.put("backWood", BRAZILIAN_ROSEWOOD);
        inventory.addInstrument("125", 220, MANDOLIN, new InstrumentSpec(properties));

        properties.put("model", "GG");
        properties.put("type", ELECTRIC);
        properties.put("style", A);
        inventory.addInstrument("129", 550, MANDOLIN, new InstrumentSpec(properties));
    }
}
