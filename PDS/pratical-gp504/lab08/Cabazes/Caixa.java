package lab08.Cabazes;

import java.util.ArrayList;

public class Caixa implements Interface {
    private ArrayList<Interface> components = new ArrayList<Interface>();
    private String name;
    private double Weight;
    private double TotalWeight;

    public Caixa(String name, int Weight) {
        this.name = name;
        this.Weight = Weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return Weight;
    }

    public double getTotalWeight() {
        this.TotalWeight = getWeight();
        for (Interface component : components) {
            if (component instanceof Caixa) {
                this.TotalWeight += ((Caixa) component).getTotalWeight();
            } else {
                this.TotalWeight += component.getWeight();
            }
        }
        return TotalWeight;
    }

    public void add(Interface component) {
        components.add(component);
    }

    public void draw() {
        System.out.println(
                "Caixa '" + this.name + "' [ Weight: " + this.Weight + " ; Total: " + getTotalWeight() + "]");
        for (Interface component : this.components) {
            if (component instanceof Caixa) {
                ((Caixa) component).draw();
            } else {
                System.out.println(component.getClass().getSimpleName() + " '" + component.getName() + "' - Weight : "
                        + component.getWeight());
            }
        }
    }

    @Override
    public String toString() {
        return "* Caixa '" + getName() + "' [ weight: " + getWeight() + " ; Total: " + getTotalWeight() + " ]";
    }
}