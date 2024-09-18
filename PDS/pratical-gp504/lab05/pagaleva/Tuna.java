package lab05.pagaleva;

public class Tuna extends Comida {

    public Tuna(Temperature temperature, State state){
        super(temperature, state);
    }

    @Override
    public String toString(){
        return "Tuna: Temperature " + getTemperature() + ", State " + getState();
    }
}
