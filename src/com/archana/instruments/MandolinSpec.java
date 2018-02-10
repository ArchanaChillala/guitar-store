package com.archana.instruments;

import com.archana.specs.Builder;
import com.archana.specs.Style;
import com.archana.specs.Type;
import com.archana.specs.Wood;

public class MandolinSpec extends InstrumentSpec {
    private Style style;

    public MandolinSpec(Builder builder, String model, Style style, Type type, Wood backWood, Wood topWood) {
        super(builder, model, type, backWood, topWood);
        this.style = style;
    }

    public Style getStyle() {
        return style;
    }

    @Override
    public boolean matches(InstrumentSpec requiredSpec) {
        if(requiredSpec instanceof MandolinSpec) {
            MandolinSpec spec = (MandolinSpec) requiredSpec;
            if(!style.equals(spec.getStyle()))
                return false;
        }
        if(!super.matches(requiredSpec))
            return false;
        return true;
    }
}
