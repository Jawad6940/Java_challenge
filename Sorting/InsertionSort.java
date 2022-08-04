public class InsertionSort {
    public static void main(String[] args) {
        int arr[] ={6,5,4,3,2,1};
       
        insertionSort(arr,6);
    }
    public static void swap(int arr[], int i, int j) {
        int t= arr[i];
        arr[i]= arr[j];
        arr[j]= t;
        
    }
    //
    public static void insertionSort(int arr[],int n){
        for(int i=1; i<n; i++ ){
            int t= arr[i];
            int j-1;
            while( j>=0&&arr[j]>t){
              
                    arr[j+1]= arr[j];
                j--;
            }
            arr[j+1]= t;
        }
        for(int x : arr){
        System.out.print(x+ " ");
    }
    }
}
