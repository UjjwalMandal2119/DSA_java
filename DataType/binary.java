package DataType;
import java.util.*;
public class binary {
    public static void main(String args[]){
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem=0;
        int mul=1;//source base
        int sum=0;
        while(n>0){
            rem=n%2;//required base
            sum=sum+rem*mul;
            mul=mul*10;
            n=n/2;

        }
        System.out.print("binary form of given number is:-"+ sum);
    }
}
