package OOPs;
//https://www.spoj.com/problems/BUSYMAN/
import java.util.*;

public class BusyMan {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int t=sc.nextInt();
   while(t-- >0){
     int n =sc.nextInt();
     PairA [] arr = new PairA[n];
     for(int i=0; i<arr.length; i++){
      int start = sc.nextInt();
      int end  = sc.nextInt();
      arr[i] = new PairA(start, end);
     }
 Arrays.sort(arr, new Comparator<PairA>() {
    @Override
    public int compare(PairA o1, PairA o2){
      return o1.end - o2.end;
    }
   });

   int count =1;
   int end =arr[0].end;
   for(int i=0; i<arr.length; i++){
    if(end <=arr[i].start){
      count++;
      end =arr[i].end;
    }
   }
   System.out.println(count);
  } 
     
   }   

    
  public static class PairA{
    int start;
    int end;
    public PairA (int start, int end){
        this.start =start;
        this.end =end;
    }
  }
}
