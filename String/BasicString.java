package String;

public class BasicString {
    public static void main(String args[]){
        String str1="Hello";
        String str2= new String("Hello");
         String str3="Hello";
        String str4= new String("Hello");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}


//string non -primitive data type ,HEAP Memory for store contents
//address in STACk memory

//hardcore ,string allocated memory in string pool/Internal pool , a special area in string memory 
//in this area duplicate string not allowed 
//if in string pool for duplicate string the same address allocated 

//but out side this duplicate string allowed with a different memory address