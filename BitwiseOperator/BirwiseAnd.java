//Bitwise And operator woks on Binary ,it first convert int decimal to binary then perform 
//AND operation then return the result in decimal
//for this we use single '&'
package BitwiseOperator;
import java.util.*;

public class BirwiseAnd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    System.out.println("enter the first number");
    int n1=sc.nextInt();
    System.out.println("enter the second number");
    int n2 =sc.nextInt();

    int c=n1&n2;
    System.out.println(Integer.toBinaryString(n1));
    System.out.println(Integer.toBinaryString(n2));
    System.out.println(Integer.toBinaryString(c));
    System.out.println(c);
    evenOrOdd(c);

    }

    //we can use bitwise and for odd and even chech also
public static void evenOrOdd(int c){
 int d =(c &1);
 if(d==1)
    System.out.println("odd");
else
    System.out.println("even");
}
 
}
