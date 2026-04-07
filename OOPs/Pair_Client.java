package OOPs;

public class Pair_Client {
    public static void main(String[] args) {
        Pair<String, Boolean> p = new Pair<>();
        Pair<String, Character> p1 = new Pair<>();
        Pair<String, Float> p2= new Pair<>();
        Pair<String, Integer> p3 = new Pair<>();

  System.out.println(p.xValue());
  System.out.println(p1.xValue());
  System.out.println(p2.yValue());
    }
}
