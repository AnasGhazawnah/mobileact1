package com.example.mobileact1;  // ← fixed

public class Tire {

    private String brand;
    private String model;
    private String size;
    private String type;

    public Tire(String brand, String model, String size, String type) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.type = type;
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public String getSize()  { return size;  }
    public String getType()  { return type;  }

    @Override
    public String toString() {
        return brand + " " + model;
    }
}