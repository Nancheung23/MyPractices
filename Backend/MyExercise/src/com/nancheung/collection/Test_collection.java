package com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Test_collection {
    public static void main(String[] args) {
        Collection<Movie> movies = new ArrayList<>();
        movies.add(new Movie("a", 9.7, "A"));
        movies.add(new Movie("b", 9.6, "B"));
        movies.add(new Movie("c", 9.5, "C"));
        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }
    }
}
