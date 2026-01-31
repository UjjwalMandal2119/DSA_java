package PRACTICE;
import java.util.*;
public class NestedLoop {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the numbers of times to be printed");
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
        for(int j=1;j<=5;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
    }
    
}
