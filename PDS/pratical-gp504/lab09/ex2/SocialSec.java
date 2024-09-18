package lab09.ex2;

import java.util.List;
import java.util.ArrayList;

public class SocialSec {

    private String company_name;
    private List<Employee> employees = new ArrayList<>();

    public SocialSec(String company_name) {
        this.company_name = company_name;
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public String returnAllData(Employee e) {
        return e.getPerson().getName() + " @ " + company_name + "\n";
    }
    
}
