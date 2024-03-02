import java.util.*;

class Lab5b{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Time t1 = new Time();
		Time t2 = new Time();
		Time t3 = new Time();
		System.out.println("Enter a hh:mm:ss - 1 : ");
		t1.h = sc.nextInt();
		t1.m = sc.nextInt();
		t1.s = sc.nextInt();

		System.out.println("Enter a hh:mm:ss - 2 : ");
		t2.h = sc.nextInt();
		t2.m = sc.nextInt();
		t2.s = sc.nextInt();

		t1.add(t2);
		System.out.print(t1.h + " : " + t1.m + " : " + t1.s);
	}
}

class Time
{
	int h;
	int m;
	int s;
	void add(Time t2){
		 
		h = h + t2.h;
		m = m + t2.m;
		s = s + t2.s;
		if(s>= 60){
			s = s - 60;
			m++;

		}
		if(m >= 60){
			m=  m-60;
			
			h++;
		}		
	}
}