package State;

public class HighState implements State {
    private final String statename = "High";

    public void pull(CeilingFan fan) {
        fan.setState(new OffState());
        System.out.println("Turning off.");
    }

    public String getState() {
        return statename;
    }
}
