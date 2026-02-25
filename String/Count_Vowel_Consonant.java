package String;

import java.util.Scanner;

public class Count_Vowel_Consonant {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the string");

       // String s =sc.next(); //take input only one string till space next() stops reading when it sees a space. 
        String s =sc.nextLine();
        System.out.println("total number of Vowels and Consonants");
        CntVowelConsonants(s);
        int [] result = CntVowelConsonants1(s);
        System.out.println("Vowels" + result[0]);
        System.out.println("consonants" + result[1]);

    }
    private  static void CntVowelConsonants(String s){
        int VowelCount=0;
        int Consonantcount=0;
        for(int i=0; i<s.length(); i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if(ch=='a'||ch=='e' || ch=='i' || ch=='o' ||ch=='u'){
                VowelCount++;

                //now its only count alphabet
                //a=97 and z =122
                //Space is ASCII 32 → so it won't be counted.
            }else if(ch>= 'a' && ch<= 'z'){
                Consonantcount++;
            }
        }
        System.out.println(VowelCount);
        System.out.println(Consonantcount);
    }
    private static int[] CntVowelConsonants1(String s){

    int VowelCount = 0;
    int Consonantcount = 0;

    for(int i = 0; i < s.length(); i++){

        char ch = Character.toLowerCase(s.charAt(i));

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            VowelCount++;
        }
        else if(ch >= 'a' && ch <= 'z'){
            Consonantcount++;
        }
    }

    return new int[]{VowelCount, Consonantcount};
}
}
