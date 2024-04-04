import java.util.*;

public class Lab_8b {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 0; i < args.length; i++) {
            try {
            
            
                if(Integer.parseInt(args[i])< 0){
                    throw new MyException("Negative invalid !");    
                }else if(Integer.parseInt(args[i])%10==0){
                    throw new MyException("divisible by 10");
                }else if(Integer.parseInt(args[i])>1000 && Integer.parseInt(args[i])<2000){
                    throw new MyException("1000 2000 error!");
                }else if(Integer.parseInt(args[i])>7000){
                    throw new MyException("7000 error!");
                }else{
                    sum+=Integer.parseInt(args[i]);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(sum);    
    }
}

class MyException extends Exception {
    MyException(String str) {
        super(str);
    }
}
