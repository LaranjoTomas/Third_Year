package lab13.XIII2;

import java.util.Iterator;

public class RiverPort implements Port {

    private SeaPort seaport;
    private RiverLogger riverlogger;

    @Override
    public Iterator<String> iterator() {
        return null;
    }

    public RiverPort(SeaPort seaport, RiverLogger riverlogger) {
        this.seaport = seaport;
        this.riverlogger = riverlogger;
    }

    public RiverPort create(SeaPort seaport, RiverLogger riverlogger) {
        return new RiverPort(seaport, riverlogger);
    }

    @Override
    public boolean add(String ref, Ship p) {
        if (((CargoShip) p).capacity() > 10) {
            riverlogger.log("Ship: " + p + " is overloaded.");
            return false;
        } else if (((PassengerShip) p).passenger() > 10) {
            riverlogger.log("Ship: " + p + " is overloaded.");
            return false;
        } else {
            riverlogger.log("Ship: " + p + " was added to the port.");
            seaport.add(ref, p);
            return true;
        }
    }

    @Override
    public boolean exists(String ref) {
        boolean exists = seaport.exists(ref);
        riverlogger.log("Ship exists!");
        return exists;
    }

    @Override
    public Ship remove(String ref) {
        Ship removed = seaport.remove(ref);
        riverlogger.log("Ship exists!");
        return removed;
    }

}
