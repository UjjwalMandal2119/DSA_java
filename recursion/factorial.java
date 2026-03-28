package Recursion;

import java.util.Scanner;

public class factorial {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
   System.out.println(Hfact(n));
   System.out.println(Tfact(n));
    }
    //Head recusion  we perform some task after recusrion call
    public static int Hfact(int n ){
        if(n==0){
            return 1;
        }
        int fn = Hfact(n-1);
        return n*fn;
    } 
    public static int Tfact(int n, int ans){
        if(n==0){
            return ans;
        }
        return Tfact(n-1, ans *n);
    }
}
