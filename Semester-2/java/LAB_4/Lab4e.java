
import java.util.*;
class Lab4e {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
            System.out.println("Enter a index :");

                int inLength = sc.nextInt();
        
            System.out.println("Enter a String :");
            sc.nextLine();
            String str = sc.nextLine(); 
               
            for(int i=inLength; i< str.length(); i++){
                System.out.print(str.charAt(i));
            }
    }
}
