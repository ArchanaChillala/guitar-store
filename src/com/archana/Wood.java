package com.archana;

public enum Wood {
    INDIAN_ROSEWOOD,
    BRAZILIAN_ROSEWOOD,
    MAHOGANY,
    MAPLE;

    @Override
    public String toString() {
        switch(this) {
            case INDIAN_ROSEWOOD: return "Indian Rosewood";
            case BRAZILIAN_ROSEWOOD: return "Brazilian Rosewood";
            case MAHOGANY: return "Mahogany";
            case MAPLE: return "Maple";
            default: return "";
        }
    }
}
