package PRACTICE;
import java.util.*;
public class EvenAdd {
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number of n term");
    int n=sc.nextInt();
    int sum=0;
    for(int i=1;i<=n;i++){
        sum=sum+i*2;
    }
    System.out.println("the sum of n even numbers"+ sum);
    }
}
