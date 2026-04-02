package Basics;

import java.util.Random;
import java.util.Scanner;

public class Random_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower bound");
        int low=sc.nextInt();
        System.out.println("Enter upper bound");
        int high = sc.nextInt();
        RandomNumber(low, high);
    }
    public static void RandomNumber(int low, int high){
        Random random = new Random();
        int lo=low;
        int hi=high;
        for (int i = 0; i < 10; i++) {
            int rn = random.nextInt(hi -lo +1)+ lo;
            System.out.print(rn + " ");
        }
    }
}
