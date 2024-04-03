
class Gn extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good Morning");
            try {
                sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

}

class Ga extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good Afternoon");
            try {
                sleep(3000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

}

public class LAb_9a {
    public static void main(String[] args) {
        Gn msg1 = new Gn();
        Ga msg2 = new Ga();
        msg2.start();
        msg1.start();
        
    }
}
