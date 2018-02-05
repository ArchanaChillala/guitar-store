package com.archana;

import java.util.ArrayList;
import java.util.List;

import static org.apache.commons.lang.StringUtils.isNotBlank;

public class SearchTool {
    private Inventory inventory;

    public SearchTool(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Guitar> searchGuitar(Guitar requiredGuitar) {
        List<Guitar> matchingGuitars = new ArrayList<Guitar>();
        for(Guitar guitar : inventory.getGuitars()) {
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
