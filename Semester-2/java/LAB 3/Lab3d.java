package java;
import java.util.*;
class Lab3d{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.next();
        int start = 0;
        int end = s.length()-1; 
        int flag=0;
        while(start!=end){
            if(s.charAt(start)!=s.charAt(end)){
                flag=1;
                break;
            }
            start++;
            end--;
        }
        if(flag==1){
            System.out.println("Number is not Palindrome");
        }else{
            System.out.println("Number is Palindrome");
        }
        
    }
}