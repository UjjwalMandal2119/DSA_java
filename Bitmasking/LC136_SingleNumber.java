package Bitmasking;

public class LC136_SingleNumber {
    public static void main(String[] args) {
        int [] arr={4, 1, 2,1,2};
        System.out.println(SingleNumberI(arr));
    }
    public static int SingleNumberI(int [] arr){
        int ans=0;
        for(int i=0; i<arr.length; i++){
            ans^=arr[i]; //ans = ans^arr[i];
        }
        return ans;
    }
}
