package Hash;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionOfTwoArrayII {
    public static void main(String[] args) {
        int [] nums1={1,2,2,1};
        int [] nums2 = {2,2};
        System.out.println( "result");
        int [] result = Intersect(nums1, nums2);
        for(int n : result){
            System.out.print(n + " ");
        }

         
        }
         public static int[] Intersect(int [] nums1, int [] nums2){
          HashMap<Integer, Integer> map =new HashMap<>();
            for(int i=0; i<nums1.length; i++){
                if(map.containsKey(nums1[i])){
                    map.put(nums1[i], map.get(nums1[i])+1);
                }else{
                   map.put(nums1[i], 1);
                }
            }  
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0; i<nums2.length; i++){
                if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
                    list.add(nums2[i]);
                    map.put(nums2[i], map.get(nums2[i])-1);

                }
            }
            int [] ans = new int[list.size()];
            for(int i=0; i<ans.length; i++){
                ans[i]=list.get(i);
            }
            return ans;
    }
}
