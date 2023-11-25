package com.nancheung.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DishOperator {
    private Dish[] dishes;
    private ArrayList<Dish> dishArray = new ArrayList<>();

    public DishOperator(Dish[] dishes) {
        this.dishes = dishes;
        dishArray.addAll(Arrays.asList(this.dishes));
    }
    public void showAll(){
        for (Dish dish : dishArray) {
            for (int i = 0; i < 48; i++) {
                System.out.print("=");
            }
            System.out.println("\n");
            System.out.println("Dish's name: " + dish.getDishName());
            System.out.println("Dish's Price: " + dish.getDishPrice() + " RMB");
            System.out.println("Dish's Description: " + dish.getDescription());
            System.out.println("Suitable number of people for dining: " + dish.getSuitableNumberOfPeople());
        }
    }
    public void removeDish(String dishName){
        for (int i = dishArray.size()-1; i > 0 ; i--) {
            if (dishArray.get(i).getDishName().equals(dishName)){
                dishArray.remove(dishArray.get(i));
                System.out.println("Remove successfully!!");
                return;
            }
        }
        System.out.println("Could not find the dish you want to remove!!");
    }

    public void addDishByAsking(){
        Scanner scanner = new Scanner(System.in);
        Dish newDish = new Dish();
        System.out.print("Please input the dish's name you want add: ");
        newDish.setDishName(scanner.next());
        System.out.print("Please input the dish's price you want add: ");
        newDish.setDishPrice(scanner.nextDouble());
        System.out.print("Please input the dish's description you want add: ");
        newDish.setDescription(scanner.next());
        System.out.print("Please input the dish's 'suitable number of people for dining' you want add: ");
        newDish.setSuitableNumberOfPeople(scanner.nextInt());
        if (dishArray.add(newDish)){
            System.out.println("Already added this dish, information is: ");
            System.out.println("Name: " + dishArray.get(dishArray.size()-1).getDishName() + "\nPrice: " + dishArray.get(dishArray.size()-1).getDishPrice()
            + "\nDescription: " + dishArray.get(dishArray.size()-1).getDescription() + "\nSuitable number of people: " + dishArray.get(dishArray.size()-1).getSuitableNumberOfPeople());
        }else {
            System.out.println("Can't add this new dish!! ");
        }
    }

    public boolean addDishByGenerator(String dishName, double dishPrice, String description, int suitablenumberofpeople){
        Dish newDish = new Dish(dishName,dishPrice,description,suitablenumberofpeople);
        if (dishArray.add(newDish)){
            System.out.println("Already added this dish, information is: ");
            System.out.println("Name: " + dishArray.get(dishArray.size()-1).getDishName() + "\nPrice: " + dishArray.get(dishArray.size()-1).getDishPrice()
                    + "\nDescription: " + dishArray.get(dishArray.size()-1).getDescription() + "\nSuitable number of people" + dishArray.get(dishArray.size()-1).getSuitableNumberOfPeople());
            return true;
        }else {
            System.out.println("Can't add this new dish!! ");
            return false;
        }
    }
}
