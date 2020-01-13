import java.util.Locale;
import java.util.Scanner;

public class Estrtutura_repetitiva_do_while {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		double temperaturaC, temperaturaF = 0.0;
		char letra;

		do {
			System.out.print("Digite a temperatura em Celsius:");
			temperaturaC = sc.nextDouble();
			temperaturaF = (9.0 * temperaturaC) / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", temperaturaF);
			System.out.println("Deseja repetir (s/n)?");
			letra = sc.next().charAt(0);
		} while (letra != 'n');

		sc.close();
	}

}
