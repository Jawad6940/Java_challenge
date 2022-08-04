public class QuicSort {
    public static void main(String[] args) {
        int arr[] ={10, 7, 8, 9, 1, 5};
       
        quickSort(arr,0,5);
        for(int x : arr){
            System.out.print(x+ " ");
        }
    }
    public static void swap(int arr[], int i, int j) {
        int t= arr[i];
        arr[i]= arr[j];
        arr[j]= t;
        
    }
    public static void quickSort(int arr[],int l,int r){
       
        if(l<r){
            int p=piv(arr,l,r);
            quickSort(arr, l, p-1);
            quickSort(arr, p+1, r);
           
        }
       
        
    }
    public static int piv(int arr[], int l, int r){
        int pi=arr[r];
        int j=l-1;
        for(int i=l; i<r;i++){
            if(arr[i]<pi){
                j++;
                swap(arr,j,i);
            }
        }
        swap(arr, j+1, r);
        return j+1;
    }
    
}
