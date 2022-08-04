public class LLStack {
   LinkedList l = new LinkedList();
       public boolean isEmpty(){
           return (l.head==null);
       }
       public void push(int x){
           l.addFirst(x);
       }
       public int pop(){
           if(isEmpty()) {
               System.out.println("Stack UnderFlow!");
               return Integer.MIN_VALUE;
           }
         return l.deleteHead();
       }
       public int peek(){
        if(isEmpty()) {
            System.out.println("Stack UnderFlow!");
            return Integer.MIN_VALUE;
        }
     
        return l.head.value;

       }
       

}
