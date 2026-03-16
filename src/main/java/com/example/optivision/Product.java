package com.example.optivision;

public class Product {
    private String name;
    private String brand;
    private double price;
    private String image;

    public Product(String name, String brand, double price, String image) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.image = image;
    }

    public String getName() { return name; }
    public String getBrand() { return brand; }
    public double getPrice() { return price; }
    public String getImage() { return image; }
}