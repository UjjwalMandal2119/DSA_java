package Operator;

public class unaryOperator {
    public static void main(String[] args) {
        byte a=50, b=20;
        System.out.println(++a>20 || ++b>2); //true;
        System.out.println(a);
        System.out.println(b);
        ternaryOperator(a, b);
    }
    public static void ternaryOperator(int a, int b){
        String S;
        S= a>b? "Hello":"Bye";
        System.out.println(S);
    }
}
//boolean logical & and  | 

//logical Operator

//&& || ! 
//&& and || also shortcircuit Operator
// in ternary operator it return the the vlaue;

