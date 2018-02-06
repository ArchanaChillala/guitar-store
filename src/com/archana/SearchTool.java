package com.archana;

import com.archana.domain.Builder;
import com.archana.domain.Wood;

import java.util.ArrayList;
import java.util.List;

import static org.apache.commons.lang.StringUtils.isNotBlank;

public class SearchTool {
    private Inventory inventory;

    public SearchTool(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Guitar> searchGuitar(GuitarSpec requiredGuitar) {
        List<Guitar> matchingGuitars = new ArrayList<Guitar>();
        for(Guitar guitar : inventory.getGuitars()) {
            if(isGuitarMatching(requiredGuitar, guitar.getGuitarSpec())) {
                matchingGuitars.add(guitar);
            }
        }
        return matchingGuitars;
    }

    private boolean isGuitarMatching(GuitarSpec requiredGuitar, GuitarSpec spec) {
        Builder builder = requiredGuitar.getBuilder();
        String model = requiredGuitar.getModel();
        Wood backWood = requiredGuitar.getBackWood();
        Wood topWood = requiredGuitar.getTopWood();

        return builder.equals(spec.getBuilder()) ||
            isNotBlank(model) && model.equalsIgnoreCase(spec.getModel()) ||
            backWood.equals(spec.getBackWood()) ||
            topWood.equals(spec.getTopWood());
    }
}
