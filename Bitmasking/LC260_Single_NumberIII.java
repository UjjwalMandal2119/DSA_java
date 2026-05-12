package Bitmasking;

public class LC260_Single_NumberIII {
    public static void main(String[] args) {
        int [] arr ={1,2,1,3,2,5};
        int [] res=SingleNumber(arr);
        for(int n:res){
            System.out.println(n);
        }

    }
    public static int [] SingleNumber(int [] arr){
        int ans=0;
        for(int i=0; i<arr.length; i++){
            ans ^=arr[i];
        }
        int mask=(ans &(~(ans -1)));
        int a=0;
        for(int i=0; i<arr.length; i++){
            if((arr[i] & mask) !=0){
                a^= arr[i];
            }
        }
        int b=ans^a;

        return new int[]{a, b};
    }
}
