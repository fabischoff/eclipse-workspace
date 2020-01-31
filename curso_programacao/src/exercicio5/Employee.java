package exercicio5;

public class Employee {

	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void increaseSalary(double percentage) {
		this.salary +=  salary * (percentage / 100);
	}
	
	public String toString() {
		return String.format("%d", id) + ",  " + name + ", " + String.format("%.2f", salary);
	}

}
