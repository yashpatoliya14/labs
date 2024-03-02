package java;
import java.util.*;
class Lab3c{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int num=n;
        int ans=0;
        while(n!=0){
            int rem= n%10;
            ans = (ans*10)+rem;
            n=n/10;
        }
        
        if(ans==num){
            System.out.println("Number is Palindrome");
        }else{
            System.out.println("Number is not Palindrome");
            
        }
    }
}