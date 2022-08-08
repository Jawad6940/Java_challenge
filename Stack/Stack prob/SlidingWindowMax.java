import java.util.Scanner;
import java.util.Stack;

/**
 * SlidingWindowMax
 */
public class SlidingWindowMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr []= new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();

        }
        int nge[ ]= new int[n];
        Stack<Integer> st= new Stack<>();
       
        for (int i = 0; i < nge.length; i++) {
            while(!st.isEmpty()&&arr[st.peek()]<arr[i]){
                nge[st.pop()]=i;
            }
            
           
            st.push(i);
        }
        while(!st.isEmpty()) nge[st.pop()]=n;
        // for (int x : nge) {
        //     System.out.print(x+" ");
        // }
        int k = sc.nextInt();
        
        int j=0;
        for (int i = 0; i <=n-k; i++) {
           if(j<i){
            j=i;
           }
            while(nge[j]<i+k){
               j=nge[j];
              
            }
            System.out.print(arr[j]+" ");
        }
    }
}