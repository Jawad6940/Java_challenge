package Queue;

public class Queue {
    int front =-1;
    int rear = -1;
    int count=0;
    int arr[];
    Queue (int l){
        arr= new int[l];
    }
    void enqueue(int value){
        if(count==arr.length){
            System.out.println("Queue OverFlow!");
            return;
        }
        if(front==-1) front++;
        rear=(rear+1)%arr.length;
        arr[rear]= value;
        count++;
    }
    int dequeue (){
        if(count==0){
            System.out.println("Queue UnderFlow!");
            return Integer.MIN_VALUE;
        }
        int ret=(arr[front]);
        front=(front+1)%arr.length;
        count--;
        if(count==0){
            front=-1;
            rear=-1;
            
        }
        return ret;
    }
    
}
