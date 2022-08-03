import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int num=2*n;
       
        int sp=n;
        
        for (int i=0;i<=num; i++) {
           int maxRow=0, maxCol=0, left=0,right=0,top=0,bot=0,ans=0;
            for (int j = 0; j <=num; j++) {
                left=j;
                right=(num-j);
                top=i;
                bot=(num-i);
                maxRow=Math.min(top,bot);
                maxCol=Math.min(left,right);
                ans=Math.min(maxRow,maxCol);
                System.out.print(ans+" ");
            }
           
            System.out.println("");
        }
    }
}

// 0 0 0 0 0 0 0 0 0 0 0 
// 0 1 1 1 1 1 1 1 1 1 0
// 0 1 2 2 2 2 2 2 2 1 0
// 0 1 2 3 3 3 3 3 2 1 0
// 0 1 2 3 4 4 4 3 2 1 0
// 0 1 2 3 4 5 4 3 2 1 0
// 0 1 2 3 4 4 4 3 2 1 0
// 0 1 2 3 3 3 3 3 2 1 0
// 0 1 2 2 2 2 2 2 2 1 0
// 0 1 1 1 1 1 1 1 1 1 0
// 0 0 0 0 0 0 0 0 0 0 0