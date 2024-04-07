import java.util.Scanner;
class ComplexNumber {
    int real;
    int complex;
    ComplexNumber(int real , int complex){
        this.real = real;
        this.complex =  complex;
    }

    void add(ComplexNumber c){
        this.real = this.real + c.real;
        this.complex = this.complex + c.complex;

        System.out.println(this.real + "+" + this.complex + "i");
    }

    
}

public class Lab_5f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ComplexNumber c1 = new ComplexNumber(10, 12);
        ComplexNumber c2 = new ComplexNumber(11, 13);

        c1.add(c2);    
        
    }
}
