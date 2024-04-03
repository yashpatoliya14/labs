import java.io.*;
import java.util.*;


class DStudent {
    int rollNo;
    String name;
    String batch;
    DStudent(int rollNo, String name, String batch){
        this.rollNo = rollNo;
        this.name = name;
        this.batch = batch;
    }
    
}
public class CollectionIterator{
    public static void main(String[] args) {
        try{

        
        ArrayList<DStudent> student = new ArrayList<DStudent>();
        BufferedReader b = new BufferedReader(new FileReader("Book1.csv"));
       
       
       while (b.ready()) {
        String line = b.readLine();
        String s[] = line.split(",");
        
        student.add( new DStudent(Integer.parseInt(s[0]), s[1], s[2]));
       }
       Collections.sort(student, new NameComparator());
       Iterator i = student.iterator();
       while (i.hasNext()) {
        DStudent e = (DStudent)i.next();
        System.out.println(e.name);
       }
    }catch(Exception e){
        e.printStackTrace();
    }
    }
}

//-----------------------------Comparator--------------------------------------------


class NameComparator implements Comparator<DStudent>{
    public int compare(DStudent d1 , DStudent d2 ){
        DStudent s1 = (DStudent)d1;
        DStudent s2 = (DStudent)d2;

        if(s1.name.charAt(0)==s2.name.charAt(0)){
            return 0;
        }else if(s1.name.charAt(0)>s2.name.charAt(0)){
            return 1;
        }else{
            return -1;
        }
    }
}