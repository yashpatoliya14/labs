import java.util.*;
class Node {
    int data;
    Node link;

    public Node(int data){
        this.data = data;
        this.link = null;
    } 
}
class LinkList {

    
    Node first = null;

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        if(first == null){
            first = newNode;
            return;
        }
        newNode.link = first;
        first = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);
        if(first == null){
            first = newNode;
            return;
        }
        Node temp = first;
        while (temp.link != null) {
            temp = temp.link;
        }
        temp.link = newNode;
    }

    public void traversal() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.link;
        }
    }
    public void insord(int x){
        Node newNode = new Node(x);
        if(first == null){
            first = newNode;
            return;
        }
        Node save = first;
        while(save.link.data<=x && save.link!=null){
            save = save.link;
        }
        newNode.link = save.link;
        save.link = newNode;
    }
    public void deleteAtFirst(){
        if(first == null){
            System.out.println("LL is empty");
            return;
        }
        first = first.link;
    }

    public void deleteAtLast(){
        if(first == null){
            System.out.println("LL is empty");
            return;
        }
        Node save=first;
        while (save.link.link!=null) {
            save=save.link;
        }
        save.link = null;
    }
    public void insertAtPosition(int data,int i){
        Node newNode = new Node(data);
        Node save = first;
        if(first == null){
            first = newNode;
            return;
        }
        
        int count=0;
        while(save.link.data<=data && save.link!=null && count <i ){
            save = save.link;
            count++;
        }
        newNode.link = save.link;
        save.link = newNode;

    }
    int length = 0 ;
    public void lengthLL(){
        
        Node save = first;
        while(save!=null){
            save = save.link;
            length++;
        }
    }
    public Node reverseLL(){
        Node temp=first;
        Node prev = null;
        Node next = first.link;
        while(temp!=null){
            temp.link=prev;
            prev=temp;
            temp=next;
            next = temp.link;
        }

        return first;
    }


 public Node reverseLL2(){
        Node curr = first;
        Node prev = null;
        Node next;
        while(curr!=null){
            next = curr.link;
            curr.link=prev;
            prev=curr;
            curr=next;
        }
        first=prev;
        return first;
    }
    //copy linked list 
    
    public Node copyLL(){
        //assign a save pointer with first Node of the linked list
        Node save = first;

        //create a new first pointer for a new linked list 
        //and assign the value of save
        Node newFirst = new Node(save.data);

        //now create a begin pointer for new linked list
        // similar work as save pointer 
        Node begin = newFirst;

        //now create a while loop with condition save is not reach to null
        while(save.link != null){

        //now create a node and assign a data to linked list
        Node newNode = new Node(save.link.data);

        //begin.next is assign by the reference of newNode
        begin.link = newNode;

        //begin pointer move to newNode
        begin = newNode;

        //save is update
        save = save.link;
        }

        return newFirst;
    }

    public Node rotateRight(int k) {
        int count=0;
        Node save = first;
        while(save!=null){
            count++;
            save=save.link;
        }
        if(first==null || first.link==null || k==0 ){
            return first;
        }
        if(first==null || first.link==null || k==0){
            return first;
        }
        for(int i=0; i<k; i++){
            Node pre = null;
            save = first;
            while(save.link!=null){
                pre = save;
                save = save.link;
            }
            save.link=first;
            first = save;
            pre.link=null;
        }
        return first;
    }
    public Node sortLL(){
        Node save1=first;
        Node save2=first.link;
        for (int i = 0; i <length; i++) {
            for (int j = i+1; j <length; j++) {
                if(save1.data>save2.data){
                    int temp=save1.data;
                    save1.data=save2.data;
                    save2.data=temp;
                }
                
                if(save2.link!=null){
                    save2=save2.link;
                }else{
                    break;
                }
            }
            if(save1.link!=null){
                save1=save1.link;
                save2=save1.link;    
            }else{
                break;
            }
        }
        return first;
    }

    public Node removeDuplicate(){
        if(first==null || first.link==null){
            return first;
        }
        Node save1=first;
        
        while(save1!=null){
            Node save2=save1.link;
            Node pre =save1;
            while(save2!=null){
                if(save1.data==save2.data){
                    pre.link=save2.link;
                }else{
                    pre = save2;
                }
                save2=save2.link;
            }
            save1=save1.link;
        }
        
        return first;
    }
    public Node kthNode(int k){
        Node save1=first;
        Node save2=first;

        for (int i=1; i<k ;i++ ) {
            save1=save1.link;
        }

        for (int i=1;i<=length-k ; i++) {
            save2=save2.link;
        }

        int temp=save1.data;

        save1.data = save2.data;

        save2.data = temp;

        return first;
    }

    public Node GCD(){
        //if linked list is null
        if(first==null || first.link==null){
            return first;
        }
        Node save=first;
        while(save.link!=null){

            int a=save.link.data;
            int b=save.data;
            int max1=0;
            for (int j = 1; j <=Math.min(a,b); j++) {
                if(a%j==0 && b%j==0){
                    max1=Math.max(max1,j);
                }
            }
            Node newNode = new Node(max1);
            newNode.link = save.link;
            save.link=newNode;
            save=newNode.link;
        }
        return first;
    }
    public Node middleElement(){
        Node slow=first.link;
        Node fast=first.link.link;
        while (fast!=null) {
            slow=slow.link;
            fast=fast.link.link;
        }
        return slow;
    }
    public Node reorderList() {

        Node slow = first;
        Node fast = first;
        while( fast.link!=null && fast.link.link!=null){
            slow = slow.link;
            fast = fast.link.link;
        }
        Node head = slow.link;
        Node previous = null; 
        Node curr = head;
        while(curr!=null){
            Node next = curr.link;
            curr.link=previous;
            previous =curr;
            curr = next;
        }
        slow.link=null;
        
        Node save1 = first;
        Node save2 = previous;

        while(save2!=null){
            
            Node next1 = save1.link;
            Node next2 = save2.link;
            save1.link = save2;
            save2.link = next1;
            save1=next1;
            save2=next2;
            
        }
        
        return first;
    }
}

public class Lab_12abc
{
    public static void main(String[] args) {

        LinkList linkedList = new LinkList();
        linkedList.insertFirst(6);
        linkedList.insertFirst(5);
        linkedList.insertFirst(4);
        linkedList.insertFirst(3);
        linkedList.insertFirst(2);
        linkedList.insertFirst(1);
        Node save = linkedList.reorderList();
        while(save!=null){
            System.out.println(save.data + " ");
            save=save.link;
        }
        
    }
}
