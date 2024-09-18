package lab05.pagaleva;

public class Container {

    public Temperature temperature;
    public State state;
    
    public static Container create(Portion portion){
        if (portion.getState() == State.Liquid && portion.getTemperature() == Temperature.COLD) {
            return new PlasticBottle(PortionFactory.create("Beverage", portion.getTemperature()));
        } else if (portion.getState() == State.Liquid && portion.getTemperature() == Temperature.WARM) {
            return new TermicBottle(PortionFactory.create("Beverage", portion.getTemperature()));
        } else if (portion.getState() == State.Solid && portion.getTemperature() == Temperature.WARM) {
            return new Tupperware(PortionFactory.create("Meat", portion.getTemperature()));
        } else if (portion.getState() == State.Solid && portion.getTemperature() == Temperature.COLD) {
            return new PlasticBag(PortionFactory.create("Meat", portion.getTemperature()));
        } else {
            return null;
            
        }
    }


}


