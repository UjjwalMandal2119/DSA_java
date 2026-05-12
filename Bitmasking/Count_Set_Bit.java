package Bitmasking;

public class Count_Set_Bit {
    public static void main(String[] args) {
        int n=76;
        System.out.println(Count(n));
        System.out.println(FastCount(n));
    }

    public static int Count(int n){
        int ans=0;
        while(n>0){
         if((n &1)!=0){
            ans++;
         }
        n>>=1; //n=n>>1


        }
        return ans;
    }

    //Optimize solution 
    public static int FastCount(int n){
        int ans=0;
        while(n >0){
            n=n &(n-1);
            ans++;
        }
        return ans;
    }
}
