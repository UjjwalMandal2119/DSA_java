package PRACTICE;
import java.util.*;
public class OddAdd {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the n term ");
    int n=sc.nextInt();
    int sum=0;
    
    for(int i=0;i<n;i++){
        sum=sum+i*2+1;
    }
    System.out.println("sum of n odd numbers "+ sum);
    }
    
}
