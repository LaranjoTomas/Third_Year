package lab07.Empresa_Pst;

public interface DB_Interface {
    
    public void addEmployee(String Fname, String Lname, long id, double salary);
    public void removeEmployee(int codigo);
    public boolean existsEmployee(int codigo);
    public void printEmployees();

}
