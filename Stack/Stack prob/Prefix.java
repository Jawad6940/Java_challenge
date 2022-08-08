import java.util.Scanner;
import java.util.Stack;
//given a post fix expression
public class Prefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<String> st = new Stack<>();
        String prefix = "";
        for (Character c : s.toCharArray()) {

            if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^') {
                String v2= st.pop();
                String v1= st.pop();
                prefix=c+v1+v2;
                st.push(prefix);
            } else {
                st.push(c+"");
            }

        }

        System.out.println(prefix);
    }
}
