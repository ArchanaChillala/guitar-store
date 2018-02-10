package com.archana.instruments;

public class Instrument {
    private String serialNumber;
    private double price;
    private InstrumentSpec spec;

    public Instrument(String serialNumber, double price, InstrumentSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
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

    public InstrumentSpec getSpec() {
        return spec;
    }

    @Override
    public String toString() {
        return "Instrument {" +
            "serialNumber='" + serialNumber + '\'' +
            ", builder='" + spec.getBuilder() + '\'' +
            ", model='" + spec.getModel() + '\'' +
            ", price='" + price + '\'' +
            '}';
    }
}
