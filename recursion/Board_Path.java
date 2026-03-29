package Recursion;
//Board path ,way to rich the destination choices 1,2,3 we can relate this question with monkey jump and also with dice
public class Board_Path {
    public static void main(String[] args) {
        int n=4;
        BoardPath(n,0,"");
        System.out.println();
        System.out.println("Number of ways");
        System.out.println(count);
        System.out.println("\n" + BoardPath1(n, 0, ""));

    }
    static int count=0;
    public static void BoardPath(int n, int curr, String ans){
        if(curr==n){
            System.out.print(ans+ " ");
            count++;
            return;
        }
        if(curr>n){
            return;
        }
    //    BoardPath(n, curr+1, ans +1);
    //    BoardPath(n, curr+2, ans +2);
    //    BoardPath(n, curr+3, ans+ 3);

       //above we call three times recursive call because we have three choice ,here we can apply loop
       //for reducing the code if there are many choice for examaple a dice
       for(int dice =1; dice<=3; dice++){
        BoardPath(n, curr+dice, ans + dice);
       }

    }
    //Total number of way with return type
    public static int BoardPath1(int n, int curr, String ans){
        if(curr==n){
            System.out.print(ans+ " ");
            return 1;
        }
        if(curr>n){
           return 0; 
        }
       int a1= BoardPath1(n, curr+1, ans +1);
       int b1=BoardPath1(n, curr+2, ans +2);
       int c1=BoardPath1(n, curr+3, ans+ 3);
     return a1+b1+c1;
    }

}
