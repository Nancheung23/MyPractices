package com.nancheung.api;

public class Dish {
    private String dishName;
    private double dishPrice;
    private String description;
    private int suitableNumberOfPeople;


    public Dish() {
    }
    public Dish(String dishName, double dishPrice, String description, int suitableNumberOfPeople) {
        this.dishName = dishName;
        this.dishPrice = dishPrice;
        this.description = description;
        this.suitableNumberOfPeople = suitableNumberOfPeople;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public double getDishPrice() {
        return dishPrice;
    }

    public void setDishPrice(double dishPrice) {
        this.dishPrice = (dishPrice>0.00 ? dishPrice : -1);
        if (dishPrice==-1){
            System.out.println("Wrong setting for dishPrice!");
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSuitableNumberOfPeople() {
        return suitableNumberOfPeople;
    }

    public void setSuitableNumberOfPeople(int suitableNumberOfPeople) {
        this.suitableNumberOfPeople = (suitableNumberOfPeople>0 ? suitableNumberOfPeople : -1);
        if (suitableNumberOfPeople==-1){
            System.out.println("Wrong setting for dishPrice!");
        }
    }
}
