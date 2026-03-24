package Hash;
import java.util.HashMap;
public class HashMap1{
    public static void main(String args[]){
        //Map<String, Integer> map1= new HashMap<>();
        HashMap<String, Integer> map= new HashMap<>();
        map.put("abhi", 88);
        map.put("nahid", 68);
        map.put("siddhant", 78);
        map.put("Ujjwal", 82);
        map.put("sanjeet", 75); 
        System.out.println(map); //{sanjeet=78, siddhant=78, nahid=68, Ujjwal=82, abhi=88} it doesn't preserve the order to maintainn TC O(1);
        map.put("sanjeet", 78);
        System.out.println(map);  //{sanjeet=78, siddhant=78, nahid=68, Ujjwal=82, abhi=88}  it's contains unique key and update with latest value;
        
    }
}