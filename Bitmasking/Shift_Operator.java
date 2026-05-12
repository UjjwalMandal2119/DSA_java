package Bitmasking;

public class Shift_Operator {
    public static void main(String[] args) {
        int n=10;
        System.out.println(n >> 1); //right shift 2 se divide hota 

        int a=-11;  // 2's compliment lena hota h
        System.out.println(a >> 1);

        //left shift << , 2 se multiply hota h

        int b=15;
        System.out.println(b<< 1); //o/p=30;

        int c=-15;
        System.out.println(c<< 1); //O/P= -30
    }
}
