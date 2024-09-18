package lab07.Empresa_Pst;

public class EmpresaMain {
    public static void main(String[] args) {

        AdapterSweets sweets = new AdapterSweets();
        AdapterPetiscos registos = new AdapterPetiscos();

        MergedDB mergedDB = new MergedDB(registos, sweets);

        mergedDB.addEmployee("John", "Doe", 123456789, 1000);
        mergedDB.addEmployee("Jane", "Doe", 987654321, 2000);
        mergedDB.addEmployee("Alice", "Doe", 123456789, 3000);

        System.out.println();
        System.out.println("Empregados before removal:");
        mergedDB.printEmployees();
    
        mergedDB.removeEmployee(123456789);

        System.out.println();
        System.out.println("Empregados after removal:");

        mergedDB.printEmployees();
    }
}
