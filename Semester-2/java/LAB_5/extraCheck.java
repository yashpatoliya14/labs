class UseOfStatic{
    static int count=0;
    UseOfStatic(int count){
        this.count=count;
    }
}

public class extraCheck {
    public static void main(String[] args) {
        UseOfStatic s1 = new UseOfStatic(45);
        System.out.println(UseOfStatic.count);
    }
}


