class Odd extends Thread{
    public void run(){
        for (int i = 1; i <=20; i++) {
            if((i^1)==0){
                System.out.println(i);
            }
            try{

            
            sleep(1000);
            }catch(Exception e){

            }
        }
    }  
}
class Even extends Thread{
    public void run(){
        for (int i = 1; i <=20; i++) {
            if((i^1)!=0){
                System.out.println(i);
            }
            try {
                sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }  
}
public class Lab_9b {
    public static void main(String[] args) {
       Odd o = new Odd();
       Even e = new Even();
       o.start();
       e.start(); 
    }
}
