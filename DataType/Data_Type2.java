package DataType;

public class Data_Type2 {
    public static void main(String[] args) {
        int x=5; //hard core value is caleed literals and it's type is  Integer

        int y=-5; //2's complement karke system main store hota h
         int i=10;
         byte b=10;
         long l = 10;
         short s=10;
        // b=i; //incompatible types: possible lossy conversion from int to byte
        b=(byte)i;// this mean we consider last 8 bit   
        System.out.println(b);
        int i1=2155;
        b=(byte)i1;
        System.out.println(b);
       // long l1=10000000000 ;    //(10¹⁰) is greater than Integer.MAX_VALUE, so the compiler complains before even assigning it to long.
       long l1=100000000000l;//we must tell Java that the literal is a long by adding L (or l) at the end:

    }
}
