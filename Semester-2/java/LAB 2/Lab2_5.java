package java;
import java.util.Scanner;

class Lab2_5{

	public static void main(String[] args) {
		System.out.print("Enter a Fahrenheit : ");
		Scanner sc= new Scanner(System.in);

		float f = sc.nextFloat();
		float c = (f-32)*5/9;
		System.out.println("Celsius : " + c);
	}
}