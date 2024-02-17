package java;
import java.util.Scanner;

class Lab2_4{

public static void main(String[] args) {
	System.out.println("Enter a radius :");
	Scanner sc = new Scanner(System.in);
	int r = sc.nextInt();
	System.out.println("Area of Circle : " + 3.14*r*r);
}
}