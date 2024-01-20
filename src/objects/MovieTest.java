package com.nancheung.objects;


import java.util.Scanner;

public class MovieTest {
    public static void main(String[] args) {
        Movie[] movies = new Movie[3];
        movies[0] = new Movie(1,"aaa",18.8);
        movies[1] = new Movie(2,"bbb",28.8);
        movies[2] = new Movie(3,"ccc",38.8);
        MovieOperator o1 = new MovieOperator(movies);
//        o1.printAll();
//        o1.searchMovieById(askId());
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("======Movie info system======\n1. search all movie info.\n2. search one movie info with id.");
            System.out.println("please select service: ");
            int command = sc.nextInt();
            switch (command){
                case 1: o1.printAll();break;
                case 2: o1.searchMovieById(askId());break;
                default:
                    System.out.println("Invalid input command! please try again! ");
                }
        }
    }
    public static int askId(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("please input a number that you what search ID: ");
        return scanner.nextInt();
    }
}
