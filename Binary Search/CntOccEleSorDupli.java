public class CntOccEleSorDupli {
    

    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
    // int n= sc.nextInt();
    
    int arr[]= {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
    int y= 2;
    // for(int i=0; i<n; i++){
    //     arr[i]= sc.nextInt();
    boolean srch = true;
    int x= bin(arr,y,srch);
    int z= bin(arr,y,!srch);
    int res= z-x+1;
   System.out.printf( "Target %d occurs %d times",y,res);
   

    }
    public static int bin(int arr[],int k,boolean s){
        int l=0,r= arr.length-1;

        while(l<=r){
            int m = (l+r)/2;
            if(arr[m]==k) {
                
             if(s) r=m-1;
             else l=m+1;

        }
       else if(arr[m]>=k) r=m-1;
       else l=m+1;
        //System.out.println(r);
    }
    
}

