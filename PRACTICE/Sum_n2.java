package PRACTICE;
import java.util.*;
public class Sum_n2 {
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number of nth natural number");
     int n=sc.nextInt();
     int sum=(n *(n+1))/2;
     System.out.println("Sum of natural number"+ sum);
    }
    
}
