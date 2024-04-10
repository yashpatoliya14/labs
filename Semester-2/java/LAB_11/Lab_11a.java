import java.io.*;
import java.util.*;
public class Lab_11a{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String file = sc.nextLine();
        File f = new File(file);
            if(f.isFile()){
                System.out.println("file : " + f.length());
            }else if(f.isDirectory()){  
                System.out.println("folder : " );
                String[] s = f.list();
                for(int i=0; i<s.length; i++){
                    System.out.println(s[i]);
                }
            }else{
                System.out.println("not exists");
            }
        
    }
}