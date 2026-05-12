package Bitmasking;

// Q.A magic number is defined as a number which can be expressed as a power of 5 or sum of unique powers of 5.

import java.util.Scanner;

// First few magic numbers are 5, 25, 30(5 +25), 125, 130(125 + 5), ....
// Write a function to find the nth Magic number

public class Magic_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println(Nth_MagicNumber(n));
    }
    public static int Nth_MagicNumber(int n){
        int ans=0;
        int mul=5;
        while(n >0){
            if((n & 1) !=0){
                ans= ans +mul;
            }
            mul= mul *5;
            n= n>>1;
        }
        return ans;
    }
}
