package Basics;

// Write a program that takes the following inputs:

// Minimum value of temperature in Fahrenheit
// Maximum value of temperature in Fahrenheit
// Step size

// The program should print a table showing the Fahrenheit to Celsius conversion for all values starting from the minimum up to the maximum (inclusive), increasing by the given step size.

// Use the formula:

// 𝐶
// =
// 5
// 9
// (
// 𝐹
// −
// 32
// )
// C=
// 9
// 5
// 	​

// (F−32)
// 🔷 Output Format

// For each value of Fahrenheit (F), print the corresponding Celsius value (C) in the following format:

// F C
// 🔷 Example

// Input:

// Minimum Fahrenheit = 0  
// Maximum Fahrenheit = 100  
// Step = 20  

// Output:

// 0   -17  
// 20  -6  
// 40   4  
// 60  15  
// 80  26  
// 100 37  

import java.util.Scanner;

public class Conversion_fahrenheit_to_Celcius{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int minf =sc.nextInt();
        int maxf= sc.nextInt();
        int steps=sc.nextInt();

        for(int i=minf; i<=maxf; i=i+steps){
            int c =(int)((5.0/9)*(i-32));
            System.out.println(i +"\t" + c);
        }
    }
}