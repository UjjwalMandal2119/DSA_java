package Basics;

import java.util.Scanner;

import lecture_4.prime_number;

// The Sieve of Eratosthenes is an efficient algorithm used to find all prime numbers up to a given number n by repeatedly marking multiples of prime numbers as non-prime.
// Find all primes ≤ n
// ✅ Steps:
// Create a boolean array isPrime[0…n] and initialize all values as true
// Mark 0 and 1 as false (not prime)
// Start from i = 2
// If isPrime[i] == true, then:
// Mark all multiples of i as false
// Repeat until i * i ≤ n
// All indices still marked true are prime numbers
// Time Complexity

// 👉 O(n log log n)
public class Prime_Sieve_of_Eratosthenes {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number");
        int n= sc.nextInt();
        PrimeSieve(n);
    }

    //i th index pe true hai iska mtlb i prime number hai
    public static void   PrimeSieve(int n){
        boolean [] prime= new boolean[n+1];
        for(int i=2; i<prime.length; i++){
            prime[i]=true;
        }
        for(int i=2; i*i<prime.length; i++){
            if(prime[i] == true){ // i is prime number
              for(int j=2; j*i<prime.length; j++){
                prime[i*j]=false;
              }
            }
        }
        for(int i=2; i<prime.length; i++){
            if(prime[i] == true){ //i is prime number
                System.out.print(i+ " ");
            }
        }
    }
}
