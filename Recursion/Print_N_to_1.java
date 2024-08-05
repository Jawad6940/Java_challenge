/**
 * Print_N_to_1
 */
// Problem Statement: Given a number n. Print a sequence from n to 1 and again from 1 to n using recursion.

// Example:
// Input:
// n= 4

// Output:
// 4 3 2 1 1 2 3 4
// Explanation:
// Since n is 4, the sequence starts from 4 to 1 and again from 1 to 4.
public class Print_N_to_1 {

    public static void main(String[] args) {
        int n=5;
        print(n);
    }
    public static void print(int n){
        if(n<1){
            return;
        }
        System.out.print(n+" ");
        print(n-1);
        System.out.print(n+" ");
    }
}