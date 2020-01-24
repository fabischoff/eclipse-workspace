package exercicio1;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary = (grossSalary * (percentage / 100 )) + netSalary();
	}

	public String toString() {
		return "Employee: "
				+ name
				+ " ,Net Salary $ " 
				+ String.format("%.2f\n", netSalary());
				
	}
}

//package exercicio1;
//
//import java.util.Locale;
//import java.util.Scanner;
//
//public class Program {
//
//	public static void main(String[] args) {
//		double percentage = 0;
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		
//		Employee employee = new Employee();
//		System.out.print ("Enter Name: ");
//		employee.name = sc.nextLine();
////		sc.next();
//		System.out.print("Enter gross salary: ");
//		employee.grossSalary = sc.nextDouble();
//		System.out.print("Enter tax: ");
//		employee.tax = sc.nextDouble();
//		System.out.println(employee);
//		System.out.print("Which percentage to increase salary? ");
//		percentage = sc.nextDouble();
//		employee.increaseSalary(percentage);
//		System.out.println("Update data: " + employee.name + ", $ " + String.format("%.2f", employee.grossSalary));	
//		
//		sc.close();
//	}
//}

