import java.util.ArrayList;
import java.util.List;

public class SumPattern {
    static int ans[];
    static List<List<Integer>> res;
    static int n;
    static int target=2;
    public static void main(String[] args) {
        int arr [] ={1,2,1};
        ans=arr;
        res=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        n=arr.length;
        sum(0,list,0);
        for (List<Integer> i : res) {
            System.out.println(i);
    }
}
    public static void sum(int i, List<Integer>list,int sum){
        if(i>=n){
            if(sum==target)
            res.add(new ArrayList<>(list));
            return;
        }
        sum+=ans[i];
        list.add(ans[i]);
        sum(i+1, list,sum);
        list.remove(list.size()-1);
        sum-=ans[i];
        sum(i+1, list,sum);
    }
}
