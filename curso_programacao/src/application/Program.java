package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product produto = new Product();

		System.out.println("Enter product data:");

		System.out.print("Name: ");
		produto.name = sc.next();

		System.out.print("Price: ");
		produto.price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		produto.quantity = sc.nextInt();
		System.out.println("Product data: " + produto);
		
		System.out.print("Enter the number of products to be add in stock: ");
		produto.addProducts(sc.nextInt());		
		System.out.printf("Updated data :" + produto);
		
		System.out.print("Enter the number of products to be removed from stock: ");
		produto.RemoveProducts(sc.nextInt());
		System.out.printf("Product data: " + produto);
		
//		
//		 %s, $ %.2f, %d units, Total: $ %.2f%n",  produto.name , produto.price, produto.quantity, produto.totalValueInStock());

//		System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $ %.2f%n",  produto.name , produto.price, produto.quantity, produto.totalValueInStock());

//		 %s, $ %.2f, %d units, Total: $ %.2f",  produto.name , produto.price, produto.quantity, produto.totalValueInStock());
//		


		sc.close();
	}

}
