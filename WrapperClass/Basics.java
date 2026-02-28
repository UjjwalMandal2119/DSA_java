package WrapperClass;


public class Basics {
    public static void main(String[] args) {
        int a =10; //stack memory
        Integer a1 = 10; //heap memoey main value store hota h aur variable ka address stack memory main hota h ,eg ARRAY main hota h
        Long l1 =89l; //type casting , Hardcode main input hamesa Integer main hota h
        long l2 =67;
        int b=89;
        Integer b1 =156;
        b1=b; //Auto Boxing primitive ko wrapper class main value store karna h
        a =a1; //Unboxing
        System.out.println(b1); //b1 main address hi aaya hoga par content print hoga
        Float f =18.9f; //Type casting  value by default double hota h isiliye type cast karna hota h Internally type casting nhi hota h
        Double d =6.8;
        Byte b3 =7;  //internally type casting hota h
        Short s =10;
        Boolean b4 = true;
        Character ch = 'a';

        Integer c1 =15;
        Integer c2= 15;
        Integer c3 =157;
        Integer c4 =157;
        System.out.println(c1 == c2);  //true  Integer Cache  Java internally maintains a cache for -128  to  127  ,Short, Integer, Long
        System.out.println(c3 == c4); //false; 157 is NOT between -128 to 127 So Java creates NEW objects every time.
        // == adress compare karta h wrapper class
        System.out.println(c3.equals(c4)); // ab value compare hoga  O/P=true;

    }
}
