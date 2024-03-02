package java;
import java.util.*;
class Lab3a{

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         System.out.println("Enter Your Total : ");
         int total= sc.nextInt();
        int sum=0;
        int arr[]= new int[5];
        for(int i=0;i<arr.length; i++){
            System.out.println("Subject " + i);
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        float ans = sum*100/total;
        if(ans >=60){
            System.out.println("First Division");
        }else if(ans>=50){
            System.out.println("Second Division");
        }else if(ans>=40){
            System.out.println("Third Division");
        }else{
            System.out.println("Fail");
        }

    }
}