package recursion;

import java.util.Scanner;

public class tester {
    public static void main(String args[]){
    System.out.println("enter the radius of circle");
		Scanner sc= new Scanner(System.in);
		float r=sc.nextFloat();
		float pi=3.14f;
		float arr=pi*r*r;
		System.out.println("the area of circle"+arr);
}
}
