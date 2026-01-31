package function;
import java.util.*;

public class basic_function {
    public static void main(String args[]){
        System.out.println("Hellow I am learning JAVA");
        add(); //function calling
        sub();
        mul();
        div();
        System.out.println("I learning function concept");
    }
    // functiom defining
    public static void add(){
        int a=4;
        int b=5;
        int c=a+b;
        System.out.println(c);
    }
    public static void sub(){
        int a=6;
        int b=7;
        int c=a-b;
        System.out.println(c);
    }
    public static void mul(){
        int a=1;
        int b=5;
        int c=a*b;
        System.out.println(c);
    }
    public static void div(){
        int a=4;
        int b=2;
        int c=a/b;
        System.out.println(c);
    }
    
    
}
