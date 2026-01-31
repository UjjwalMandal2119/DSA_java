import java.util.*;
public class ContainerWithMaxWater {
    public static void main(String args[]){
        int [] arr= {1,8,6,2,5,4,8,3,7};
        System.out.println("water  " + maxWater(arr));
    }
    public static int maxWater(int [] arr){
        int n=arr.length;
        int left =0;
        int right=n-1;
        int water=0;
        

        while(left<right){
           int currentWater=Math.min(arr[left],arr[right])*(right-left);
            water =Math.max(water, currentWater);

            if(arr[left]<arr[right]){
                left++;
            }else{
                right--;
            }
        }
        return water;
    }
}
