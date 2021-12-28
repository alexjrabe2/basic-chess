package pieces;

import board.Board;
import square.Square;

/**
 * An abstract class for all pieces on the board
 */
public abstract class Piece {
    private boolean onBoard = true;
    private boolean white = false;

    public Piece(boolean white) {
        this.setWhite(white);
    }

    public boolean isWhite() { return this.white; }

    public void setWhite(boolean white) { this.white = white; }

    public boolean isOnBoard() { return this.onBoard; }

    public void setOnBoard(boolean on_board) { this.on_board = onBoard; }

    public abstract boolean canMove(Board board, Square start, Square end);
}
