public class RangeSumQuery2DImmutable {
    int[][] matrix;
    int[][] res;

    public RangeSumQuery2DImmutable(int[][] matrix) {
        this.matrix = matrix;
        int row = matrix.length;
        int col = matrix[0].length;
        res = new int[row+1][col+1];

        for(int i = 1; i <= row; i++){
            for(int j = 1;  j <= col; j++){
                res[i][j] = res[i-1][j] + res[i][j-1] - res[i-1][j-1] + matrix[i-1][j-1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return res[row2 + 1][col2 + 1] - (res[row1 ][col2 + 1] + res[row2 + 1][col1] - res[row1][col1 ]);
    }
}
