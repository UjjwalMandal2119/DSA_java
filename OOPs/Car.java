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
 

    //These are Setter Method used to set the value


    public void setColor(String color){
        this.color =color;
    }

    public void setPrice(int price){
         if(price <0){
            System.out.println("Invalid Input");
            return ;
        }
        this.price =price;
    }

    public void setSpeed(int speed){
         if(speed <0){
            System.out.println("Invalid Input");
            return ;
        }
        this.speed = speed;
    }

    //Getter Method

    public String getColor(){
        return this.color;
    }

    public int getPrice(){
       
        return this.price;
    }

    public int  getSpeed(){
        return this.speed;
    }




    public void DisplayCar(){
        System.out.println(" c " +color + " p " + price + " s " + speed);
    }
}
