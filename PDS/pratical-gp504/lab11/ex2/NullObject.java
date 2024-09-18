package lab11.ex2;

abstract class Employee {
    protected String name;

    public abstract boolean isNull();
    
    public abstract String getName();
}

class RealEmployee extends Employee {

    public RealEmployee(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNull() {
        return false;
    }
}
class NullEmployee extends Employee {

    @Override
    public String getName() {
        return "Not Available";
    }

    @Override
    public boolean isNull() {
        return true;
    }
}

class ObjectFactory {
    public static Employee createObject(String name) {
        for (int i = 0; i < name.length(); i++) {
            if (name.equalsIgnoreCase(name)) {
                return new RealEmployee(name);
            }
        }
        return new NullEmployee();
    }
}

public class NullObject {
    public static void main(String[] args) {
        Employee obj = ObjectFactory.createObject("Mac");
        Employee obj2 = ObjectFactory.createObject("Janela");
        Employee obj3 = ObjectFactory.createObject("Linux");
        Employee obj4 = ObjectFactory.createObject("Mack");

        System.out.println(obj.getName());
        System.out.println(obj2.getName());
        System.out.println(obj3.getName());
        System.out.println(obj4.getName());
    }
}
