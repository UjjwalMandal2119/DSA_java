package DataType;
import java.util.*;

public class Decimal_Binary {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        System.out.println("Binary to given Number " + BinaryToDecimal(n));
        BtoD(n);
    }

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
       
        String binary = Integer.toBinaryString(num);
        System.out.println(binary);
    }
}

