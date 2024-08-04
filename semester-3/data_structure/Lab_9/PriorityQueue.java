import java.util.*;
class Node {
    int data;
    int priority;
    Node link;

    public Node(int data){
        this.data = data;
        this.link = null;
        this.priority = 1;
    } 
}
class LinkedList {

    //declare a first and last node
    Node first = null;
    Node last = null;


    public void insertElement(int Y){
        
    }

}

public class PriorityQueue
{
    public static void main(String[] args) {

        LinkList linkedList = new LinkList();
        linkedList.insertLast(6);
        linkedList.insertLast(7);
        linkedList.insertLast(8);
        linkedList.insertLast(9);
        linkedList.insertLast(9);
        linkedList.insertLast(9);
        linkedList.deleteIthPos(6);
        linkedList.traversal();
    }
}

