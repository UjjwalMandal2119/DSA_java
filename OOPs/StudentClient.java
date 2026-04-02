package OOPs;

import java.util.ArrayList;
import java.util.Scanner;
//import OOPs.Student; karne ka need nhi ,kiyoki ye same package main h
public class StudentClient {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in); 
        ArrayList<Integer> ll = new ArrayList<>();
        ll.add(10);
        ArrayList<Integer> lll = new ArrayList<>();
        lll.add(15);
        System.out.println("Hi");
        Student s1 =new Student();
        s1.name ="Ujjwal";
        s1.age=25;
        s1.Intro_yourself();
        Student s2 =new Student();
        s2.name ="Ujjwal Mandal";
        s2.age=14;
        s2.Intro_yourself();
        s2.SayHey("Courage");
        s1.SayHey("Confidence");

     Student.fun();  //method.
     s1.fun();
     s2.fun();
    }
    static {
        System.out.println("let's crack it");
    }
    static {
        System.out.println("Bagwan usi ka madat karta hai jo apni madat  khud karta h");
    }
}
