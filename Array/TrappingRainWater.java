
import java.util.Scanner;

public class TrappingRainWater {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n ;i++){
            arr[i] = sc.nextInt();
        }
        TapWater(arr);
    }
  public static void TapWater(int []arr){
    int n=arr.length;
    int [] leftMax =new int[n];
    int [] rightMax= new int [n];
    // for left max calculation
    leftMax[0]= arr[0];
    for(int i=1;i<n; i++){
        leftMax[i]=Math.max(arr[i],leftMax[i-1] );
    }
    rightMax[n-1]=arr[n-1];
    for(int j=n-2;j>=0; j--){
        rightMax[j]= Math.max(rightMax[j+1], arr[j]);
    }

    //Water trapped at index
    //First & last index trap 0 water
    int sum=0;
    for(int i=0;i<n; i++){
        sum+=Math.min(leftMax[i], rightMax[i])-arr[i];
    }
    System.out.println("Total tap Water " + sum);
  }    
}
