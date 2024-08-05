import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n=361;
        int range= (int)Math.sqrt(n);
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        for(int i=2;i<=range;i++){
            if(n%i==0){
                list.add(i);
            }
        }
        for(int i=list.size()-1;i>=0;i--){
            int val= n/list.get(i);
            if(val!=list.get(i)){
                list.add(val);
            }
        }
        System.out.println(list);
    }
    public static int reverse(int x) {
        int n=x;
        int sum =0;
        while(n!=0){
            int d= n%10;
            sum=sum*10+d;
            System.out.println(sum+" "+n);
            n/=10;
        }
        return sum;
    }
    public static void mergeSort(int[] arr, int l, int r){
        if(l<r){
            int m= (l+r)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(l,m,r,arr);

        }
    }
    public static void merge(int l, int m, int r, int arr[]){
        int s1=m+1-l;
        int s2=r-m;
        int left[]= new int [s1];
        int right[]= new int [s2];
        for(int i=0;i<s1;i++) left[i]=arr[i+l];
        for(int i=0;i<s2;i++) right[i]=arr[m+i+1];
        int i=0,j=0,k=l;
        while(i<s1 || j<s2){
            if(i<s1 && j<s2){
                if(left[i]<right[j]){
                    arr[k++]=left[i++];
                }else{
                    arr[k++]=right[j++];
                }
            }else if(i<s1){
                arr[k++]=left[i++];
            }else{
                arr[k++]=right[j++];
            }
        }
    }
}





