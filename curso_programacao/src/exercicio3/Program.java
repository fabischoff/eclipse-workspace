package exercicio3;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Rent[] Room = new Rent[10];

		System.out.print("How many rooms will be rented? ");
		int quantRoom = sc.nextInt();
//		sc.next();

		for (int i = 0; i < quantRoom; i++) {
			System.out.println("Rent #" + (i + 1) + ":");
			System.out.print("Qual quarto? ");
			int numRoom = sc.nextInt();
			System.out.print("Qual o nome? ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Qual o email? ");
			String email = sc.nextLine();
			Room[numRoom] = new Rent(name, email);
		}
		
		System.out.println("Busy Rooms");
		for(int i = 0; i < Room.length; i++) {
			if(Room[i] != null) {
				System.out.print(i + ": " + Room[i] + ":" );
			}
		}

		sc.close();
	}

}
