/*public class n_queen {

    public static void main(String[] args) {

        char[][] Board = new char[4][4];
        for (int i = 0; i < Board.length; i++) {
            for (int j = 0; j < Board[i].length; j++) {
                Board[i][j] = '.';
            }
        }
        helper(Board, 0);

    }

    static void printBoard(char[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }

    static boolean isSafe(char[][] board, int row, int col) {

        // horizontal
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }

        }

        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // upper left
        for (int r = row, c = col; r >= 0 && c >= 0; r--, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // upper right

        for (int r = row, c = col; c < board.length && r >= 0; c++, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // lower left

        for (int r = row, c = col; r < board.length && c >= 0; r++, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // lower right

        for (int r = row, c = col; c < board.length && r < board.length; r++, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        return true;
    }

    static void helper(char[][] board, int col) {

        if (col == board.length) {
            printBoard(board);
            System.out.println();
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(board, row, col)) {

                board[row][col] = 'Q';
                helper(board, col + 1);
                board[row][col] = '.';
            }
        }

    }
}*/

public class n_queen {

    public static void main(String[] args) {

        char[][] board = new char[8][8];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '.';
            }

        }

        helper(board, 0);
    }

    static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean issafe(char[][] board, int row, int col) {
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == 'Q') {
                return false;
            }
        }

        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        for (int r = row, c = col; r >= 0 && c >= 0; r--, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        for (int r = row, c = col; r >= 0 && c < board.length; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        for (int r = row, c = col; r < board.length && c >= 0; r++, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        for (int r = row, c = col; r < board.length && c < board.length; r++, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        return true;
    }

    static void helper(char[][] board, int col) {

        if (col == board.length) {
            printBoard(board);
            System.out.println();
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (issafe(board, row, col)) {
                board[row][col] = 'Q';
                helper(board, col + 1);
                board[row][col] = '.';
            }
        }

    }
}
