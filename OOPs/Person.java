package OOPs;

public class Person {
    String name ="Ujjwal";
    int age =22;

    public void Intro_yourself(){
        System.out.println("My Name is " + name + " and age is " + age);
    }

    //constructor same name as class name with no return type ,but have multiple argument

    public Person(){

    }

    // public Person(int age){

    // }

     public Person(int age, String name){
          this.age=age;
          this.name =name;
    }

    // public Person(int age, String name, int x){

    // }
}
