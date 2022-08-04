public class Stack {
    int top=-1;
    int arr[];
    public Stack(int length){
        arr=new int [length];
    }    
    public void push(int x){
        if(isFull()) {
            System.out.println("Stack OverFlow!");
            return;
        }
        arr[++top]= x;
    } 
     boolean isEmpty(){
         return top==-1;
     } 
     boolean isFull(){
        return top==arr.length-1;
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack UnderFlow!");
            return Integer.MIN_VALUE;
        }
        return(arr[top--]);
    }
    void peek(){
        if(isEmpty()){
            System.out.println("Stack UnderFlow!");
            return ;
        }
        System.out.println((arr[top]));

        
    }
}
