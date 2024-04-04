/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import static java.lang.Thread.sleep;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaapplication3.DigitalClock;

/**
 *
 * @author yashp
 * 
 * 
 */
  class label1 extends Thread{
    
        
    public void run(){
        while(true){
            Date d1 = new Date();
            DigitalClock.jLabel1.setText("" + d1.getSeconds() );
            
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(JavaApplication3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
      
    }
    
    
    
}  

class label2 extends Thread{
    
    
    public void run(){
       
        while(true){
            Date d2 = new Date();
            DigitalClock.jLabel2.setText("" + d2.getMinutes() );
            
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(JavaApplication3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
      
    }
    
    
    
} 
class label3 extends Thread{
    
    
    public void run(){
       
        while(true){
            Date d2 = new Date();
            DigitalClock.jLabel3.setText("" + d2.getHours() );
            
            try {
                sleep(1000*60*60);
            } catch (InterruptedException ex) {
                Logger.getLogger(JavaApplication3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
      
    }
    
    
    
}


public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        DigitalClock d =  new DigitalClock();
        d.setVisible(true);
        label1 lb1 = new label1();
        label2 lb2 = new label2();
        label3 lb3 = new label3();
        lb1.start();
        lb2.start();
        lb3.start();
        
        
    }
    
}
