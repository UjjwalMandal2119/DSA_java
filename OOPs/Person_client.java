package OOPs;

public class Person_client {
    public static void main(String[] args) {
        System.out.println("Let's Code");
        System.out.println("Enjoy it , it fun");

        Person p1 = new Person();
        p1.Intro_yourself();

       Person p2 = new Person(24, "Ujjwal");  //it declare when calling it
       p2.Intro_yourself();

       Car c= new Car("White", 15402352, 300);
    //    c.color ="Blue";
    //    c.price=45333;
    //    c.speed =45;  //privat
       c.DisplayCar();
           
    }
}
