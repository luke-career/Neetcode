public class WordSearch {
    public boolean exist(char[][] board, String word) {
        boolean[][] used = new boolean[board.length][board[0].length];
        boolean res = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                res = helper(board, 0, word, i, j,used);
                if (res == true) {
                    return true;
                }
            }
        }

        return false;

    }

    public boolean helper(char[][] board, int index, String word, int x, int y,boolean[][] used) {
        if (index == word.length()) {
            return true;
        }
        if (x < 0 || y < 0 || x >= board.length || y >= board[0].length || used[x][y] == true || board[x][y] !=  word.charAt(index)) {
            return false;
        }
        used[x][y] = true;
        boolean found = helper(board, index + 1, word, x - 1, y,used) ||
                helper(board, index + 1, word, x + 1, y,used) ||
                helper(board, index + 1, word, x, y - 1,used) ||
                helper(board, index + 1, word, x, y + 1,used);

        used[x][y] = false;
        return found;

    }
}
