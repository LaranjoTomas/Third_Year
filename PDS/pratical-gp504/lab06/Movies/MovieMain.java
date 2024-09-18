package lab06.Movies;

import java.util.List;

public class MovieMain {
    public static void main(String[] args) {
        
        Movie movie1 = new Movie.MovieBuilder("Kingsman: The Secret Service", 2014)
            .setDirector(new Person("Matthew Vaughn"))
            .setWriter(new Person("Jane Goldman"))
            .setSeries("Kingsman")
            .setCast(List.of(new Person("Taron Egerton"), new Person("Colin Firth"), new Person("Samuel L. Jackson")))
            .setLocations(List.of(new Place("London"), new Place("Kent")))
            .setLanguages(List.of("English"))
            .setGenres(List.of("Action", "Adventure", "Comedy"))
            .setIsTelevision(false)
            .setIsNetflix(false)
            .setIsIndependent(false)
            .build();
        

        Movie movie2 = new Movie.MovieBuilder("Suzume no Tojimari", 2021)
            .setDirector(new Person("Yûichi Satô"))
            .setWriter(new Person("Yûichi Satô"))
            .setSeries("Suzume no Tojimari")
            .setCast(List.of(new Person("Suzu Hirose"), new Person("Shôhei Miura"), new Person("Mackenyu")))
            .setLocations(List.of(new Place("Tokyo")))
            .setLanguages(List.of("Japanese"))
            .setGenres(List.of("Drama", "Romance"))
            .setIsTelevision(false)
            .setIsNetflix(false)
            .setIsIndependent(false)
            .build();


        System.out.println(movie1.toString());
        System.out.println(movie2.toString());
    }
}
