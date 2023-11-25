package com.nancheung.objects;

public class MovieOperator {
    private Movie[] movies;

    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }

    public void printAll(){
        for (int i = 0; i < movies.length; i++) {
            System.out.printf("Info of %d movie: \n",i+1);
            System.out.printf("ID: %d\n", movies[i].getId());
            System.out.printf("Name: %s\n", movies[i].getName());
            System.out.printf("Price: %.2f\n", movies[i].getPrice());
            System.out.println("-------------------------------------");
        }
    }
    public void searchMovieById(int id) {
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getId() == id) {
                System.out.println("Movie is found, here are its details: ");
                System.out.printf("ID: %d\n", movies[i].getId());
                System.out.printf("Name: %s\n", movies[i].getName());
                System.out.printf("Price: %.2f\n", movies[i].getPrice());
                return;
            }
        }
        System.out.println("Couldn't find this movie, please try again!");
    }
}
