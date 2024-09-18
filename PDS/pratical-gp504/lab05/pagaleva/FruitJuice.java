package lab05.pagaleva;

public class FruitJuice extends Comida {

    private String fruitname;

    public FruitJuice(Temperature temperature, State state){
        super(temperature, state);
        this.fruitname = "Orange";
    }
    
    @Override
    public String toString(){
        return "FruitJuice: " + fruitname + ", Temperature " + getTemperature() + ", State " + getState();
    }
}
