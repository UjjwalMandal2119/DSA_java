package PRACTICE;
import java.util.*;
//Sum of Two Numbers Using Command Line Arguments in Java
public class CLA_sum {
    public static void main(String args[]){
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=a+b;
        System.out.println("Sum:"+c);
    }
    
}
