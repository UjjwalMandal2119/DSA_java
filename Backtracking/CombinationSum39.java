package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum39 {
    public static void main(String[] args) {
        int [] coin= {2, 1, 3,5};
        int amount =4;
        List<Integer> ll= new ArrayList<>();
        Combination(coin, amount,ll, 0);
    }
    public static void Combination(int[] coin, int amount, List<Integer> ll, int idx){
        if(amount ==0){
            System.out.println(ll);
            return;
        }
      for(int i=idx; i<coin.length; i++){
        if(amount >=coin[i]){
            //amount -=coin[i];
            ll.add(coin[i]);
            Combination(coin, amount-coin[i], ll, i);
             //amount +=coin[i];
             ll.remove(ll.size()-1);
        }
      }
    }
}
