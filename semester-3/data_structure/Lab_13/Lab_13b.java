import java.util.*;
class Doubly_List{
	Node first;
	Node last;
	class Node{
		int data;
		Node lptr;
		Node rptr;
		public Node(int data){
			this.data=data;
			this.lptr=null;
			this.rptr=null;

		}
	}
	public void ins_At_First(int data){
		Node n=new Node(data);
		if(first==null){
			n.lptr=null;
			n.rptr=null;
			first=n;
			last=n;
			return;
		}
		else{
			first.lptr=n;
			n.rptr=first;
			first=n;
		}
	}
	public void delete(int data){
		if(first==null){
			System.out.println("under flow:");
			return;
		}
		if(data==first.data){
			first=first.rptr;
			return;
		}
		Node save=first.rptr;
		Node pre=first;
		while(data!=save.data && save!=first){
				pre=save;
				save=save.rptr;
			}
			if(save.data!=data){
				System.out.println("Node not fount");
			}else{
				if(save==last){
					pre.rptr=save.rptr;
					last=pre;
				}
				//pre.link=save.link;
			}
	}
	//display link first to last
	public void display(){
		int i=0;
		Node save=first;
		while(save!=null){
			System.out.print("n["+i+"]:"+save.data);
			save=save.rptr;
			i++;
		}
		System.out.println();
	}
	//display link last to first
	public void display2(){
		int i=0;
		Node save=last;
		while(save!=null){
			System.out.print("n["+i+"]:"+save.data);
			save=save.lptr;
			i++;
		}
		System.out.println();
	}
}
public class Doubly_Link_Implement_72{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Doubly_List d1=new Doubly_List();
		d1.ins_At_First(10);
		d1.ins_At_First(20);
		d1.ins_At_First(30);
		d1.ins_At_First(40);
		d1.ins_At_First(50);
		d1.display();
		d1.delete(30);
		d1.display();
		d1.display2();
	}
}