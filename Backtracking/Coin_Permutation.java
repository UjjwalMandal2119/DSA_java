package Backtracking;

public class Coin_Permutation {
    public static void main(String[] args) {
        int[] coin ={2,1,3,5};
        int amount =4;
        Permutation( coin, amount, "");
        System.out.println("with backtracking ");
        PermutationB( coin, amount, "");
    }

//with recursion

    public static void Permutation( int [] coin, int amount, String ans){
        if(amount == 0){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<coin.length; i++){
            if(amount >=coin[i]){
                Permutation(coin, amount -coin[i], ans +coin[i]);
            }
        }
    }

 //With Backtracking 

    public static void PermutationB( int [] coin, int amount, String ans){
        if(amount == 0){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<coin.length; i++){
            if(amount >=coin[i]){
                amount -=coin[i];
                PermutationB(coin, amount , ans +coin[i]);
                amount +=coin[i];
            }
        }
    }
}
