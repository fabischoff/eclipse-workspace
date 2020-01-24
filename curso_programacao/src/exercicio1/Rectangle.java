package exercicio1;

public class Rectangle {

	public double width;
	public double height;

	public double area() {
		return width * height;
	}

	public double perimeter() {
		return width * 2 + height * 2;
	}

	public double diagonal() {
		double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
		return diagonal;
	}

	public String toString() {
		return "Area = " 
				+ String.format("%.2f\n", area())
				+ "Perimeter = "
				+ String.format("%.2f\n", perimeter())
				+ "Diagonal = " 
				+ String.format("%.2f\n", diagonal());
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
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		
//		Rectangle retangulo = new Rectangle();
//		System.out.println("Enter rectangle width and height:");
//		retangulo.width = sc.nextDouble();
//		retangulo.height = sc.nextDouble();
////		System.out.println(retangulo.area());	
//		System.out.println(retangulo);
//		sc.close();
//
//	}
//
//}