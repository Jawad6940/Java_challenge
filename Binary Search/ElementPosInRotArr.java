public class ElementPosInRotArr {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
     // int n= sc.nextInt();
     
     int arr[]= {8, 9, 10, 2, 5, 6};
     // for(int i=0; i<n; i++){
     //     arr[i]= sc.nextInt();
     int x= bin(arr,6);
    System.out.printf( "The Element found at index %d",x);
    
 
     }
     public static int bin(int arr[],int k){
        int l=0,r= arr.length-1;

       
        while(l<=r){
            int m= (l+r)/2;
           if(arr[m]==k) return m;
           //System.out.println(l);
            if(arr[m]>arr[r]){
               if(arr[m]>k&&arr[l]<=k) r=m-1;

               else l=m+1;
           }
           else {
            if(k>arr[m]&&k<=arr[r]) l=m+1;

            else r=m-1;
           }
            
        }
        return -1;
        //System.out.println(r);
    }
    
}
