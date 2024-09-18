package lab13.XIII2;

import java.util.ArrayList;
import java.util.List;

public class RiverLogger {
    private List<String> log = new ArrayList<>();

    public void log(String msg) {
        log.add(msg);
    }

    public List<String> getLog() {
        return log;
    }
}
