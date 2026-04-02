package OOPs;

public class Student {
    String name; //data/variable

    int age;  //data/variable

    //static int count;

    public  void Intro_yourself(){ //class ka method ya function
        System.out.println("My name is " + name + " and age is " + age); //we can also this.name but not mandotary
    }

      public void SayHey(String name){
        fun();
      System.out.println(name + " Say hey " + this.name);  //this keyword is mandotary here
    }

    // public static void fun(){
    //     System.out.println(name);
    // }  static methos not used here , it common for all

    public static void fun(){
       // System.out.println(Coun);
        System.out.println("I am confident");
    }
    //static block sabse pahele execute hota h
    //used in development
    static{
        System.out.println("Consistency ,strong Mindset");
    }
}
