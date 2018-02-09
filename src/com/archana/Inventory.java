package com.archana;


import com.archana.instruments.Guitar;
import com.archana.instruments.GuitarSpec;
import com.archana.instruments.Instrument;
import com.archana.instruments.InstrumentSpec;
import com.archana.instruments.Mandolin;
import com.archana.instruments.MandolinSpec;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {
   private List<Instrument> instruments;

    public Inventory() {
        instruments = new ArrayList();
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
        Instrument instrument;
        if(spec instanceof GuitarSpec)
            instrument = new Guitar(serialNumber, price, (GuitarSpec) spec);
        else
            instrument = new Mandolin(serialNumber, price, (MandolinSpec) spec);
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

    public List<Guitar> searchGuitar(GuitarSpec requiredSpec) {
        List<Guitar> matchingGuitars = new ArrayList<Guitar>();
        for(Iterator i = instruments.iterator(); i.hasNext();) {
            if(i.next() instanceof Guitar) {
                Guitar guitar = (Guitar) i.next();
                if((guitar.getSpec().matches(requiredSpec))) {
                    matchingGuitars.add(guitar);
                }
            }
        }
        return matchingGuitars;
    }

    public List<Mandolin> searchMandolin(MandolinSpec requiredSpec) {
        List<Mandolin> matchingMandolins = new ArrayList<Mandolin>();
        for(Iterator i = instruments.iterator(); i.hasNext();) {
            if(i.next() instanceof Mandolin) {
                Mandolin mandolin = (Mandolin) i.next();
                if((mandolin.getSpec().matches(requiredSpec))) {
                    matchingMandolins.add(mandolin);
                }

            }
        }
        return matchingMandolins;
    }
}

