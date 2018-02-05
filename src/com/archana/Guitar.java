package com.archana;


public class Guitar extends GuitarSpec {

    private String serialNumber;
    private double price;

    public Guitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood, Wood topWood) {
        super(builder, model, type, backWood, topWood);
        this.serialNumber = serialNumber;
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Guitar {" +
            "serialNumber='" + serialNumber + '\'' +
            ", builder='" + super.getBuilder() + '\'' +
            ", model='" + super.getModel() + '\'' +
            '}';
    }
}
