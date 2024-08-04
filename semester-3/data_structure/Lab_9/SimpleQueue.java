class Queue{
    int size=5;
    Queue(int size){
        this.size=size;
    }

    int arr[] = new int[size];
    int front=-1;
    int rear=-1;
    int N=size;
    public void enqueue(int Y){
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
    public int dequeue(){
        if(front==N || front==-1){
            System.out.println("queue is underflow");
            return -1; 
        }
        int Y =arr[front];
        arr[front]=0;
        front++;
        return Y;
    }

    public void display(){
        for (int i = front; i <=rear; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}

public class SimpleQueue {
    
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(5);
        q.enqueue(4);
        q.enqueue(3);
        q.enqueue(3);
        q.display();


    }    
}
