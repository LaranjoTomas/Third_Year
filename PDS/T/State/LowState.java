package State;

public class LowState implements State {
    private final String statename = "Low";

    @Override
    public void pull(CeilingFan fan) {
        fan.setState(new MediumState());
        System.out.println("Turning to medium speed.");
    }

    @Override
    public String getState() {
        return statename;
    }
}
