class Queue{
	int size=5;
    Queue(int size){
        this.size=size;
    }

    int arr[] = new int[size];
    int front=-1;
    int rear=-1;
    int N=size;
    public void insertAtRear(int Y){
        
        if(rear>=N-1){
            System.out.println("queue is overflow");
            return; 
        }
        if(front==-1){
            front++;
        }
        rear++;
        arr[rear]=Y;
    }
    public int deleteFromFront(){
        if(front==N || front==-1){
            System.out.println("queue is underflow");
            return -1; 
        }
        int Y =arr[front];
        arr[front]=0;
        front++;
        return Y;
    }

    public int deleteFromRear(){
        if(front==rear || rear==-1){
            System.out.println("queue is underflow");
            return -1; 
        }
        int Y =arr[rear];

        if(front==rear){
        	arr[rear]=0;
        	front=rear=-1;
        	return Y;
        }
        arr[rear]=0;
        rear--;
        return Y;
    }
    public void insertAtFront(int Y){
        if(front==0){
            System.out.println("queue is overflow");
            return ; 
        }
        if(front==-1){
        	front=rear=1;
        }else{
        	front--;
        }
        arr[front]=Y;
    }

    public void display(){
        for (int i = front ; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class DoubleEndedQueue{
	public static void main(String[] args) {
		Queue q = new Queue(5);
        q.insertAtFront(5);

        q.display();

	}
}