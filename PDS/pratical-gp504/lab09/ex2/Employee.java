package lab09.ex2;

import java.util.Random;

class Employee {

	private Person person;
	private BankAccount bankAccount;
	private double salary;

	private String card;
	private boolean parking = false;
	
	public Employee(String name, double s) {
		this.person = new Person(name);
		bankAccount = new BankAccountImpl("PeDeMeia", 0);
		salary = s;

		this.card = randomCard();
	}

	public Person getPerson() {
		return person;
	}

	public String getCard() {
		return card;
	}
	
	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public double getSalary() {
		return salary;
	}

	public void setParking(boolean p) {
		parking = p;
	}

	public boolean getParking() {
		return parking;
	}

	public String randomCard() {
        Random rnd = new Random();
        int number = rnd.nextInt(999999);
        return String.format("%06d", number);
    }
}