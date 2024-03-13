interface A {

    int a=10;
    void method1();
}
interface A1 extends A{
	int b=20;
    void method2();
}
interface A2 extends A{
    int c=30;
    void method3();
}
interface  A12 {
    int d=40;
    void method4();
}
interface P1 extends A12{
	int e=50;
    void method5();
}
interface P2 extends A12{
    int f=60;
    void method6();
}

class B implements A1,A2,P1,P2{
	void method1(){
		System.out.prinln(a);
	}
	void method2(){
		System.out.prinln(b);
	}

	void method3(){
		System.out.prinln(c);
	}

	void method4(){
		System.out.prinln(d);
	}

	void method5(){
		System.out.prinln(e);
	}
	void method6(){
		System.out.prinln(f);
	}


}


public class Lab7b {
   
   public static void main(String[] args) {
   		B b = new B();
   		b.method1();
   		b.method2();
   		b.method3();
   		b.method4();
   		b.method5();
   		b.method6();
   }
    
}
