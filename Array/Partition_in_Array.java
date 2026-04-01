package Array;

public class Partition_in_Array {
    public static void main(String[] args) {
        int [] arr= {5,6,2,3,8,1,4};
        int idx = Partition(arr);
        System.out.println(idx);
        for(int n:arr){
            System.out.print(n + " ");
        }
    }
    public static int Partition(int [] arr){
        int si=0;
        int idx=si;
        int ei=arr.length-1;
        int item =arr[ei];
        //arrangement
        for(int i=si; i<ei; i++){
            if(arr[i] <=item){
                int temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
                idx++;
            }
        }
        //last index swap at the end
        int temp =arr[ei];
        arr[ei]=arr[idx];
        arr[idx] =temp;
        return idx;
    }
}
