import java.util.*;

class Multithread extends Thread {
    int arr[];
    Multithread(int arr[]){
        this.arr = arr;
    }
    int sum=0;
    public void run(){
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Sum : " + sum);
    }
    
}
public class Lab_9c {
    public static void main(String[] args) {
        //declaration
        int m=0;
        int n=0;
        
        //read m and n
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a row and column");
        m = sc.nextInt();
        n= sc.nextInt();
        
        int arr[][] = new int[m][n]; 
        //read a array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a row element : " + i + " : ");
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        Multithread[] multithread = new Multithread[m];        
        for (int j = 0; j < m; j++) {
            multithread[j] = new Multithread(arr[j]); 
            multithread[j].start();
        }
    }
}
