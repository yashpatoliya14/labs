class Node {
    int coef;
    int pow;
    Node link;

    public Node(int coef,int pow) {
        this.coef = coef;
        this.pow = pow;
        link = null;
    }
}

class LinkedList {
    Node head = null;
    public void insertData(int coef , int pow){
        if(head==null){
            Node newNode = new Node(coef,pow);
            head=newNode;
            return;
        }

        Node save = head;
        while(save.link!=null ){
            if(save.pow==pow){
                save.coef += coef;
                return; 
            }
            save= save.link;
        }

        Node newNode = new Node(coef,pow);
        if(pow<=head.pow){
            newNode.link = head;
            head = newNode;
            return;
        }
        save = head;
        while(save.link!=null && save.link.pow<=pow){
            save= save.link;
        }
        
        newNode.link = save.link;
        save.link = newNode;
    } 

    public Node addition(LinkedList exp1){
        if(exp1==null){
            return head;
        }else if(head==null){
            return exp1.head;
        }

        Node save1 = head;
        Node save2 = exp1.head;

        while(save2!=null){
            Node insertNode = new Node(save2.coef, save2.pow);
            if(save2.pow<head.pow){
                insertNode.link = head;
                head = insertNode;
            }else if(save2.pow==head.pow){
                head.coef += insertNode.coef;
            }else{
                while(save1.link!=null && save1.link.pow<=insertNode.pow){
                    save1=save1.link;
                }
                if(save1.pow==insertNode.pow){
                    save1.coef += insertNode.coef;
                }else{
                    insertNode.link = save1.link;
                    save1.link = insertNode;
                }
            }
            save1=head;
            save2=save2.link;
        }
        return head;
    }

    public void printExpresion(){
        Node save = head;
        while(save.link!=null){

            if(save.pow==0){
                System.out.print(save.coef  + " + ");
                save= save.link;
                continue;
            }
            System.out.print(save.coef + "x^" + save.pow + " + ");            
            save= save.link;
        }
        if(save.pow==0){
            System.out.print(save.coef);
            save= save.link;
        }else{
            System.out.print(save.coef + "x^" + save.pow);            
        }

    }
}

public class Polynomial {
    public static void main(String[] args) {
        LinkedList p1 = new LinkedList();
        LinkedList p2 = new LinkedList();

        p1.insertData(3,3);
        p1.insertData(5,4);
        p1.insertData(2,1);

        System.out.print("Exp 1 : ");
        p1.printExpresion();
        System.out.println();
        System.out.print("Exp 2 : ");
        p2.printExpresion();tem 
        System.out.println();

        System.out.print("Exp 1 + Exp2  = ");
        Node save = p1.addition(p2);
        while(save.link!=null){

            if(save.pow==0){
                System.out.print(save.coef + " + ");
                save= save.link;
                continue;
            }
            System.out.print(save.coef + "x^" + save.pow + " + ");            
            save= save.link;
        }
        if(save.pow==0){
            System.out.print(save.coef );
            save= save.link;
        }else{
            System.out.print(save.coef + "x^" + save.pow);            
        }
        
    }
}