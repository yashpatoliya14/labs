import java.util.Scanner;

public class Lab_1c {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char : ");
        char c = sc.next().charAt(0);
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            System.out.println(c + " is vowel");
        }
        else{
            System.out.println(c + " is not vowel");
        }
        sc.close();
    }
}
