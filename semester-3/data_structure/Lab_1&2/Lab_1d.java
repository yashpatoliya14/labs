import java.util.Scanner;
public class Lab_1d {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int ans = 1;
        for(int i = 2 ; i <= n ; i++){
            ans *= i;
        }
        System.out.println("factorial = "+ans);
        sc.close();
    
    }
}
