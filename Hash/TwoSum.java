package Hash;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the target ");
        int target =sc.nextInt();
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter the Array Elements");
        for(int i=0; i<n; i++){
            arr[i] =sc.nextInt();
        }
        int [] res =twoSum(arr, target);
        for(int r:res){
            System.out.print(r+ " ");
        }
    } 
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
      
        for(int i=0; i<nums.length; i++){
            int next= target- nums[i];
            if(map.containsKey(next)){
                return new int[]{map.get(next), i};
            }else{
                map.put(nums[i], i);
            }

        }
        return new int[]{-1, -1};
    }
}
