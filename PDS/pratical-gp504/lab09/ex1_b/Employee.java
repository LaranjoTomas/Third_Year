package lab09.ex1_b;

class Employee {

	private Person person;
	private BankAccount bankAccount;
	private double salary;
	
	public Employee(String name, double s) {
		this.person = new Person(name);
		bankAccount = new BankAccountImpl("PeDeMeia", 0);
		salary = s;
	}

	public Person getPerson() {
		return person;
	}
	
	
	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public double getSalary() {
		return salary;
	}
}