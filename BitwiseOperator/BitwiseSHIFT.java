package BitwiseOperator;

import java.util.Scanner;

public class BitwiseSHIFT {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int n1=sc.nextInt();
        System.out.println("enter the second number");
        int n2 =sc.nextInt();
        
        int c1 =n1 << 1; //leftshift operator  the direction of arrow indicate toward the left side

        int c2 =n2 >> 1; //rightshift operator the dirction of arrow indicate toward the right side
       
       System.out.println(Integer.toBinaryString(n1));
       System.out.println(Integer.toBinaryString(n2));
       System.out.println("left shift");
       System.out.println(Integer.toBinaryString(c1));
       System.out.println(c1);
       System.out.println("right shift");
       System.out.println(Integer.toBinaryString(c2));
       System.out.println(c2);
    
    }
 
}
