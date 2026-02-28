package SlidingWindow;
import java.util.Scanner;

// Problem Statement (Clear Version)

// Kartik Bhaiya has a string consisting only of characters 'a' and 'b'.

// He defines the perfectness of a string as:

// The length of the longest substring containing only identical characters.

// He is allowed to change (flip) at most K characters in the string.

// Find the maximum perfectness he can achieve by changing at most K characters.


public class StringwithKflipMaxsubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.next();
        int k=sc.nextInt();
        int flip_a =MaxLenOfString(s,'a', k);
        int flip_b= MaxLenOfString(s, 'b', k);
        int max =Math.max(flip_a, flip_b);
        System.out.println(max);

    }
    public static int MaxLenOfString(String s, char ch, int k){
        int ei =0;
        int si=0;
        int ans=0;
        int flip=0;
        while(ei<s.length()){
            //grow
            if(s.charAt(ei) == ch){
                flip++;
            }
           while(flip>k && si <=ei){
             if(s.charAt(si)==ch){
                flip--;
             }
            si++;
           }
          ans=Math.max(ans, (ei-si+1));
          ei++;
        }
        return ans;
    }
}
