public class LinkedList {
    class Node {
        int value;
        Node next;
        
        public Node(int x){
            this.value=x;
        }
    }
    
        int size=0;
    
        Node head;
        Node tail;
        public void getSize(){
           System.out.println(this.size);
        }
       
        public void addFirst(int val){
            Node n= new Node(val);
            n.next=head;
            head=n;
            this.size++;
        }
        
        public void addLast(int val){
           Node n= new Node(val);
           tail.next=n;
           tail=n;
           this.size++;
       }
      
       
      
   
        public void printList() {
           Node temp = head;
   
           while (temp != null) {
               System.out.print(temp.value + " ");
               temp = temp.next;
           }
           System.out.println();
       }
       public int deleteHead(){
        int x= head.value;
        head= head.next;
        return x;
       }
    
}
