package lab09.ex2;

import java.util.List;

public class SharkCompany {
	public static void main(String[] args) {
		
		Person[] persons = { 
			new Person("Maria Silva"),
			new Person("Manuel Pereira"),
			new Person("Aurora Machado"),
			new Person("Augusto Lima") 
		};

		Company shark = new Company();
		Company.user = User.COMPANY;

		// Create Exercise 2 Services through Facade (ooh, fancy!)
		ServicesFacade sf = new ServicesFacade();
		sf.createServices("SharkSocialSec", "SharkInsurance");

		shark.admitEmployee(persons[0], 1000, sf);
		shark.admitEmployee(persons[1], 900, sf);
		shark.admitEmployee(persons[2], 1200, sf);
		shark.admitEmployee(persons[3], 1100, sf);
		List<Employee> sharkEmps = shark.employees();
		for (Employee e : sharkEmps)
		System.out.println(e.getSalary());
		shark.paySalaries(1);

		for (Employee e : sharkEmps)
			System.out.println(sf.returnAllData(e));
	}
}	