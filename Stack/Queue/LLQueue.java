package Queue;

class Node{
    int value;
    Node next;
   public Node(int x){
        this.value=x;
    }
}
public class LLQueue {

    Node front,rear;

    void enqueue(int x){
        Node newNode= new Node(x);

        if(front==null){
            
            rear= newNode;
            front=newNode;
            return;
        }
        rear.next=newNode;
        rear=rear.next;
        
    }
    int dequeue(){
        if(front==null){
            System.out.println("Queue UnderFlow");
            return Integer.MIN_VALUE;
        }
        Node temp= front;
        front= front.next;
        return temp.value;
    }
}
