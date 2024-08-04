import java.util.Scanner;
class Node {
    String info;
    Node Lptr;
    Node Rptr;

    public Node(String info) {
        this.info = info;
        this.Lptr = null;
        this.Rptr = null;
    }
}

class DoublyLL{
    Node leftMost = null;
    Node rigthMost = null;
    Node currentSong = leftMost;
    int length = 0;
    String music;

    public void addMusicAtFirst(String info){
        Node newNode = new Node(info);
        length++;
        if(leftMost == null){
            leftMost = newNode;
            rigthMost = newNode;
            currentSong = newNode;
            return;
        }
        newNode.Rptr = leftMost;
        leftMost.Lptr = newNode;
        leftMost = newNode;
        currentSong = leftMost;
    }

    public void addMusicAtLast(String info){
        Node newNode = new Node(info);
        length++;
        if(leftMost == null){
            leftMost = newNode;
            rigthMost = newNode;
            return;
        }
        rigthMost.Rptr = newNode;
        newNode.Lptr = rigthMost;
        rigthMost = newNode;
    }

   

    
    public void removeMusic(String music){
        
        Node save = leftMost;
        while(save.info!=music){
            save= save.Rptr;
        }
        
        if(leftMost==save){
            leftMost = leftMost.Rptr;
            leftMost.Lptr=null;
            currentSong=leftMost;   
            length--;
        }else if(rigthMost==save){
            rigthMost = rigthMost.Lptr;
            rigthMost.Rptr=null;
            length--;
        }else{
            save.Lptr.Rptr = save.Rptr;
            save.Rptr.Lptr = save.Lptr; 
            length--;
        }
        
    }

    public void previousSong(){
        if(currentSong.Lptr==null){
            System.out.println("Please add a song");
        }else {
            currentSong = currentSong.Lptr;
        }
    }
    public void nextSong(){
        if(currentSong.Rptr==null){
            currentSong= leftMost;
        }else {
            currentSong = currentSong.Rptr;
        }
    }

    public void traversal(){
        Node save = leftMost;
        while (save != null) {
            System.out.print(save.info + " ");
            save = save.Rptr;
        }
        System.out.println();
        System.out.println("Total Songs : " + length);
    }
}

public class MusicPlayer {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Delete Position : ");
        // String music = sc.next();

        DoublyLL dLL = new DoublyLL();
        dLL.addMusicAtFirst("abc");
        dLL.addMusicAtFirst("xyz");
        dLL.addMusicAtLast("pqr");
        dLL.addMusicAtLast("aaa");
        dLL.addMusicAtLast("bbb");
        dLL.addMusicAtLast("ccc");
        dLL.removeMusic("xyz");
        dLL.previousSong();
        System.out.println("current song : " + dLL.currentSong.info);
        dLL.traversal();
        
    }
}
