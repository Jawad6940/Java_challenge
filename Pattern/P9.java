import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int num=2*n;
   
    int sp=n;
    
    for (int i=1;i<num; i++) {
       int maxRow=0, maxCol=0, left=0,right=0,top=0,bot=0,ans=0;
        for (int j = 1; j <num; j++) {
            left=j;
            right=(num-j);
            top=i;
            bot=(num-i);
            maxRow=Math.max(top,bot);
            maxCol=Math.max(left,right);
            ans=Math.max(maxRow,maxCol);
            System.out.print(ans%n+1+" ");
        }
       
        System.out.println("");
    }
}
}

// 5 5 5 5 5 5 5 5 5 
// 5 4 4 4 4 4 4 4 5
// 5 4 3 3 3 3 3 4 5
// 5 4 3 2 2 2 3 4 5
// 5 4 3 2 1 2 3 4 5
// 5 4 3 2 2 2 3 4 5
// 5 4 3 3 3 3 3 4 5
// 5 4 4 4 4 4 4 4 5
// 5 5 5 5 5 5 5 5 5