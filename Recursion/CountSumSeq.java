import java.util.*;

public class CountSumSeq {
    static int ans[];
    static List<List<Integer>> res;
    static int n;
    static int target=2;
    public static void main(String[] args) {
        int arr [] ={1,2,1,5,2,9,1};
        ans=arr;
        res=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        n=arr.length;
        System.out.println(

            sum(0,list,0)
        ); 
        for (List<Integer> i : res) {
            System.out.println(i);
    }
}
    public static int sum(int i, List<Integer>list,int sum){
        if(i>=n){
            if(sum==target){
            res.add(new ArrayList<>(list));
        return 1;
        }
            return 0;
        }
        sum+=ans[i];
        list.add(ans[i]);
        int left=sum(i+1, list,sum);
        list.remove(list.size()-1);
        sum-=ans[i];
        int right=sum(i+1, list,sum);
        return left+right;
    }

}
