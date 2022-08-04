public class SelectionSort {
    public static void main(String[] args) {
        int arr[] ={6,5,4,3,2,1};
       
        selectionSort(arr,6);

    }
    public static void swap(int arr[], int i, int j) {
        int t= arr[i];
        arr[i]= arr[j];
        arr[j]= t;
        
    }
    public static void selectionSort(int arr[],int n){
        for(int i=0; i<n-1; i++ ){
            int ind= i;
            int j;
            for( j=i+1; j<n; j++){
                if(arr[j]<arr[ind]){
                   ind=j;
                }
            }
           swap(arr,ind,i);
        }
        for(int x : arr){
        System.out.print(x+ " ");
    }
    }
}
