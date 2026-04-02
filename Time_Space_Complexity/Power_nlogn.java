package Time_Space_Complexity;

import java.util.Scanner;

public class Power_nlogn {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the base number");
        int x=sc.nextInt();
        System.out.println("Enter the power");
        int n=sc.nextInt();
        System.out.println(power(x, n));
    }

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int ans = power(x, n/2);
        ans= ans*ans;
        if(n% 2!=0){
            ans *=x;
        }
        return ans;
    }
}
