package lab05.pagaleva;

public class Milk extends Comida {
 
    public Milk(Temperature temperature, State state){
        super(temperature, state);
    }

    @Override
    public String toString(){
        return "Milk: Temperature " + getTemperature() + ", State " + getState();
    }
}
