package DataType;

import java.util.Scanner;

public class Octal_Decimal_Binary {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("enter the decimal number");
        int n=sc.nextInt();
        int sum=0;
        int mul =1;
        while(n>0){
            int rem =n%10; //rwquired base 10
            sum =sum + rem*mul;
            mul= mul*8; //source base
            n=n/10;  //required base
        }
        System.out.println("Octal to Decimal " + sum);
       int O_D=sum;
       sum=0;
       mul=1;
       while(O_D>0){
        int rem=O_D%2;
        sum=sum+rem*mul;
        mul =mul*10;
        O_D=O_D/2;
       }
       System.out.println( "Decimal to Binary "+sum);
    }
}
