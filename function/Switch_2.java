public class Switch_2 {
    public static void main(String args[]){
        int time=11;
        if(time>=10 && time<=20){
            System.out.println("Office is Open");
        }else{
            System.out.println("Office is Closed");
        }
        if(time==12||time==18){
            System.out.println("Time for lunch");
        }else{
            System.out.println("It's time to work");
        }
    }
    
}
