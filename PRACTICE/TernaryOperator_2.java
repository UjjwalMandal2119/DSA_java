package PRACTICE;
import java.util.*;
public class TernaryOperator_2 {
    public static void main(String  args[]){
     System.out.println("Enter the number ");
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();
     int max=0;
     max=a>b?a>c?a:c:b>c?b:c;
     System.out.println ("max number is "+ max);
    }
    
}
