class Node {
    Node lptr=null;
    Node rptr=null;
    String data;

    Node(String data){
        this.data=data;
    }
}

class DLL{
    Node head=null;
    Node tail=null;
    public void addMusicAtFirst(String name){
        Node newNode = new Node(name);
        if(head==null){
            head=tail=newNode;
        }
        head.lptr = newNode;
        newNode.rptr = head;
        head= newNode;
    }
    public void addMusicAtLast(String name){
        Node newNode = new Node(name);
        if(head==null){
            head=tail=newNode;
        }
        tail.rptr = newNode;
        newNode.lptr = tail;
        tail= newNode;
    }

    public void removeSong(String name){
        Node save = head;
        if(save.data==name && tail.data==name){
            head=tail=null;
            return;
        }else if(save.data==name){
            head = head.rptr;
            return;
        }
        while(save.rptr.data==name){
            save = save.rptr;
        }

            save.rptr = save.rptr.rptr;
            if(save.rptr==tail){
                tail = save.rptr;
            }
        
    }

    public void displayPlaylist(){
        Node save = head;
        while(save!=null){
            System.out.println(save.data);
            save = save.rptr;
        }

    }


}

public class MusicPlayer{
    public static void main(String[] args){
        DLL d = new DLL();

        d.addMusicAtFirst("song0");
        d.addMusicAtFirst("song1");
        d.removeSong("song0");
        d.displayPlaylist();
    } 
}