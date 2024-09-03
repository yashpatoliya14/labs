class Node {
    int data;
    Node lptr=null;
    Node rptr=null;
    Node(int data){
        this.data=data;
    }
}

class Tree{
    Node root =null;
    public void preOrder(Node point){
        if (point == null) {
            System.out.println("tree is empty");
            return;
        }

        System.out.println("Root : "+point.data);

        if(point.lptr!=null){
            System.out.println("left : "+(point.lptr.data));
            preOrder(point.lptr);
        }
        if(point.rptr!=null){
            System.out.println("right : "+(point.rptr.data));
            preOrder(point.rptr);
        }
    }



    public void inOrder(Node point){
        if (point == null) {
            System.out.println("tree is empty");
            return;
        }

        
        if(point.lptr!=null){
            inOrder(point.lptr);
        }
        System.out.println(point.data);
        if(point.rptr!=null){
            inOrder(point.rptr);
        }

        // if(point != null){
        //     inOrder(point.lptr);
        //     System.out.print(point.data + " ");
        //     inOrder(point.rptr);
        // }
    }
    public void postOrder(Node point){
        if (point == null) {
            System.out.println("tree is empty");
            return;
        }

        
        if(point.lptr!=null){
            preOrder(point.lptr);
        }
        if(point.rptr!=null){
            preOrder(point.rptr);
        }
        System.out.println(point.data);
    }
}
public class SimpleTree{
    public static void main(String[] args) {
        
    }
}