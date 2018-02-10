package com.archana.instruments;


import com.archana.specs.Builder;
import com.archana.specs.Type;
import com.archana.specs.Wood;

import static org.apache.commons.lang.StringUtils.isNotBlank;

public class InstrumentSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;

    public InstrumentSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public boolean matches(InstrumentSpec requiredSpec) {
        return builder.equals(requiredSpec.getBuilder()) ||
            isNotBlank(model) && model.equalsIgnoreCase(requiredSpec.getModel()) ||
            type.equals(requiredSpec.getType()) ||
            backWood.equals(requiredSpec.getBackWood()) ||
            topWood.equals(requiredSpec.getTopWood());
    }
}