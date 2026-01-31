package function;
import java.util.*;
public class fun_return_type {
    public static void main(String args[]){
        int a=5;
        int b=6;
        int ans=Add(a,b);
        System.out.println(ans);
    }
    public static int Add(int x,int y){
        return x+y;
    }
}
