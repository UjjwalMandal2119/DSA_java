package TwoD_Array;
// Given a matrix mat[][] of size n × m and an integer x, find the number of square submatrices whose sum of elements is equal to x.
public class SubmatrixSumX {
    public static void main(String[] args) {
        int [][] mat ={{2, 4, 7, 8, 10}, {3, 1, 1, 1, 1} ,{9, 11, 1, 2, 1}, {12, -17, 1, 1, 1}};
        int x=10;
        System.out.println(countSquare(mat,  x));
    }
     public static  int countSquare(int[][] mat, int x){
       int n = mat.length;
        int m = mat[0].length;
        int[][] pref = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                pref[i][j] = mat[i - 1][j - 1]
                        + pref[i - 1][j]
                        + pref[i][j - 1]
                        - pref[i - 1][j - 1];
            }
        }
        int count = 0;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                int maxSize = Math.min(n - r, m - c);
                for (int k = 1; k <= maxSize; k++) {
                    int sum = pref[r + k][c + k]
                            - pref[r][c + k]
                            - pref[r + k][c]
                            + pref[r][c];
                    if (sum == x) count++;
                }
            }
        }
        return count;

        
     }
}
