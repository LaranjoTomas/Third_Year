package lab07.Empresa_Pst;

public class MergedDB implements DB_Interface{

    private AdapterPetiscos registos = new AdapterPetiscos();
    private AdapterSweets sweets = new AdapterSweets();

    public MergedDB(AdapterPetiscos registos, AdapterSweets sweets) {
        this.registos = registos;
        this.sweets = sweets;
    }

    public MergedDB() {
    }

    public void addEmployee(String Fname, String Lname, long id, double salary) {
        sweets.addEmployee(Fname, Lname, id, salary);
        registos.addEmployee(Fname, Lname, id, salary);
    }

    public void removeEmployee(int codigo) {
        sweets.removeEmployee(codigo);
        registos.removeEmployee(codigo);
    }

    public boolean existsEmployee(int codigo) {
        return sweets.existsEmployee(codigo) || registos.existsEmployee(codigo);
    }

    public void printEmployees() {
        sweets.printEmployees();
        registos.printEmployees();
    }
}
