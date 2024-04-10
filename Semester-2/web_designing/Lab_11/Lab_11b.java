import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
public class Lab_11b {
    public static void main(String[] args) {
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("myfile.txt"));
            bw.write("101,kp");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
