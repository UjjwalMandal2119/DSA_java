package String;

public class Equals {
    public static void main(String[] args) {
        String s1= "Ujjwal";
        String s2= "Ujjwal";
        System.out.println(EqualCheck(s1,s2));

        
    }

    public static boolean EqualCheck(String s1, String s2){
         if(s1.length()!=s2.length()) return false; //first we checking the length;

         if(s1 ==s2) return true;  //checking the same address

         for(int i=0; i<s1.length(); i++){    //now comparing the contents bcz it's imp same string may have different location one in string pool, heap
            if(s1.charAt(i)!=s2.charAt(i)) return false;
         }
         return true;
    }
}

//in boolean method only one return work at one call, if first return occure than it not run the remaining lines od code.