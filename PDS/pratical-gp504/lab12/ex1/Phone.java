package lab12.ex1;

public class Phone {
    
    private String name;
    private String brand;
    private double price;
    
    public Phone(String name, String brand, double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String toString() {
        return name + " (" + brand + ") - $" + price;
    }
    
}
