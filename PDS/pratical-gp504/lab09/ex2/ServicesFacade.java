package lab09.ex2;

public class ServicesFacade {

    private SocialSec ss;
    private Insurance i;

    // Parking auxiliar
    private int count = 0;
    private int salary = 0;
    private double average = 0;
    
    public void createServices(String ss_name, String insurance_name) {
        this.ss = new SocialSec(ss_name);
        this.i = new Insurance(insurance_name);
    }

    public void admitionHelper(Employee e) {
        ss.addEmployee(e);
        i.addEmployee(e);

        salary += e.getSalary();
        count++;
    }

    public String returnAllData(Employee e) {

        average = (double) salary / count;
        if (e.getSalary() > average) {
            e.setParking(true);
        }

        return ss.returnAllData(e) + "\n" + i.returnAllData(e) + "\nCard: " + e.getCard() + "\nParking: " + e.getParking() + "\n";
    }

    

}
