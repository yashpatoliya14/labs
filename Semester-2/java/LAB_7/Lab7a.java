// abstract class Vegetable{
//     String name;
//     String color;
//     abstract void display();
// }
// class Potato extends Vegetable{
    
//     void display() {
//         name="Potato";
//         color="Brown";
//         System.out.println(name + " " +color);
//     }
// }

// class Brinjal extends Vegetable{
//     void display() {
//         name="Brinjal";
//         color="purple";
//         System.out.println(name + " " +color);
//     }
// }
// class Tomato extends Vegetable{
//     void display() {
//         name="Tomato";
//         color="red";
//         System.out.println(name + " " +color);
//     }
// }

// class Lab7a{
//     public static void main(String[] args) {
//         Potato p = new Potato();
//         Brinjal b = new Brinjal();
//         Tomato t = new Tomato();
//         p.display();
//         b.display();
//         t.display();
//     }   
// }

abstract class Vegetable{
    String name;
    String color;
    Vegetable(String name, String color){
        this.name=name;
        this.color=color;
    }
    abstract void display();
}
class Potato extends Vegetable{
    
    Potato(String name, String color){
        super(name, color);
    }
    void display() {
        System.out.println(name + " " +color);
    }
}

class Brinjal extends Vegetable{
    Brinjal(String name, String color){
        super(name, color);
    }
    void display() {
        System.out.println(name + " " +color);
    }
}
class Tomato extends Vegetable{
    Tomato(String name, String color){
        super(name, color);
    }
    void display() {
        System.out.println(name + " " +color);
    }
}

class Lab7a{
    public static void main(String[] args) {
        Potato p = new Potato("potato","skin");
        Brinjal b = new Brinjal("Brinjal","purple");
        Tomato t = new Tomato("Tamoto","red");
        p.display();
        b.display();
        t.display();
    }   
}