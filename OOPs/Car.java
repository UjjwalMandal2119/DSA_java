package OOPs;

public class Car {
    private   String color;
    private  int price;
    private int speed;
    
    public Car(String color, int price, int speed){
        this.color = color;
        this.price =price;
        this.speed =speed;
    }

    public void SetColor(String color){
        this.color =color;
    }

    public void SetPrice(int price){
        this.price =price;
    }

    public void SetSpeed(int speed){
        this.speed = speed;
    }


    public void DisplayCar(){
        System.out.println(" c " +color + " p " + price + " s " + speed);
    }
}
