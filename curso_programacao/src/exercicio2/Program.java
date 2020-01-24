package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		ContaBancaria cb;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: " );
		int numeroConta = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nomeTitular = sc.nextLine();

		System.out.print("Is there na initial deposit (y/n)? ");
		char letter = sc.next().charAt(0);

		if (letter == 'y') {
			System.out.print("Enter initial deposit value: ");
			double depositoInicial = sc.nextDouble();
			cb = new ContaBancaria(numeroConta, nomeTitular, depositoInicial);
		} else {
			cb = new ContaBancaria(numeroConta, nomeTitular);
		}

		System.out.println();	
		System.out.println();
		
		System.out.println("Account data:");
		System.out.println(cb);
		
		System.out.println();	
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		cb.depositar(sc.nextDouble());
		
		System.out.println("Update account data:");
		System.out.println(cb);

		System.out.println();	
		System.out.println();
				
		System.out.print("Enter a withdraw value: ");
		cb.sacar(sc.nextDouble());
		
		System.out.println("Update account data:");
		System.out.println(cb);
		

		System.out.println();

		sc.close();

	}

}
