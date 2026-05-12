package DP;

public class Wine_Selling_MaxProfit {
    public static void main(String[] args) {
        int [] wine ={2,3,5,1,4};
        System.out.println(maxProfit(wine, 0, wine.length-1, 1));
    }

    public static int maxProfit(int [] wine, int i, int j, int year){
        if(i >j){
            return 0;
        }
        int fs= year * wine[i] + maxProfit(wine, i+1, j, year +1);
        int ls = year * wine[j] + maxProfit(wine, i, j-1, year +1);

        return Math.max(fs, ls);
    }
}
