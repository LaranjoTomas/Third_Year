package lab06.Movies;

import java.util.List;

public class Movie {
   private final String title;
   private final int year;
   private final Person director;
   private final Person writer;
   private final String series;
   private final List<Person> cast;
   private final List<Place> locations;
   private final List<String> languages;
   private final List<String> genres;
   private final boolean isTelevision;
   private final boolean isNetflix;
   private final boolean isIndependent;

   private Movie(
      final String movieTitle,
      final int movieYear,
      final Person movieDirector,
      final Person movieWriter,
      final String movieSeries,
      final List<Person> movieCast,
      final List<Place> movieLocations,
      final List<String> movieLanguages,
      final List<String> movieGenres,
      final boolean television,
      final boolean netflix,
      final boolean independent) {
      this.title = movieTitle;
      this.year = movieYear;
      this.director = movieDirector;
      this.writer = movieWriter;
      this.series = movieSeries;
      this.cast = movieCast;
      this.locations = movieLocations;
      this.languages = movieLanguages;
      this.genres = movieGenres;
      this.isTelevision = television;
      this.isNetflix = netflix;
      this.isIndependent = independent;
   }

   @Override
   public String toString() {
      return "Movie{\n" +
            "title='" + title + "',\n" +
            "year=" + year + ",\n" +
            "director=" + director + ",\n" +
            "writer=" + writer + ",\n" +
            "series='" + series + "',\n" +
            "cast=" + cast + ",\n" +
            "locations=" + locations + ",\n" +
            "languages=" + languages + ",\n" +
            "genres=" + genres + ",\n" +
            "isTelevision=" + isTelevision + ",\n" +
            "isNetflix=" + isNetflix + ",\n" +
            "isIndependent=" + isIndependent + "\n" +
            '}' + "\n";
   }

   public static class MovieBuilder {
    
      private String title;
      private int year;
      private Person director;
      private Person writer;
      private String series;
      private List<Person> cast;
      private List<Place> locations;
      private List<String> languages;
      private List<String> genres;
      private boolean isTelevision;
      private boolean isNetflix;
      private boolean isIndependent;

      public MovieBuilder(String title, int year) {
         this.title = title;
         this.year = year;
      }
  
      public MovieBuilder setDirector(Person director) {
         this.director = director;
         return this;
      }
  
      public MovieBuilder setWriter(Person writer) {
         this.writer = writer;
         return this;
      }
  
      public MovieBuilder setSeries(String series) {
         this.series = series;
         return this;
      }
  
      public MovieBuilder setCast(List<Person> cast) {
         this.cast = cast;
         return this;
      }
  
      public MovieBuilder setLocations(List<Place> locations) {
         this.locations = locations;
         return this;
      }
  
      public MovieBuilder setLanguages(List<String> languages) {
         this.languages = languages;
         return this;
      }
  
      public MovieBuilder setGenres(List<String> genres) {
         this.genres = genres;
         return this;
      }
  
      public MovieBuilder setIsTelevision(boolean isTelevision) {
         this.isTelevision = isTelevision;
         return this;
      }
  
      public MovieBuilder setIsNetflix(boolean isNetflix) {
         this.isNetflix = isNetflix;
         return this;
      }
  
      public MovieBuilder setIsIndependent(boolean isIndependent) {
         this.isIndependent = isIndependent;
         return this;
      }
  
      public Movie build() {
         return new Movie(title, year, director, writer, series, cast, locations, languages, genres, isTelevision, isNetflix, isIndependent);
      }
   }
}
