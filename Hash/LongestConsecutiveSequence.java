package Hash;

import java.util.HashMap;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int [] arr ={0,3,1,5,7,8,9,11,2,13};
        System.out.println(Consecutive_Sequence(arr));
    }
    public static int Consecutive_Sequence(int [] arr){
    HashMap<Integer, Boolean> map = new HashMap<>();
     int ans = 0;
    for(int i=0; i<arr.length; i++){
        if(map.containsKey(arr[i]-1)){
            map.put(arr[i], false);
        }else{
            map.put(arr[i], true);
        }
        if(map.containsKey(arr[i]+1)){
            map.put(arr[i]+1, false);
        }
       
        for(int key: map.keySet()){
            if(map.get(key)){
                int count=0;
                while(map.containsKey(key)){
                    count++;
                    key++;
                }
                ans= Math.max(ans,count);
            }
        }

    }
    return ans;
    }
}
