package lab09.ex2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Company {

public static User user;
private List<Employee> emps = new ArrayList<>();

	public void admitEmployee(Person p, double salary, ServicesFacade sf) {
		Employee e = new Employee(p.getName(), salary);
		sf.admitionHelper(e);
		emps.add(e);
	}
	
	public void paySalaries(int month) {
		for (Employee e : emps) {
			BankAccount ba = e.getBankAccount();
			ba.deposit(e.getSalary());
		}
	}
	
	public List<Employee> employees() {
		return Collections.unmodifiableList(emps);
	}
}