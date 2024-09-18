package lab13.XIII2;

public class PassengerShip implements Ship {

    private String code;
    private String name;
    private int passenger;

    public PassengerShip(String code, String name, int passenger) {
        this.code = code;
        this.name = name;
        this.passenger = passenger;
    }

    public int passenger() {
        return passenger;
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
        return "PassengerShip [code=" + code + ", name=" + name + ", passengers=" + passenger + "]" + "\n";
    }

}
