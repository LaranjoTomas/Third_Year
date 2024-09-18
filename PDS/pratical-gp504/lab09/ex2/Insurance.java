package lab09.ex2;

import java.util.List;
import java.util.ArrayList;

public class Insurance {

    private String insurance_name;
    private List<Employee> employees = new ArrayList<>();

    public Insurance(String insurance_name) {
        this.insurance_name = insurance_name;
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public String returnAllData(Employee e) {
        return e.getPerson().getName() + " @ " + insurance_name + "\n";
    }

    
}
