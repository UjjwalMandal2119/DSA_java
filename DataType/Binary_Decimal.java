package DataType;
import java.util.*;
public class Binary_Decimal {
    public static void main(String args[]){
        System.out.println("Enter the binary number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem=0;
        int mul=1;//source base
        int sum=0;
        while(n>0){
            rem=n%10;//required base
            sum=sum+rem*mul;
            mul=mul*2;
            n=n/10;

        }
        System.out.print("Decimal form of given number is:-"+ sum);
    }
    
}
