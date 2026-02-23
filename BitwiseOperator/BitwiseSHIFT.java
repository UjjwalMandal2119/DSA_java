package BitwiseOperator;

import java.util.Scanner;

public class BitwiseSHIFT {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  number");
        int n1=sc.nextInt();
       
        
        int c1 =n1 << 1; //leftshift operator  the direction of arrow indicate toward the left side
        //from left shift operator we cn say that the value will increase

        int c2 =n1 >> 1; //rightshift operator the dirction of arrow indicate toward the right side
        //with right side operator value get decrase as we can say that the LSB get VANISHED;

        int c3 =n1 >>> 1;  //unsigned right shift
       
       System.out.println(Integer.toBinaryString(n1));
    
       System.out.println("left shift");
       System.out.println(Integer.toBinaryString(c1));
       System.out.println(c1);
       System.out.println("right shift");
       System.out.println(Integer.toBinaryString(c2));
       System.out.println(c2);
       System.out.println("unsigned rigth shift");
       System.out.println(Integer.toBinaryString(c3));
       System.out.println(c3);
    
    }
 
}
