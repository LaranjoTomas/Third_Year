package lab05.pagaleva;

public class PortionFactory {
    
    public static Portion create(String type, Temperature temperature){
        if (type.equals("Beverage") && temperature.equals(Temperature.COLD)){
            return new FruitJuice(temperature, State.Liquid);
        } else if (type.equals("Beverage") && temperature.equals(Temperature.WARM)){
            return new Milk(temperature, State.Liquid); 
        } else if (type.equals("Meat") && temperature.equals(Temperature.WARM)){
            return new Pork(temperature, State.Solid);
        } else if (type.equals("Meat") && temperature.equals(Temperature.COLD)){
            return new Tuna(temperature, State.Solid);
        } else {
            return null;
        }
    }
}
