package java;
import java.util.*;
class Lab3b{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(a>b){
            if(a>c){
                System.out.println("max"+ a);
            }else{
                System.out.println("max"+ c);
            }
        }else{
            if(b>c){
                System.out.println("max"+ b);
            }else{
                System.out.println("max"+ c);
            }
        }
    }
}