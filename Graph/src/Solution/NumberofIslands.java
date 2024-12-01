public class NumberofIslands {
    public int numIslands(char[][] grid) {
        int count = 0;
        int row = grid.length;
        int col = grid[0].length;
        int[][] used = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1' && used[i][j] == 0) {
                    count++;
                    helper(grid, i, j, used);
                }
            }
        }
        return count;
    }

    private void helper(char[][] grid, int i, int j, int[][] used) {
        if (i < 0 || i > grid.length - 1 || j < 0 || j > grid[0].length - 1) {
            return;
        }

        if (grid[i][j] == '0' || used[i][j] == 1)
            return;

        used[i][j] = 1;
        helper(grid, i + 1, j, used);
        helper(grid, i - 1, j, used);
        helper(grid, i, j - 1, used);
        helper(grid, i, j + 1, used);
    }
}
