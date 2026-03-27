package DataType;

import java.util.Scanner;

public class Char_Demo {
    public static void main(String[] args) {
        char ch='a';
        char ch1='b';
        System.out.println(ch);
        System.out.println(ch1);
        System.out.println((int)(ch));// explicit type casting for corresponding integer value;
        System.out.println((int)(ch1));
        System.out.println(ch + ch1); // type casting hoga internal type casting hota h

        int x=19;
        x++;// (int)(x+1)
        ch++; //ch = (char)(ch +1)

        System.out.println(ch);
        ch =(char)(ch+1);
        System.out.println(ch);
        ch+=1; //implicit type casting
        System.out.println(ch);


        //how to take character input
        Scanner sc = new Scanner(System.in);
        ch=sc.next().charAt(0);
       
        System.out.println(ch);
    }
}
