import java.util.Scanner;

public class Lab_1f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Enter a power : ");
        int p = sc.nextInt();

        int ans = 1;

        for(int i = 1 ; i <= p ; i++){
            ans *= n;
        }

        System.out.println("Ans = "+ans);
        sc.close();
    }
}
