import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {



    public static void main(String []args) {

        Integer a=158;
        Integer b=158;
        System.out.println(a==b);


    }
    public static void reverse(int l,int r,int arr[]){
        Arrays.stream(arr).forEach(System.out::println);

        if(l>=r) return;
        int temp = arr[l];
        arr[l++] = arr[r];
        arr[r--] = temp;

        reverse(l,r,arr);
//        while(l<r) {

//            l++;
//            r--;
//        }
    }


    private static boolean check(HashMap<Character, Integer> hm) {
        String ransomNote = "aaa";
        for (int i = 0; i < ransomNote.length(); i++) {
            if (!hm.containsKey(ransomNote.charAt(i))) return false;
            else {
                hm.put(ransomNote.charAt(i), hm.getOrDefault(ransomNote.charAt(i), 0) - 1);
                if (hm.get(ransomNote.charAt(i)) <1) {
                    hm.remove(ransomNote.charAt(i));
                }
                System.out.println(hm);
            }
        }
        return true;
    }

}