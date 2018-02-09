package com.archana.specs;

public enum Style {
    F, A;

    @Override
    public String toString() {
        switch(this) {
            case F: return "F";
            case A: return "A";
            default: return "";
        }
    }
}
