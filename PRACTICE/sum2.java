package PRACTICE;
import java.util.Scanner;
public class sum2 {
    public  static void main(String args[]){
        System.out.println("enter the three number");
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int sum=a+b+c;
        System.out.println("sum of three number " + sum);
        System.out.println("sum" + a + b+  c);
        System.out.println("sum"+(a+b+c));
    }
    
}
