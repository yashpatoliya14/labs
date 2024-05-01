interface EventListener{
    void performEvent();
}
interface MouseListener extends EventListener{
    void mouseClicked();
    void mousePressed();
    void mouseReleased();
    void mouseMoved();
    void mouseDragged();
}
interface KeyListener extends EventListener{
    void keyPressed();
    void keyReleased();
}
class EventDemo implements MouseListener,KeyListener{
    public void performEvent(){
        System.out.println("Perform Event Executed");
    }
    public void mouseClicked(){
        System.out.println("Mouse Clicked Executed");
    }
    public void mousePressed(){
        System.out.println("Mouse Pressed Executed");
    }
    public void mouseReleased(){
        System.out.println("Mouse Released Executed");
    }
    public void mouseMoved(){
        System.out.println("Mouse Moved Executed");
    }
    public void mouseDragged(){
        System.out.println("Mouse Dragged Executed");
    }
    public void keyPressed(){
        System.out.println("Key Pressed Executed");
    }
    public void keyReleased(){
        System.out.println("Key Released Executed");
    }
}
public class Program_B_4 {
    public static void main(String[] args) {
        EventDemo e1= new EventDemo();
        e1.performEvent();
        e1.mouseClicked();
        e1.mousePressed();
        e1.mouseReleased();
        e1.mouseDragged();
        e1.mouseMoved();
        e1.keyPressed();
        e1.keyReleased();
    }
}
