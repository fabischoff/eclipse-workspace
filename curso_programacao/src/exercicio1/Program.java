package exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Studenty studenty = new Studenty();
		System.out.print("Enter name: ");
		studenty.name = sc.nextLine();
		System.out.println("Enter first nota: ");
		studenty.notaSemestre_1 = sc.nextDouble();
		
		System.out.println("Enter secund nota: ");
		studenty.notaSemestre_2 = sc.nextDouble();
		
		System.out.println("Enter thirty nota: ");
		studenty.notaSemestre_3 = sc.nextDouble();
		
		studenty.calcularMedia();
		studenty.aprovacao();
		
		System.out.println(studenty);
					
		
		sc.close();
	}
}
