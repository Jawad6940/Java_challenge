import java.util.*;

//import java.io.*;

public class binsearch{
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        // int n= sc.nextInt();
        int t= sc.nextInt();
        int arr[]= {9,7,5,3,1};
        // for(int i=0; i<n; i++){
        //     arr[i]= sc.nextInt();

        // }
        quick(arr,0,arr.length-1);

        int l=0,r= arr.length-1;
        while(l<=r){
            int m= (l+r)/2;
            if(arr[m]==t){
                System.out.println(m);
                break;
            }
            else if(arr[m]>t) r=m;
            else l=m+1;
        }
        sc.close();
       System.out.println( bin(arr,0,arr.length-1,t) ); 

       // System.out.println("Hello world");
    }
    public static int bin(int arr[], int l, int r,int t){
        if(l<=r){
            int m=(l+r)/2;
            if(arr[m]==t) return (m);
            else if(arr[m]>t) return bin(arr,l,m,t);
            else return bin(arr,m+1,r,t);
        }
        return -1;

    }
        public static void quick(int arr[], int l, int r){
            
            if(l<r){
                int p= piv(arr,l,r);
                quick(arr,l,p-1);
                quick(arr,p+1,r);

            }
        }
        public static int piv(int arr[], int l, int r){
            int pivo= arr[r];
            int i=l-1;
            for( int j = l; j<r; j++){
                if(arr[j]<pivo){
                    i++;
                    swap(arr,i,j);

                }
            }
            swap(arr,i+1,r);
            return i+1;

            

        }
        public static void swap(int arr[], int l, int r){
            int temp = arr[l];
            arr[l]= arr[r];
            arr[r]=temp;
        }

}