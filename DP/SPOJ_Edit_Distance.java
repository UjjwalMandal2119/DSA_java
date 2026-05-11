package DP;
//https://www.spoj.com/problems/EDIST/
public class SPOJ_Edit_Distance {
    public static void main(String[] args) {
        String s="FOOD";
        String t="MONEY";
        System.out.println(EditDistance(s, t, 0, 0));
        
    }
    //Recursion

    public static int EditDistance(String s, String t, int i, int j){
         if(i==s.length()){
        return t.length()-j;
        }
        if(j==s.length()){
        return s.length()-i;
        }
        int ans=0;
        if(s.charAt(i) == t.charAt(j)){
            ans=EditDistance(s, t, i+1, j+1);
        }else{
            int D=EditDistance(s, t, i+1, j);
            int I=EditDistance(s, t, i, j+1);
            int R=EditDistance(s, t, i+1, j+1);
            ans=Math.min(I, Math.min(D, R))+1;
        }
     return ans;
    }
}
