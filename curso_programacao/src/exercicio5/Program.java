package exercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();
//		Employee employee;

		System.out.print("How many employess will be registered? ");
		int numberEmployees = sc.nextInt();
		System.out.println("\n");
//		sc.next();

		for (int i = 1; i <= numberEmployees; i++) {
			System.out.println("Emplyoee #" + i);
			System.out.print("Digite o id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Digite o nome: ");
			String nome = sc.nextLine();
			System.out.print("Digite o salário: ");
			double salario = sc.nextDouble();
			list.add(new Employee(id, nome, salario));
			System.out.println("\n");
		}
		
		System.out.print("Enter the employee tha will have salary increase : ");		
		int id = sc.nextInt();
		sc.nextLine();
		
		boolean emp = false;
		
		for(Employee obj : list) {
			if(obj.getId() == id) {
				System.out.print("Enter the percentage:\n ");
				double percentage = sc.nextDouble();
				obj.increaseSalary(percentage);
				emp = true;
			} 
		}
		
		if(!emp) {
			System.out.println("This id does not exist!");
			System.out.println("\n");
		}
		
		System.out.println("List of employees:");
		for(Employee obj : list) {
			System.out.println(obj);
		}

		sc.close();

	}

}
