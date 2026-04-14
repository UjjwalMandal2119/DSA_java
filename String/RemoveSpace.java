package String;

import java.util.Scanner;

public class RemoveSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(removeSpacesI(str));
        System.out.println(removeSpacesII(str));
        System.out.println(removeSpacesIII(str));
    }
    //manual way
    public static String removeSpacesI(String s){
          String str ="";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if((c>='a' && c<='z')||(c>='A' && c<='Z')){
                str+=c;
            }
        }
        return str;
    }
     //using StringBuilder function
    public static String removeSpacesII(String s){
        StringBuilder ans =new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if((ch >='a'&& ch<='z')||(ch>='A' && ch<='Z')){
                ans.append(ch);
            }
        }
      return ans.toString();
    }

    //Using in build function removeAll()

    public static String removeSpacesIII(String s){
        String str =s.replaceAll(" ", "");
        return str;
    }
}
