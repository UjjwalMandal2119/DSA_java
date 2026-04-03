package OOPs;

public class Client {
    public static void main(String[] args) {
        //This is first case
    //     P obj = new P();
    //     System.out.println(obj.d);
    //     System.out.println(obj.d1);
    //   obj.fun();
    //   obj.fun1();

//This is second case
 
//  P obj = new C();
//  System.out.println(obj.d);
//  System.out.println(obj.d1);
//  System.out.println(((C)(obj)).d2);

//  System.out.println(((C)(obj)).d);
//  obj.fun();  //Method overridding jiska new kiya gaya h usi ka chalta h common method
//  obj.fun1();
//  ((C)(obj)).fun2();

//Third case of Inheritence
    //   C obj = new P();
    //    cannot convert from P to C

    //not allowes in java

    //Fourth Case of Inheritence
    

      C obj=new C();
      
      System.out.println(obj.d1);
      System.out.println(obj.d);
      System.out.println(((P)(obj)).d);  //type casting
      System.out.println(obj.d2);
      obj.fun();
      obj.fun1();
      obj.fun2();
    }
    
}
