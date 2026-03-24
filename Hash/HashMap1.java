package Hash;
import java.util.*;
public class HashMap1{
    //key value pair
    //HashMap ka implementation LinkedList ki help se bna h
    public static void main(String args[]){
        //Map<String, Integer> map1= new HashMap<>();
        HashMap<String, Integer> map= new HashMap<>();
        //put() used for insert the value in HashMap
        map.put("abhi", 88);
        map.put("nahid", 68);
        map.put("siddhant", 78);
        map.put("Ujjwal", 82);
        map.put("sanjeet", 75); 
        System.out.println(map); //{sanjeet=78, siddhant=78, nahid=68, Ujjwal=82, abhi=88} it doesn't preserve the order to maintainn TC O(1);
        map.put("sanjeet", 78);
        System.out.println(map);  //{sanjeet=78, siddhant=78, nahid=68, Ujjwal=82, abhi=88}  it's contains unique key and update with latest value;
        

        //get() used for getting a value using key
        System.out.println(map.get("Ujjwal")); //82
        System.out.println(map.get("Ujjawal")); //null  it allow null value

       //containsKey()

        System.out.println(map.containsKey("Ujjwal")); //true  bollean type
        System.out.println(map.containsKey("Ujjawal")); //false

        //remove()
        //System.out.println(map.remove("abhi")); //88
        System.out.println(map); //{sanjeet=78, siddhant=78, nahid=68, Ujjwal=82}
        System.out.println(map.remove("abhia"));


        //null as key allow in hashmap
       // map.put(null, 89); //only one null key allow
        System.out.println(map);


        //now I am using tree map . it shows data in lexigraphical order
        TreeMap<String, Integer> mapt=new TreeMap<>();
        mapt.put("abhi", 88);
        mapt.put("nahid", 68);
        mapt.put("siddhant", 78);
        mapt.put("ujjwal", 82);
        mapt.put("sanjeet", 75);
        System.out.println(mapt);  //{abhi=88, nahid=68, sanjeet=75, siddhant=78, ujjwal=82}  printed in lexigraphically O(logn)  
        //red black tree ki madat se ki gayi h

        // mapt.put(null, 99); //NullPointerException  here comparison hota h ,isiliye null value use nhi kar sakte h as Key
        mapt.put("ravi",null); //but null value store kara sakte h
        System.out.println(mapt);

        LinkedHashMap<String, Integer> mapl= new LinkedHashMap<>();
        mapl.put("abhi", 88);
        mapl.put("nahid", 68);
        mapl.put("siddhant", 78);
        mapl.put("ujjwal", 82);
        mapl.put("sanjeet", 75);

        System.out.println(mapl);  //{abhi=88, nahid=68, siddhant=78, ujjwal=82, sanjeet=75}  isme insertion order preserve hota h 

        //HashMap ko apne according print karne ke liye

        //First Way
        System.out.println("1st way");
        Set<String> key = map.keySet();
        System.out.println();
        System.out.println(key);
        for(String k : key){
            System.out.println(k + " obtain marks - " + map.get(k));
        }
         System.out.println("2nd way");

         // 2nd way
         for(String k: map.keySet()){
            System.out.println(k + " " + map.get(k));
         }
        // 3rd way
        System.out.println("3rd way");
        ArrayList<String> key1 = new ArrayList<>(map.keySet());
         for(String k : key1){
            System.out.println(k + " obtain marks - " + map.get(k));
        } 
    }
}