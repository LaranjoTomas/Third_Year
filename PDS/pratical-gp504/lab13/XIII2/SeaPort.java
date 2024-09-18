package lab13.XIII2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class SeaPort implements Port {

    private List<Ship> portList = new ArrayList<>();
    private HashMap<String, Ship> portListMap = new HashMap<>();

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private Iterator<Map.Entry<String, Ship>> mapIterator = portListMap.entrySet().iterator();

            @Override
            public boolean hasNext() {
                return mapIterator.hasNext();
            }

            @Override
            public String next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Map.Entry<String, Ship> entry = mapIterator.next();
                return "Ref: " + entry.getKey() + " - " + entry.getValue().toString();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public boolean add(String ref, Ship p) {
        if (!portListMap.containsValue(p)) {
            portList.add(p);
            portListMap.put(ref, p);
            return true;
        } else if (portListMap.containsKey(ref)) {
            portList.add(p);
            portListMap.put(ref, p);
            return true;
        }
        return false;
    }

    @Override
    public boolean exists(String ref) {
        if (!portListMap.containsKey(ref)) {
            return false;
        }
        return true;
    }

    @Override
    public Ship remove(String ref) {
        if (portListMap.containsKey(ref)) {
            return portListMap.remove(ref);
        }
        return null;
    }
}
