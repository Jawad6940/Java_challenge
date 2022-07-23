import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int num =1,sp=n/2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=sp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=num; j++) {
                System.out.print(j+ " ");
                
            }
            if(i<=n/2){
                num+=2;
                sp--;
            }
            else{
                num-=2;
                sp++;
            }
           
            System.out.println("");
        }
    }
}
