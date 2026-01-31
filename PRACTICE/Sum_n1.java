package PRACTICE;
import java.util.*;
public class Sum_n1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element");
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            sum+=a;
        }
    System.out.println("The sum of n numbers"+ sum);

    }
    
}
