package Array;

public class Add_number {
    public static void main(String args[]){
        int arr[]={1,2,3,44,5,6,7,8,9,45};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
