package String;

public class BasicString2 {
    public static void main(String[] args) {
        String s ="hello";
        System.out.println(10 + s +30 + 40); //string plus something always string o/p 10hello3040  string  + number =string=number +string;
        System.out.println(10 + 20+ 30 +s +10); //here 60hello10  ,first number + number =number 
        System.out.println(10 +s +(30 +40)); //operator precceding
    }
}
