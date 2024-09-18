package lab06.Movies;

public class Place {
    
    private final String location;

    public Place(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return location;
    }
}
