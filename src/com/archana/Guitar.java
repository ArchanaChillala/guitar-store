package com.archana;


public class Guitar {
    private String serialNumber;
    private double price;
    private String builder;
    private String model;
    private String backWood;
    private String topWood;

    public Guitar(String serialNumber, double price, String builder, String model, String backWood, String topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public String getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public String getBackWood() {
        return backWood;
    }

    public String getTopWood() {
        return topWood;
    }

    @Override
    public String toString() {
        return "Guitar {" +
            "serialNumber='" + serialNumber + '\'' +
            ", builder='" + builder + '\'' +
            ", model='" + model + '\'' +
            '}';
    }
}
