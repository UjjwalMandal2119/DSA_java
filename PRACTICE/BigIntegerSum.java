//Program to Add Two BigIntegers in Java
package PRACTICE;
import java.math.BigInteger;
public class BigIntegerSum {
    public static void main(String args[]){
        BigInteger sum;
        String input1="8945568776468467164524767421867";
        String input2="3179824571687163746741357463816";
        BigInteger a= new BigInteger(input1);
        BigInteger b= new BigInteger(input2);
        sum=a.add(b);
        System.out.println("Sum of Two BigInteger: "+ sum);
    }
}
