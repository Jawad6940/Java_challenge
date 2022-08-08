import java.util.Scanner;
import java.util.Stack;

public class ClaculatorPostFix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Integer> st = new Stack<>();

        for (Character c : s.toCharArray()) {

            if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^') {
                int v2= st.pop();
                int v1= st.pop();
                int ans=evaluate(c, v1, v2); 
                st.push(ans);
            } else {
                st.push(c-'0');
            }

        }

        System.out.println(st.peek());
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
}
