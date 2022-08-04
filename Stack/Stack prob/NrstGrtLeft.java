 
import java.util.*;

public class NrstGrtLeft {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
	 int arr[] = new int [n];
     int ans[] = new int [n];
     for(int i=0;i<n;i++) arr[i]= sc.nextInt();
    
        Stack <Integer> st = new Stack<>();
    //   
       
    //   for(int i=n-1; i>=0; i--){
            
    //     while(!st.isEmpty()&&(arr[st.peek()]<arr[i])){
         
    //         ans[st.pop()] = arr[i];
    //     }
    //     st.push(i);
    // }
    // while(!st.isEmpty()) ans[st.pop()]=-1;
    // 2nd

    for(int i=0; i<n; i++){
        if(st.isEmpty()||st.peek()<arr[i]) ans[i]=-1;
        while(!st.isEmpty()){
            if((st.peek()>arr[i])){
            ans[i]= st.peek();
        break;
    }
            else st.pop();
        }
       
        
        st.push(arr[i]);
    }
    
    for (Integer x : ans) {
        System.out.print(x+" ");
    }
    

    }
}

