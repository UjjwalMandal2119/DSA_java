package DataType;

import java.util.Scanner;

public class Octal_to_Decimal {
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
        System.out.println(sum);
    }
}
