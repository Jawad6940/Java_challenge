// ++a increments and then uses the variable.
// a++ uses and then increments the variable.

// If you have

// a = 1;
// and you do

// System.out.println(a++); //You will see 1

// //Now a is 2

// System.out.println(++a); //You will see 3
//so in recursion if you do a=0 and call recusion(a++) here a in next line a=1; but while calling recurion a=0; so a nevwe update

public class ReverseArray {
    public static void main(String[] args) {
        int arr [] ={1,2,3,4,5};
        int n=5;
        reverse(arr,0)  ;
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static void reverse(int[] s,int start){
        if(start>=s.length/2){
            return;
        }
        else{
            int temp=s[start];
        s[start]=s[s.length-1-start];
        s[s.length-1-start]=temp;
        reverse(s,start+1);
    }
}
}
