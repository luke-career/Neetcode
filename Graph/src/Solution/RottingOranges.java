package Solution;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int count = 0;
        int freshOrange = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[] { i, j });
                }else if(grid[i][j] == 1){
                    freshOrange++;
                }
            }
        }
        while (!queue.isEmpty() && freshOrange > 0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] r = queue.poll();
                int x = r[0];
                int y = r[1];
                if (x - 1 >= 0 && grid[x - 1][y] == 1) {
                    grid[x - 1][y] = 2;
                    freshOrange--;
                    queue.offer(new int[] { x - 1, y });
                }
                if (x + 1 < row && grid[x + 1][y] == 1) {
                    grid[x + 1][y] = 2;
                    freshOrange--;
                    queue.offer(new int[] { x + 1, y });
                }

                if (y - 1 >= 0 && grid[x][y - 1] == 1) {
                    freshOrange--;
                    grid[x][y - 1] = 2;
                    queue.offer(new int[] { x, y - 1 });
                }

                if (y + 1 < col && grid[x][y + 1] == 1) {
                    freshOrange--;
                    grid[x][y + 1] = 2;
                    queue.offer(new int[] { x, y + 1 });
                }
            }
            count++;

        }
        return freshOrange == 0 ? count : -1;

    }
}
