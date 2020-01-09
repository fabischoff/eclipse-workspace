import java.util.Locale;
import java.util.Scanner;

public class Entrada_de_dados_em_java {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

//		String x;
//		x = sc.next();
//		System.out.println("Você digitou: " + x);
		
//		int x;
//		x = sc.nextInt();
//		System.out.println("Você digitou: " + x);
		
//		double x;
//		x = sc.nextDouble();
//		System.out.println("Você digitou: " + x);
		
//		char x;
//		x = sc.next().charAt(0);
//		System.out.println("Você digitou: " + x);
		
		//Para ler vários dados na mesma linha
		
		String x;
		int y;
		double z;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("Você digitou: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		
		sc.close();
	}

}
