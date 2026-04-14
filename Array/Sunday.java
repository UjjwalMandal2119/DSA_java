package Array;

import java.util.HashMap;
import java.util.Scanner;

public class Sunday {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int totaldays=sc.nextInt();
       sc.nextLine();
        String ch =sc.nextLine();
        HashMap<String, Integer> map = new HashMap<>();

        map.put("sun", 0);
        map.put("mon", 1);
        map.put("tue", 2);
        map.put("wed", 3);
        map.put("thu", 4);
        map.put("fri", 5);
        map.put("sat", 6);
        
        int day= (7 - map.get(ch))%7;
        if(day>totaldays){
            System.out.println("no sunday");
            return;
        }else{
             int ans =1+(totaldays-day-1)/7;
       System.out.println(ans);
        }

      
    }
}
