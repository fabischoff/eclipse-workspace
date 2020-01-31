package exercicio8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import exercicio8.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		Client client = new Client(name, email, birthDate);

		System.out.println("Enter order data:");

		System.out.print("Status: ");
		String status = sc.next();
		Order order = new Order(new Date(), OrderStatus.valueOf(status), client);
		OrderItem orderItem;

		System.out.print("How man items to this order? ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data:");
//			sc.next();
			System.out.print("Product name: ");
			name = sc.next();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			Product product = new Product(name, price);
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			orderItem = new OrderItem(quantity, product, price);
//			order.addOrderItem(orderItem);
			order.addItem(orderItem);
		}

		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
	
		sc.close();

	}

}
