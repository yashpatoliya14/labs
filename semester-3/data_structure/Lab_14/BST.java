import java.util.LinkedList;
import java.util.Queue;

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
    public void insert(Node root,int key){
        root = insertInto(root , key);
        
    }
    public Node insertInto(Node root ,  int key ){
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.data) {
            root.lptr = insert(root.lptr, key);
        } else if (key > root.data) {
            root.rptr = insert(root.rptr, key);
        }

        return root;
    }
    public Node delete(Node root, Node pre,int key){
        
        if (root == null) {
            return root;
        }
        if(root.data==key){
            if(root.rptr==null && root.lptr==null){
                if(root.data<pre.data){
                    pre.lptr=null;
                }         
            }
            if(root.lptr==null && root.rptr!=null){
                pre.rptr=root.rptr;                
            }
            if(root.lptr!=null && root.rptr==null){
                pre.rptr=root.lptr;                
            }

            if(root.lptr!=null && root.rptr!=null){
                Node temp = root.rptr;
                // pre.rptr=root.rptr;
                while(temp.lptr!=null){
                    temp=temp.lptr;
                }
                pre.rptr=root.rptr;
                temp.lptr=root.lptr;
            }
            return pre;
        }else if(root.data>key){
            return delete(root.lptr, root, key);
        }else{
            return delete(root.rptr, root, key);
        }


    }

    public int search(Node point,int key){
        if (point == null) {
            return -1;
        }
        
        if(point.data==key){
            return point.data;
        }
        if(point.lptr!=null){
             int check = search(point.lptr, key);
             if(check!=-1){
                return check;
             }
        }
            return search(point.rptr, key);

        
    }

    public boolean isSameTree(Node root1 , Node root2){
        if (root1 == null || root2==null) {
            return false;
        }        
        if(root1.lptr!=null){
            return isSameTree(root1.lptr, root2);
        }
        if(root1.data!=search(root2, root1.data)){
            return false;
        }
        if(root1.rptr!=null){
            return isSameTree(root1.rptr, root2);
        }
        return true;
    }

    public boolean isSymmetricCheck(Node root1,Node root2){
        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 == null || root2 == null) {
            return false;
        }
        
        
        if(root1.data!=root2.data){
            return false;
        }

        if(root1.lptr!=null && root2.rptr!=null){
            return isSymmetricCheck(root1.lptr, root2.rptr);
        }
        if(root1.rptr!=null && root2.lptr!=null){
            return isSymmetricCheck(root1.rptr, root2.lptr);
        }


        return true;
    }

    public boolean isSymmetric(Node root){
        return isSymmetricCheck(root.lptr,root.rptr);
    }
    
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


    public void levelOrder(Node root){
        if(root==null)  {
            return ;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node curr = q.remove();
            if (curr==null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(curr.data + " ");
                if (curr.lptr!=null) {
                    q.add(curr.lptr);
                }
                if (curr.rptr!=null) {
                    q.add(curr.rptr);
                }
            }
        }
        
        System.out.println(q);
    }
}

public class BST{
    public static void main(String[] args) {
        Tree t=new Tree();
        Tree t1=new Tree();
        
        //----------------------------------------check symmetric or not
        // Node new1 = new Node(9);
        // t.root=new1;
        // Node new2 = new Node(5);
        // t.root.lptr=new2;
        // Node new3 = new Node(5);
        // t.root.rptr=new3;
        // Node new4 = new Node(3);
        // t.root.lptr.lptr=new4;
        // Node new5 = new Node(6);
        // t.root.lptr.rptr=new5;
        // Node new6 = new Node(6);
        // t.root.rptr.lptr=new6;
        // Node new7 = new Node(3);
        // t.root.rptr.rptr=new7;


        t.insert(t.root, 1);
        t.insert(t.root, 2);
        t.insert(t.root, 3);
        t.insert(t.root, 11);
        t.insert(t.root, 7);
        t.insert(t.root, 5);
        t.insert(t.root, 4);
        t.insert(t.root, 6);


        // t1.root = t.insert(t1.root, 30);
        // t1.root = t.insert(t1.root, 20);
        // t1.root = t.insert(t1.root, 10);
        // t1.root = t.insert(t1.root, 5);
        // t.inOrder(t.root);
        System.out.println();
        // t.delete(t.root, null, 50);
        // t.inOrder(t.root);
        t.levelOrder(t.root);

    }
}