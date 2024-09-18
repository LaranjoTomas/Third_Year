package lab13.XIII2;

public class CargoShip implements Ship {

    private String code;
    private String name;
    private double capacity;

    public CargoShip(String code, String name, double capacity) {
        this.code = code;
        this.name = name;
        this.capacity = capacity;
    }

    public double capacity(){
        return capacity;
    }

    @Override
    public String code() {
        return code;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String toString() {
        return "CargoShip [code=" + code + ", name=" + name + ", cargo=" + capacity + "]";
    }
}
