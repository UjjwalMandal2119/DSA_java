package String;

public class Stringmethod {
    public static void main(String[] args) {
         String str1="Hello";
        String str2= new String("Hello");
         String str3="Hello";
        String str4= new String("Hello");

        int a = 9;
        int b= 9;
        System.out.println(a==b); //in int is compare value of variable;

        System.out.println(str1 == str2); //Here is compare address of String variable; so it return false; both are store in different location in heap one is in pool 'str1';

        System.out.println(str1==str3);// it give true because both are in pool

        System.out.println(str2 ==str4); //in heap different location/different memory address

        System.out.println(str1.equals(str2)); //equal() method compare contents 
    }
}
