package com.archana.instruments;

public enum InstrumentType {
    GUITAR,
    MANDOLIN,
    BANJO,
    FIDDLE;

    @Override
    public String toString() {
        switch(this) {
            case GUITAR: return "Guitar";
            case MANDOLIN: return "Mandolin";
            case BANJO: return "Banjo";
            case FIDDLE: return "Fiddle";
            default: return "";
        }
    }
}


