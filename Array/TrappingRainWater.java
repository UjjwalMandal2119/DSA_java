public class TrappingRainWater {
    public static void main(String args[]){
        int [] arr={0,1,0,2,1,0,1,3,2,1,2,1};
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
    int sum=0;
    for(int i=0;i<n; i++){
        sum+=Math.min(leftMax[i], rightMax[i])-arr[i];
    }
    System.out.println("Total tap Water " + sum);
  }    
}
