import java.util.Scanner;
import java.util.Stack;

public class PostFix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<String> st = new Stack<>();
        String infix = "";
        for (Character c : s.toCharArray()) {

            if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^') {
                String v2= st.pop();
                String v1= st.pop();
                infix="("+v1+c+v2+")";
                st.push(infix);
            } else {
                st.push(c+"");
            }

        }

        System.out.println(infix);
    }
    // public static int precedence(char op){
    // switch (op) {
    // case '+' :
    // return 1;
    // case '-' :
    // return 1;
    // case '*':
    // return 2;
    // case '/':
    // return 2;
    // case '^':
    // return 3;
    // default:
    // return 0;
    // }
    // }
}
