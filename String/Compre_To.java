package String;
//lexicographically : compare which come first according to Dictionary those wo come first is small, later is high.
public class Compre_To {
    public static void main(String[] args) {
        String s1 = "Komal";
        String s2 = "Komalaa";
        //System.out.println(s1.compareTo(s2)); //if 0 strings are equal, positive S1 greater , negative s2 GREATER

        //calling a method in main method
        System.out.println(compareTo(s1, s2));
    }

    //apna compare to function
    public static int compareTo(String s1, String s2){
        for(int i=0; i<Math.min(s1.length(),s2.length()); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return s1.charAt(i) -s2.charAt(i);  //>0 =>s1> s2 ||<0 =>s1<s2;  comparing with ASCII Value;
            }
        }
        return s1.length() - s2.length();
    }
}
