import java.util.*;
public class test {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nums=5;
    int p=sc.nextInt();
    int q= sc.nextInt();
    int mid = (p+q)/2;
    int next = (mid + 1) % nums;
    int prev = (mid - 1 + nums) % nums;
    
    System.out.println(next+" "+prev);
}
}
