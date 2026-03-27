package DataType;
import java.util.*;

public class Decimal_Binary {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        System.out.println("Binary to given Number " + BinaryToDecimal(n));
        BtoD(n);
        BinaryToDecimal_multiplication_10(n);
    }
    public static void BinaryToDecimal_multiplication_10(int n){
        int mul=1;
        int sum=0;
        while(n>0){
            int rem=n%2;  //base 2
            sum = sum + rem*mul;
            mul = mul*10; //for decimal
            n=n/2;
        }
        System.out.println(sum);
    }
  //using a empty String
    public static String BinaryToDecimal(int n){
        String Binary ="";
        while(n>0){
            int r=n%2;
            Binary =r+ Binary;
            n=n/2;
        }
       return Binary;
    }
   
    public static void BtoD(int num) {
        //java inbuild function 
        String binary = Integer.toBinaryString(num);
        System.out.println(binary);
    }
}

