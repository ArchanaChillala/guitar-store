package com.archana;


import com.archana.instruments.Instrument;
import com.archana.instruments.InstrumentSpec;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
   private List<Instrument> instruments;

    public Inventory() {
        instruments = new ArrayList();
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
        Instrument instrument = new Instrument(serialNumber, price, spec);
        instruments.add(instrument);
   }

   public Instrument getInstrument(String serialNumber) {
       for(Instrument instrument : instruments) {
           if(serialNumber.equals(instrument.getSerialNumber())) {
               return instrument;
           }
       }
       return null;
   }

    public List<Instrument> searchInstrument(InstrumentSpec requiredSpec) {
        List<Instrument> matchingInstruments = new ArrayList<Instrument>();
        for(Instrument instrument : instruments) {
            if((instrument.getSpec().matches(requiredSpec))) {
                matchingInstruments.add(instrument);
            }
        }
        return matchingInstruments;
    }
}

