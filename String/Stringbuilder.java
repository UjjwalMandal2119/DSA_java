package String;

public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder(); //16
        // StringBuilder sb =new StringBuilder(1000); //capicity 1000
         // StringBuilder sb =new StringBuilder("Hello"); capicity :21

        System.out.println(sb.capacity()); //o/p =16
        sb.append("Hustler");
        sb.append('A');
        System.out.println(sb);
        //length
        System.out.println(sb.length());

        //reverse
      //  System.out.println(sb.reverse());

        //delete in a range
     //   System.out.println(sb.delete(1, 2)); //last index include nhi hota h

     sb.append("practice!");
     System.out.println(sb.capacity());  //new capacity= oldcapacity *2 +2; Arraylist. 1.5time

     String s=sb.toString(); //builder ko direct string main nhi rakh sakte h ,usko toString() method use karke convert karna hoga

     StringBuilder sb1 = new StringBuilder(s); // String to builder

     for(int i=0; i<sb.length(); i++){
        System.out.print(sb.charAt(i) + " ");
     }
      System.out.println();

    }
}
