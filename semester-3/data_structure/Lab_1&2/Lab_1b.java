import java.util.Scanner;

public class Lab_1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println(n + " is Even Number");
        }
        else{
            System.out.println(n + " is Odd Number");
        }
        sc.close();
    }
}
