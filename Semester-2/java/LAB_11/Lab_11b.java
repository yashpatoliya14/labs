import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;

class Student {
    int rollNo;
    String name;
    String enrollment;

    Student(int rollNo, String name , String enrollment){
        this.rollNo = rollNo;
        this.name = name;
        this.enrollment = enrollment; 
        System.out.println(rollNo + name + enrollment);
    }

    
    
}

public class Lab_11b {
    public static void main(String[] args) {
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("myDetail.txt"));
            
            bw.write("101,yash,230101\n");
            bw.write("102,yashu,230104\n");
            bw.write("103,nandu,230102\n");
            bw.close();
    
        }catch(Exception e){
            e.printStackTrace();
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader("myDetail.txt"));

            while (br.ready()) {
                String str = br.readLine();
                String s[] = str.split(",");

                Student st= new Student(Integer.parseInt(s[0]), s[1], s[2]);  
            }
            
        }
         catch (Exception e) {
            e.printStackTrace();
        }
    }
}
