package BitwiseOperator;

import java.util.Scanner;

public class BitwiseNOT {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    System.out.println("enter the first number");
    int n1=sc.nextInt();
    System.out.println("enter the second number");
    int n2 =sc.nextInt();

    int c1=~n1;
    int c2 =~n2;
    System.out.println(Integer.toBinaryString(n1));
    System.out.println(Integer.toBinaryString(n2));
    System.out.println(Integer.toBinaryString(c1));
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(Integer.toBinaryString(c2));

    }

}
