package board;

import square.Square;

public class Board {
    Square[][] board;

    public Board() {
        this.resetBoard();
    }

    public Square getSquare(int x, int y) throws Exception {
        if (x < 0 || x > 7 || y < 0 || y > 7) {
            throw new Exception("Index Out of Bounds");
        }

        return board[x][y];
    }

    public void resetBoard() {
        // Initialize white pieces
        board[0][0] = new Square(0, 0, new Rook(true));
    }
}
