public class NumberSystem {
    int base;
    //number should follow the conveting base property if we want to convert binary to decimal number should be 1 and 0
    int number;
    NumberSystem(int b, int n){
        this.base=b;
        this.number=n;
    }
    public void decimalToBase(){
        int p=1;
        int sum=0;
        int n=number;
        while(n>0){
            int rem= n%base;
            n/=base;
            sum+=(rem*p);
            p*=10;

        }
        System.out.println(sum);
    }
    public void baseToDecimal(){
        int p=1;
        int sum=0;
        int n=number;
        while(n>0){
            int rem= n%10;
            n/=10;
            sum+=(rem*p);
            p*=base;

        }
        System.out.println(sum);
    }
}
