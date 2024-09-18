package lab07.Empresa_Pst;

public class AdapterPetiscos implements DB_Interface{

    Registos registo = new Registos();

    public void addEmployee(String Fname, String Lname, long id, double salary) {
        
        int codigo = (int) id;
        Empregado empregado = new Empregado(Fname, Lname, codigo, salary);
        registo.insere(empregado);
    }

    public void removeEmployee(int codigo) {
        registo.remove(codigo);
    }

    public boolean existsEmployee(int codigo) {
        return registo.isEmpregado(codigo);
    }

    public void printEmployees() {
        System.out.println();
        System.out.println("Petiscos Employees:");
        for (Empregado empregado : registo.listaDeEmpregados()) {
            System.out.println("Name: " + empregado.nome());
            System.out.println("Employee Number: " + empregado.codigo());
            System.out.println("Salary: " + empregado.salario());
        }
    }
}
