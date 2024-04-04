import java.util.*;

public class Lab_8a {
    public static void main(String[] args) {
        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);

            if (x == 0 || y == 0) {
                throw new MyException("Not valid");
            } else {
                System.out.println(x * y);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class MyException extends Exception {
    MyException(String str) {
        super(str);
    }
}
