package Time_Space_Complexity;

import java.util.Scanner;

public class Demo_2 {
    public static void main(String args[]){
        System.out.println("Always work with Diligently");
        System.out.println("Hard Work always rocks");
        int n=256;
        int i=0;
        while(i< n){
            System.out.println("Learn and execute");
            i++;
            //O(n)
        }
        i=1;
        while(i<=n){
            System.out.println("Learn and execute");
            i*=2;
            //TC log(n) base 2
        }
        
        while(n>0){
            System.out.println("Learn and execute");
            n /=2;
            //TC =log(n) base 2
        }
        i=0;
        while(i <=n){
            System.out.println("Learn and Execute");
            i +=2;
            i +=3;  
            //TC =O(n)
        }
         i=1;
        while(i <=n){
            System.out.println("Learn and Execute");
            i *=2;
            i *=3;  
            //TC =O(log(n/5))==O(n) with base 6;
        }

         while(n>0){
            System.out.println("Learn and Execute");
            i /=2;
            i /=3;  
            //TC =O(log(n)) with base 6;
        }
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        while(i <=n){
            System.out.println("Learn and execute");
            i+=k;  //k is some constant;
            //TC isO(n/k) ==O(n)
        }
 
        while(i<=n){
            System.out.println("learn and execute");
            i *=k;
            //TC O(log(n)) with base k
        }

        while(n>0){
            System.out.println("Learn and Execute");
            n =n-1;
              //TC =O(n)
        }
   
        while(n>0){
            System.out.println("Learn and Execute");
            n=n-2;
            n=n-3;
              //TC =O(n/5) =O(n)
        }

        while(n>0){
            System.out.println("Learn and Execute");
            n=n-k;
              //TC =O(n/k) =O(n)
        }
           //Independent loop 
           //two loop TC=O(n^2)
        for(i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.println("learn and Execute");
            }
        }

        for(i=1; i*i <= n; i++){
            System.out.println("learn");

            //Time complexity O(sqrt(n))
        }

        //Dependent loop
        for(i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                for(int l=1; l<=n; l++){
                 System.out.println("No Pain no gain");
                }
            }
        }
         //TC =O(n^3)

         for(i=1; i<=n ;i++){
            for(int j=1; j<=i*i; j++){
                for(k=1; k<=n/2; k++){
                    System.out.println("Learn and Execute");
                }
            }
         }

         //TC=O(n^4)  so have to consider number of iteration

         for(i=1; i<=n; i++){
            for(int j=1; j<=n; j+=i){
                System.out.println("Learn and execute");
            }
         }
         //TC=O(nlog(n))
    }
}

//Time complexity O(1) constant
//Arithmetic operation are in constant Time Complexity
