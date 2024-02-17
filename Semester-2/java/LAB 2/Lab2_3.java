package java;
import java.util.Scanner;

class Lab2_3{

public static void main(String[] args) {
	

	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	sc.nextLine();
	char c = sc.nextLine().charAt(0);

	switch(c){
		
		case '+': System.out.println(a+b);
		break;
		
		case '-': System.out.println(a-b);
		break;

		case '*': System.out.println(a*b);
		break;

		case '/': System.out.println(a/b);
		break;
	
		default: System.out.println("invaild input");
	}
}
}