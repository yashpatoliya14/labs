import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
public class Lab_11c {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String file = sc.nextLine();
        MyThread mt = new MyThread(file); 
        mt.start();    
        for(int i=0 ; i<10000 ; i++){
            System.out.println("my thread are running");
        }
        
    }


}

class MyThread extends Thread{
    String file;
    MyThread(String file){
        this.file = file;
    }

    public void run(){
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            int c=0;
            c=br.read();
            while(c!=-1){
                System.out.println(c);
                c=br.read();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        

    }
}