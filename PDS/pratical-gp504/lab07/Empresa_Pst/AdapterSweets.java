package lab07.Empresa_Pst;

public class AdapterSweets implements DB_Interface {

    Database db = new Database();

    public void addEmployee(String Fname, String Lname, long id, double salary) {

        String name = Fname + " " + Lname;
        Employee employee = new Employee(name, id, salary);
        db.addEmployee(employee);
    }

    public void removeEmployee(int codigo) {
        db.deleteEmployee(codigo);
    }

    public boolean existsEmployee(int codigo) {
        Employee[] employees = db.getAllEmployees();
        for (Employee employee : employees) {
            if (employee.getEmpNum() == codigo) {
                return true;
            }
        }
        return false;
    }

    public void printEmployees() {
        Employee[] employees = db.getAllEmployees();
        System.out.println();
        System.out.println("Sweets Employees:");
        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName());
            System.out.println("Employee Number: " + employee.getEmpNum());
            System.out.println("Salary: " + employee.getSalary());
        }
    }
}
