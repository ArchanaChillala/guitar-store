package com.archana.instruments;


import java.util.HashMap;
import java.util.Map;

public class InstrumentSpec {
    private Map properties;

    public InstrumentSpec(Map properties) {
        if(properties == null)
            this.properties = new HashMap();
        else
            this.properties = new HashMap(properties);
    }

    public Map getProperties() {
        return properties;
    }

    public Object getProperty(String propertyName) {
        return properties.get(propertyName);
    }

    public boolean matches(InstrumentSpec requiredSpec) {
        for(Object propertyName : properties.keySet()) {
            String property = (String) propertyName;
            if(!properties.get(property).equals(requiredSpec.getProperty(property))) {
                return false;
            }
        }
        return true;
    }
}