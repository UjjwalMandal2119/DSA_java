package Basics;
// Write a program that takes a number as input.

import java.util.*;


// Assume the following:

// The number contains n digits
// Each digit is unique
// Each digit lies in the range 1 to n
// 🔷 Task

// You need to find the inverse of the number.

// 🔹 Definition of Inverse:

// For a number, the position and value of digits are swapped.

// If a digit d is at position p in the original number,
// then in the inverse number, digit p will be placed at position d.
// 🔷 Example

// Input:

// 32145

// Explanation:

// In 32145, digit 5 is at position 1 → so in inverse, 1 goes to position 5
// Digit 4 is at position 2 → so 2 goes to position 4
// Continue similarly...

// Output:

// 12543
public class InverseOfNumber {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number ");
      int n=sc.nextInt(); 
      int pos=1;
      int sum=0;
      while(n>0){
        int rem = n%10;
        //sum =(int)(sum + pos * Math.pow(10, rem-1)); //expilicit type casting
        sum += pos * Math.pow(10, rem-1);  //internal type casting
        pos++;
        n=n/10;
      }
      System.out.println("Inverse of Number "+ sum);
    }
}
