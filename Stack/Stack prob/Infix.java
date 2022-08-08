import java.util.Scanner;
import java.util.Stack;

public class Infix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();
        String postFix="";
        for (Character c : s.toCharArray()) {
            if(c=='('){
                st.push(c);
            }
            else if(c==')'){
                while(!st.empty()&&st.peek()!='('){
                    postFix+=st.pop();
                }
                st.pop();
            }
            else if(c=='+'||c=='-'||c=='*'||c=='/'||c=='^'){
                while(!st.isEmpty()&& precedence(c)<=precedence(st.peek())){
                    postFix+=st.pop();
                }
                st.push(c);
            }
            else{
               postFix+=c;

            }
        }
        while(!st.isEmpty()){
            postFix+=st.pop();
        }
        System.out.println(postFix);
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
