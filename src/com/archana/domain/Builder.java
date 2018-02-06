package com.archana.domain;

public enum Builder {
    FENDER,
    MARTIN,
    GIBSON,
    COLLINGS;

    @Override
    public String toString() {
        switch(this) {
            case FENDER: return "Fender";
            case MARTIN: return "Martin";
            case GIBSON: return "Gibson";
            case COLLINGS: return "Collings";
            default: return "";
        }
    }
}
