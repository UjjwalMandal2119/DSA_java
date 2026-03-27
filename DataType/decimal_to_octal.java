package DataType;

import java.util.Scanner;

public class decimal_to_octal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the decimal number");
        int n=sc.nextInt();
        int sum=0;
        int mul =1;
        while(n>0){
            int rem =n%8; //rwquired base 8
            sum =sum + rem*mul;
            mul= mul*10;
            n=n/8;
        }
        System.out.println(sum);
    }
}
