package State;

public class CeilingFan {
    private State state;

    public CeilingFan() {
        state = new OffState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void pull() {
        state.pull(this);
    }

    public String getState() {
        return state.getState();
    }
}
