package PRACTICE;
import java.util.*;
public class TernaryOperator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print(" enter two numbers");
        int a = sc.nextInt();
        int b= sc.nextInt();
        int max=0;
        max=a>b?a:b;
        System.out.println("the max number is "+ max);
    }
    
}
