package OOPs;

 public class Car_client{
    public static void main(String[] args){
        Car c = new Car("Black", 1524, 25);
        Car c1 = new Car("Red", 4152, 58);
        // c.price =5812;  we can't directly access this as these are private

        // c.price = -34;
        c.setColor("white");
        c.DisplayCar();
        c.setPrice(-120000);
        c.DisplayCar();
        c.setSpeed(-350);
        c.DisplayCar();
        System.out.println(c.getColor());
        System.out.println(c1.getSpeed());
    }
}
