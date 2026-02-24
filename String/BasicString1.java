package String;

public class BasicString1 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Everyone";

        s1= s1+s2; //internally new keyword chal jata h, pool se bahar banega;

        String str1 = new String("HELLO");
        String str2 = new String("EVERYONE");

        str1=str1+str2; //str1 address changed in same address concatatination don't occur
        s2=s2 + "Ujjwal";

        String s = "Hello" + "Everyone"; //for literals concatatination occur in pool
        System.out.println(str1);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s);
        
    }
}


//we cannot change string in same location ,that string is called immutable;

//garbage collector run bydefault , it called unused variables

// where new keyword involves ,contents in heap