public class ArrayStack {
    int top=-1;
    int length=5;
    int arr[]=new int[length];
    
     
    public void push(int x){
        if(isFull()) {
           length=length*2;
           int newArr[]=new int[length];
           for(int i=0; i<arr.length;i++){
               newArr[i]=arr[i];
           }
            arr=newArr;
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
