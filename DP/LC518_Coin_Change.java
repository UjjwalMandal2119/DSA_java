package DP;

public class LC518_Coin_Change {
    public static void main(String[] args) {
        int [] coin={1,2,5};
        int amount=11;
        System.out.println(NoOfWays(coin, amount, 0));

        //DP bottom up approach
        System.out.println(NoOfWaysBU(coin, amount));
    }

    public static int NoOfWays(int [] coin, int amount, int i){
        if(amount==0){
            return 1;
        }
        if(i==coin.length){
            return 0;
        }
        int inc=0;
        int exc=0;
        if(amount >=coin[i]){
            inc =NoOfWays(coin, amount-coin[i], i);
        }
        exc=NoOfWays(coin, amount, i+1);

        return inc+exc;
    }

    public static int NoOfWaysBU(int [] coin, int amount){
        int [][] dp =new int[coin.length+1][amount +1];
        for(int i=0; i<dp.length; i++){
            dp[i][0]=1;
        }
        for(int c=1; c<dp.length; c++){
            for(int amt=1; amt< dp[0].length; amt++){
                int inc=0;
                int exc=0;
                if(amt>=coin[c-1]){
                  inc =dp[c][amt-coin[c-1]];
                }
                exc= dp[c-1][amt];
                dp[c][amt]=inc+ exc;
            }
        }
        return dp[dp.length -1][dp[0].length-1]; 
        
    }
}
