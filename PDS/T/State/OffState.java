package State;

public class OffState implements State {
    private final String statename = "Off";

    @Override
    public void pull(CeilingFan fan) {
        fan.setState(new LowState());
        System.out.println("Turning on to low speed.");
    }

    @Override
    public String getState() {
        return statename;
    }
}
