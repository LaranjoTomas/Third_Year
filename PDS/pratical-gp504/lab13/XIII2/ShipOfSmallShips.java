package lab13.XIII2;

import java.util.ArrayList;
import java.util.List;

public class ShipOfSmallShips implements Ship {

    private String code;
    private String name;
    private List<PassengerShip> smallerships = new ArrayList<>();

    public ShipOfSmallShips(String code, String name) {
        this.name = name;
        this.code = code;
    }

    @Override
    public String code() {
        return code;
    }

    @Override
    public String name() {
        return name;
    }

    public int capacity() {
        int total = 0;
        for (PassengerShip s : smallerships) {
            total += s.passenger();
        }
        return total;
    }

    public Ship remove(Ship p) {
        smallerships.remove(p);
        return p;
    }

    public Ship add(PassengerShip p) {
        PassengerShip me = new PassengerShip(p.code(), p.name(), p.passenger());
        smallerships.add(me);
        return me;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ref: ").append(code).append(" - Container Ship with ").append(smallerships.size())
                .append(" ships. Total passengers capacity : ").append(capacity()).append("\n");
        for (PassengerShip ship : smallerships) {
            sb.append("\t").append(ship.toString()).append("\n");
        }
        return sb.toString();
    }
}
