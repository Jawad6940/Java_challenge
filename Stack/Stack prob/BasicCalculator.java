import java.beans.EventHandler;
import java.util.Scanner;
import java.util.Stack;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        System.out.println(Math.abs(calculate(s))); 
           
        
    }
   public static int calculate(String s) {
        Stack<Integer> operand =new Stack<>();
        Stack<Character> operator =new Stack<>();
        int ans=0;
        for (int i = 0; i < s.length(); i++) {
            char c= s.charAt(i);
            if(c=='('){
                operator.push(c);
            }
            else if(Character.isDigit(c)){
                operand.push(c-'0');
 
             }
            else if(c==')'){
                while(!operator.isEmpty()&&operator.peek()!='('){
                    int n2= operand.pop();
                    int n1= operand.pop();
                    char op= operator.pop();
                    ans=evaluate(op,n1,n2);
                    operand.push(ans);
                }
                operator.pop();
            }
            else if(c=='+'||c=='-'||c=='*'||c=='/'||c=='^'){
                while(!operator.isEmpty()&&precedence(c)<=precedence(operator.peek())){
                    char opr=operator.pop();
                    int v2=operand.pop();
                    int v1=operand.pop();

                    int opVal= evaluate(opr,v1,v2);
                    operand.push(opVal);
                }
                operator.push(c);
                
            }
           
            
        }
        while(!operator.isEmpty()){
            int n2= operand.pop();
            int n1= operand.pop();
            char op= operator.pop();
            ans=evaluate(op,n1,n2);
            operand.push(ans);
        }

        return ans;
    }
    public static int evaluate(char op, int n1, int n2){
        
        switch (op) {
            case '+':
                
                return n1+n2;
            case '-':
                
                return n1-n2;
            case '*':
                
                return n1*n2;
            case '/':
            
                return n1/n2;
        
            default:
            return 0;
        }
    }
    public static int precedence(char op){
        switch (op) {
            case '+' :
                return 1;
            case '-' :
                return 1;
            case '*':
            return 2;    
            case '/':
            return 2;    
            case '^': 
            return 3;
            default:
                return 0;
        }
    }
}
