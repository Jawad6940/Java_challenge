import java.util.*;
public class NumOfRotation {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
    // int n= sc.nextInt();
    
    int arr[]= {8, 9, 10, 2, 5, 6};
    // for(int i=0; i<n; i++){
    //     arr[i]= sc.nextInt();
    int x= bin(arr);
   System.out.printf( "The array is rotated %d times",x);
   

    }
    public static int bin(int arr[]){
        int l=0,r= arr.length-1;

        if (arr[l] <= arr[r]) {
            return l;
        }
        while(l<r){
            int m= (l+r)/2;
           
            if(arr[m]>arr[r]) l=m+1;
            else r=m;
        }
        return r;
        //System.out.println(r);
    }
    
}
