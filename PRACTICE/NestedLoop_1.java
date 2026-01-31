package PRACTICE;
import java.util.*;
public class NestedLoop_1 {
public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the number of lines");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=0;j<5;j++){
            System.out.print(i);
        }
        System.out.println();
    }
}   
}
