package lab05.pagaleva;

public class Comida implements Portion{

    public Temperature temperature;
    public State state;
 
    public Comida(Temperature temperature, State state){
        this.temperature = temperature;
        this.state = state;
    }

    public Temperature getTemperature(){
        return temperature;
    }

    public State getState(){
        return state;
    }
}
