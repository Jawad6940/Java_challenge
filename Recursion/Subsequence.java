import java.util.ArrayList;
import java.util.List;

public class Subsequence {
    static int ans[];
    static List<List<Integer>> res;
    static int n;
    public static void main(String[] args) {
        int arr [] ={1,2,3};
        ans=arr;
        res=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        n=arr.length;
        subSequence(0,list);
        for (List<Integer> i : res) {
            System.out.println(i);
    }
}
    public static void subSequence(int i, List<Integer>list){
        if(i>=n){
            res.add(new ArrayList<>(list));
            return;
        }
        subSequence(i+1, list);
        list.add(ans[i]);
        subSequence(i+1, list);
        list.remove(list.size()-1);
       
    }
}
