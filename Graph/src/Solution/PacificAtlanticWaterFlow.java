package Solution;

import java.util.ArrayList;
import java.util.List;

public class PacificAtlanticWaterFlow {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int row = heights.length;
        int col = heights[0].length;

        List<List<Integer>> res = new ArrayList<>();

        boolean[][] canReachPacific = new boolean[row][col];
        boolean[][] canReachAtlantic = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            dfs(heights, i, 0, canReachPacific);
        }

        for (int j = 0; j < col; j++) {
            dfs(heights, 0, j, canReachPacific);
        }

        for (int i = 0; i < row; i++) {
            dfs(heights, i, col - 1, canReachAtlantic);
        }

        for (int j = 0; j < col; j++) {
            dfs(heights, row - 1, j, canReachAtlantic);
        }

        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights[0].length; j++) {
                List<Integer> list = new ArrayList<>();
                if (canReachAtlantic[i][j] == true && canReachPacific[i][j] == true) {
                    list.add(i);
                    list.add(j);
                    res.add(list);
                }
            }
        }
        return res;

    }

    private void dfs(int[][] heights, int i, int j ,boolean[][] canReach) {
        if (canReach[i][j] == true)
            return;
        canReach[i][j] = true;

        int[][] direction = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

        for (int k = 0; k < 4; k++) {
            int x = i + direction[k][0];
            int y = j + direction[k][1];
            if (x >= 0 && x < heights.length && y >= 0 && y <= heights[0].length - 1 && heights[x][y] >= heights[i][j]) {
                dfs(heights, x, y,canReach);
            }
        }
    }
}
