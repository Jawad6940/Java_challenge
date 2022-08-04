public class MergeSort {
    public static void main(String[] args) {
        int arr[] ={6,5,4,3,2,1};
       
        mergeSort(arr,0,5);
        for(int x : arr){
            System.out.print(x+ " ");
        }
    }
    public static void swap(int arr[], int i, int j) {
        int t= arr[i];
        arr[i]= arr[j];
        arr[j]= t;
        
    }
    public static void mergeSort(int arr[],int l,int r){
       if(l==r) return;
        if(l<r){
            int m=(l+r)/2;
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            merge(arr,l,m,r);
        }
       
        
    }
    public static void merge(int arr[],int l,int m , int r){
        int s1=m+1-l, s2=r-m;
        int left[]= new int [s1];
        int right[]= new int[s2];
        for(int i=0;i<s1;i++) left[i]= arr[i+l];
        for(int i=0;i<s2;i++) right[i]= arr[i+m+1];
        int i=0,j=0,k=l;
        while(i<s1&&j<s2){
            if(left[i]<right[j]) {
                arr[k]= left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<s1){
            arr[k]= left[i];
            i++;
            k++; 
        }
        while(j<s2){
            arr[k]= right[j];
            j++;
            k++; 
        }
    }
    
}
