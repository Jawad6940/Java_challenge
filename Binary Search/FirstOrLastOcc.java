import java.util.*;
public class FirstOrLastOcc {
    public static void main(String[] args) {
        int arr[]= {0, 0, 0, 6, 6, 6, 8, 9, 9, 9};
        // for(int i=0; i<n; i++){
        //     arr[i]= sc.nextInt();
        int e=5;
        Arrays.sort(arr);
        int y= binFirst(arr,e);
        
        int x= binLast(arr,e);
        if(x!=y){
        if(x!=-1)  System.out.printf( "The last occurrence of element %d is located at index %d \n",e,x);
        else System.out.printf( "Element not found in the array \n");
}
       
    }
    public static int binFirst(int arr[],int k) {
        int l=0,r= arr.length-1;

        int f= -1;
        while(l<=r){
            int m = (l+r)/2;
            if(arr[m]==k) {
                
              f=m;
              r=m-1;

        }
       else if(arr[m]>=k) r=m-1;
       else l=m+1;
       
        
    }
    if(f!=-1) System.out.printf( "The first occurrence of element %d is located at index %d \n",k,f); 
    else
    System.out.printf( "Element not found in the array \n");
    return f;
      
}
public static int binLast(int arr[],int k) {
    int l=0,r= arr.length-1;

    int f= -1;
    while(l<=r){
        int m = (l+r)/2;
        if(arr[m]==k) {
            f=m;
            l=m+1;
    }
   else if(arr[m]>=k) r=m-1;
   else l=m+1;
   
    
}
return f;
}
}
