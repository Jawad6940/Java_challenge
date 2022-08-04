import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
     
        LLStack s = new LLStack();
     
        while(true){
            System.out.println("-------------------");
            System.out.println("Enter \n 0 to push \n 1 to pop \n 2 to get peek  ");
            int input = sc.nextInt();
            switch (input){
                case 0:
                System.out.println("Enter the value: "); 
                s.push(sc.nextInt());
               break;

               case 1: System.out.println( s.pop());
               break;
               
               case 2:
               s.peek();
               break;
               default : System.out.println("Enter valid input! ");
               
               

            }
            
        }
       

}
}