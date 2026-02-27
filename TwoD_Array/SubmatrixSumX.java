// Given a matrix mat[][] of size n × m and an integer x, find the number of square submatrices whose sum of elements is equal to x.
public class SubmatrixSumX {
    public static void main(String[] args) {
        int [][] mat ={{2, 4, 7, 8, 10}, {3, 1, 1, 1, 1} ,{9, 11, 1, 2, 1}, {12, -17, 1, 1, 1}};
        int x=10;
        System.out.println(countSquare(mat,  x));
    }
     public static  int countSquare(int[][] mat, int x){
        int r= mat.length;
        int c= mat[0].length;

     }
}
