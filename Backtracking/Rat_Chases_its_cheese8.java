package Backtracking;

import java.util.Scanner;

public class Rat_Chases_its_cheese8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        char [] [] maze = new char[n][m];
        for(int i=0; i<maze.length; i++){
            String s=sc.next();
            for(int j=0; j<s.length(); j++){
                maze[i][j] =s.charAt(j);
            }
        }
        int [][] ans = new int[n][m];
        RatInmaze(maze, 0, 0, ans);
        if(flag == false){
            System.out.println("Path Not Found");
        }
    }
    static  boolean flag = false;

    //Backtracking
    public static void RatInmaze(char [] [] maze,int cr, int cc, int  [][] ans){

        if(cr == maze.length-1 && cc== maze[0].length-1 && maze[cr][cc]!='X'){
            ans[cr][cc]=1;
            display(ans);
            flag=true;
            return;
        }
     if(cr <0 || cc<0 || cr>=maze.length || cc>=maze[0].length || maze[cr][cc] =='X'){
        return;
     }
     maze[cr][cc] ='X';
    ans[cr][cc]=1;
    int [] r={0,0,-1,1,-1,1,1,-1};
    int [] c={-1,1,0,0,1,1,-1,-1};
    for(int i=0; i<c.length; i++){
        RatInmaze(maze, cr +r[i], cc + c[i], ans);
    }
    //  RatInmaze(maze, cr, cc-1,ans); //left
    //  RatInmaze(maze, cr, cc+1 ,ans); //right
    //  RatInmaze(maze, cr-1, cc, ans);  //up
    //  RatInmaze(maze, cr+1, cc, ans); //down
     maze[cr][cc]='O';
     ans[cr][cc]=0;
    }

    public static void display(int  [][] ans){
        for(int i=0; i<ans.length; i++){
            for(int j=0; j<ans[0].length; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
