package String;

public class BasicString {
    public static void main(String args[]){
        String str1="Hello";
        String str2= new String("Hello");
         String str3="Hello";
        String str4= new String("Hello");
        System.out.println(str1);             //here content is same but memory location is different
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str1.length());  //length() is a method to find the length of the string
        System.out.println(str1.charAt(1));  //charAt(index) to print the character of that index of given string

        //String has also a zero '0' based indexing

        //addition of two string
         String s1= "Hello";
         String s2= "Everyone";

         s1=s1 +s2;  // s1+s2=s1s2 first come firsr serve
         s1 =s1.concat(s2); //concat() method to add string
         System.out.println(s1);

         System.out.println(str1 == str2.intern());//with intern() things get changes it send addess to pool
         System.out.println(str1.intern()== str2);
    }
}
//we cannot print address in String 
//because string class ke ander object class ke  toString() method ko override kar rakha hai so it print contents


//string non -primitive data type ,HEAP Memory for store contents
//address in STACk memory

//hardcode ,string allocated memory in string pool/Internal pool , a special area in string memory 
//in this area duplicate string not allowed 
//if in string pool for duplicate string the same address allocated 

//but out side this duplicate string allowed with a different memory address