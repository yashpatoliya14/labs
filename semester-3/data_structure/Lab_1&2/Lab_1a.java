import java.util.Scanner;

public class Lab_1a{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a radius : ");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area = "+area);
        sc.close();
    }
}