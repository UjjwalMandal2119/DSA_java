package Time_Space_Complexity;
//linear Search

public class Demo_3 {
    public static void main(String[] args) {
        int [] arr={1,3,65,7,4,7,4,88,15};
        int target =15;
        System.out.println();
        System.out.println(Search(arr, target));
    }
    public static int Search(int [] arr , int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
//time complexity O(n) n= total work here n=8;
