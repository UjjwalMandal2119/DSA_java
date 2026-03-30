package Hash;

public class Maze_Path {
    public static void main(String[] args) {
        int n=4;  //row
        int m=5;  //column
        PrintPath(0,0, n-1, m-1, "");
        System.out.println(PrintPathCount(0, 0, n-1, m-1));
        System.out.println(count);
    }
    //cc - current column, cr - current row, er - end row, ec- end column
    static int count =0;
    public static void PrintPath(int cc, int cr, int er, int ec, String ans){
         if(cr== er && cc ==ec){
            System.out.println(ans);
            count++;
            return;
         }
         if(cr > er || cc > ec){
            return;
         }
         PrintPath( cc+1, cr, er, ec, ans + "H");
         PrintPath(cc, cr +1, er, ec, ans + "V");
    }
    //for count
    public static int  PrintPathCount(int cc, int cr, int er, int ec){
         if(cr == er && cc == ec){
            return 1;
            
         }
         if(cr > er || cc > ec){
            return 0;
         }
         int a1= PrintPathCount(cc+1, cr, er, ec);
         int b1= PrintPathCount(cc, cr +1, er, ec);
         return a1+b1;
    }
}
