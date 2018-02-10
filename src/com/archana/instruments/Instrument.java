package com.archana.instruments;

public class Instrument {
    private String serialNumber;
    private double price;
    private InstrumentType type;
    private InstrumentSpec spec;

    public Instrument(String serialNumber, double price, InstrumentType type, InstrumentSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.type = type;
        this.spec = spec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public InstrumentType getType() {
        return type;
    }

    public InstrumentSpec getSpec() {
        return spec;
    }

    @Override
    public String toString() {
        return "Instrument {" +
            "serialNumber='" + serialNumber + '\'' +
            ", type='" + type + '\'' +
            ", builder='" + spec.getBuilder() + '\'' +
            ", model='" + spec.getModel() + '\'' +
            ", price='" + price + '\'' +
            '}';
    }
}
