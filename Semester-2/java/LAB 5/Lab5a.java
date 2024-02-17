class Circle {
    double area(int r){
        return (Math.PI * r * r); 
    }
}
public class Lab5a {
    public static void main(String[] args) {
    
        Circle a = new Circle();
        double ans = a.area(5);
        System.out.println(ans);
    }
    
}
