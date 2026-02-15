package Basics;

import java.util.Scanner;

public class GCD {
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the numbers");
         int n1= sc.nextInt();
         int n2= sc.nextInt();
         System.out.println(greatestCommonDivisor(n1,n2));

    }
    public static int greatestCommonDivisor(int n1, int n2){
        int r=0;
        if(n1>n2){
            while(n1%n2!=0){ //implementation uses the Euclidean algorithm
                r=n1%n2;
                n1=n2;
                n2=r;
            }
        }else{
                while(n2%n1 !=0){
                    r=n2%n1;
                    n2=n1;
                    n1=r;
                }
            }
            return r;
    }
}

