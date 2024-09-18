package lab07.Empresa_Pst;

import java.util.Vector;

public class Database {    
    
    private Vector<Employee> employees; 
    
    public Database() {
        employees = new Vector<>();
    }
    
    public boolean addEmployee(Employee employee) {

        if (employees.contains(employee)) {
            return false;
        } else {
            employees.add(employee);
            return true;
        }
    }

    public void deleteEmployee(long emp_num) {
        try {
            for (Employee employee : employees) {
                if (employee.getEmpNum() == emp_num) {
                    employees.remove(employee);
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Employee not found!");
        }
    }

    public Employee[] getAllEmployees() {
        Employee[] employeesArray = new Employee[employees.size()];
        employees.toArray(employeesArray);
        return employeesArray;
    }
}
