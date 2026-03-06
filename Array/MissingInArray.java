
import java.util.Scanner;

public class MissingInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(missingNum(arr));
    }
    public static int missingNum(int arr[]) {
        
       int n =arr.length+1;
       long expectedSum= (long)n *(n+1)/2;
       int originalsum=0;
       for(int a:arr){
           originalsum+=a;
       }
       return (int)(expectedSum- originalsum);
    }
}
