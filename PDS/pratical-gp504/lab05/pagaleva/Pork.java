package lab05.pagaleva;

public class Pork extends Comida {

    public Pork(Temperature temperature, State state){
        super(temperature, state);
    }
    
    @Override
    public String toString(){
        return "Pork: Temperature " + getTemperature() + ", State " + getState();
    }
}
