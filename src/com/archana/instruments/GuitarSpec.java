package com.archana.instruments;


import com.archana.specs.Builder;
import com.archana.specs.Type;
import com.archana.specs.Wood;

public class GuitarSpec extends InstrumentSpec {

    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
        super(builder, model, type, backWood, topWood);
    }

    @Override
    public boolean matches(InstrumentSpec requiredSpec) {
        return (requiredSpec instanceof GuitarSpec) && super.matches(requiredSpec);
    }
}
