import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int num;
        if(n%2==0){
            num=(n/2);
        }
        else num= (n/2)+1;
        int sp=1;
        for (int i = 1; i <=n; i++) {
           
            for (int j = 1; j <=num; j++) {
                System.out.print(j+ " ");
                
            }
            for (int j = 1; j <=sp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=num; j++) {
                System.out.print(j+ " ");
                
            }
           if(i<=n/2){
            if(n%2==0&&i==n/2){
                num++;
                sp-=2;
            }
            else{
                num--;
                sp+=2;
            }
           
           }
          else{
            if(n%2==0&&i==n-1){
                System.out.println("");
                break;
            }
            num++;
            sp-=2;
           }
           
            System.out.println("");
        }
    }
}
