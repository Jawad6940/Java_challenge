package Queue;


    import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
       //1 System.out.println("Enter the length: ");
        
       LLQueue q= new LLQueue();
        while(true){
            System.out.println("-------------------");
            System.out.println("Enter \n 0 to enqueue \n 1 to dequeue ");
            int input = sc.nextInt();
            switch (input){
                case 0:
                System.out.println("Enter the value: "); 
                q.enqueue(sc.nextInt());
               break;

               case 1: System.out.println(q.dequeue()); 
               break;
               
               default : System.out.println("Enter valid input! ");
               

            }
            
        }
       

}
}
    

