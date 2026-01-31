package PRACTICE;
import java.io.*;
import java.util.*;
public class sum_n {
    public static void main(String args[]){
        System.out.println("enter the n number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("The sum of n natural number"+ sum);
    }
    
}
