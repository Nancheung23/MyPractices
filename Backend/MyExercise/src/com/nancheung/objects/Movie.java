package com.nancheung.objects;

public class Movie {
    // Movie class, only contains id, name and price information
    private int id;
    private String name;
    private double price;

    public Movie() {
    }

    public Movie(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id<=0){
            System.out.println("Invalid id set");
        }else {this.id = id;}
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<=0){
            System.out.println("Invalid price set");
        }else {this.price = price;}
    }
}
