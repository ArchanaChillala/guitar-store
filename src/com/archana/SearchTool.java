package com.archana;

import com.archana.domain.Builder;
import com.archana.domain.Type;
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

    private boolean isGuitarMatching(GuitarSpec requiredSpec, GuitarSpec spec) {
        Builder builder = requiredSpec.getBuilder();
        String model = requiredSpec.getModel();
        Type type = requiredSpec.getType();
        Wood backWood = requiredSpec.getBackWood();
        Wood topWood = requiredSpec.getTopWood();

        return builder.equals(spec.getBuilder()) ||
            isNotBlank(model) && model.equalsIgnoreCase(spec.getModel()) ||
            type.equals(spec.getType()) ||
            backWood.equals(spec.getBackWood()) ||
            topWood.equals(spec.getTopWood());
    }
}
