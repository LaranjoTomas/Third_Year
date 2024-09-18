package State;

public class MediumState implements State {
    private final String statename = "Medium";

    public void pull(CeilingFan fan) {
        fan.setState(new HighState());
        System.out.println("Turning to high speed.");
    }

    public String getState() {
        return statename;
    }
}
