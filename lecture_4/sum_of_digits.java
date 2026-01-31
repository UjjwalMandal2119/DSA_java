package lecture_4;
import java.util.*;
public class sum_of_digits {
    public static void main(String args[]){
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem=0,sum=0;
        while(n!=0){
            rem=n%10;
            n=n/10;
            sum=sum+rem;
        }
       System.out.print("Sum of digits:-"+ sum);

    }
    
}
