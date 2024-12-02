package src.Solution;

public class MaxAreaofIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] used = new int[row][col];
        int Maxarea = 0;
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1 && used[i][j] == 0) {
                    Maxarea = Math.max(Maxarea,helper(grid, i, j, used));
                }
            }
        }
        return Maxarea;
    }

    private int helper(int[][] grid, int i, int j, int[][] used) {
        if (i < 0 || i > grid.length - 1 || j < 0 || j > grid[0].length - 1) {
            return 0;
        }
        if(grid[i][j] == 0 || used[i][j] == 1 ){
            return 0;
        }

        used[i][j] = 1;
        int area = 1;
        area += helper(grid,i - 1, j , used);
        area += helper(grid,i + 1, j, used);
        area += helper(grid,i, j - 1 , used);
        area += helper(grid,i , j + 1 , used);

        return area;
    }
}
