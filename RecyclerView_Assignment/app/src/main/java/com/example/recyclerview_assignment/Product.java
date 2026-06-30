package com.example.recyclerview_assignment;



public class Product {

    int image;
    String name;
    String price;
    String description;

    public Product(int image, String name, String price,String description) {
        this.image = image;
        this.name = name;
        this.price = price;
        this.description=description;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
}
