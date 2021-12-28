package pieces;

import board.Board;
import square.Square;

public class King extends Piece {
    private boolean castlingDone = false;

    public King(boolean white) {
        super(white);
    }

    public boolean isCastlingDone() { return this.castlingDone; }

    public void setCastlingDone(boolean castlingDone) { this.castlingDone = castlingDone; }

    @Override
    public boolean canMove(Board board, Square start, Square end) {
        
        if (end.getPiece().isWhite() == this.isWhite()) {
            return false;
        }

        int x = Math.abs(start.getX() - end.getX());
        int y = Math.abs(start.getY() - end.getY());
        if (x + y == 1) {
            // check if the move will result in the king being attacked

            return true;
        }

        
        return this.isValidCastling(board, start, end);
    }

    private boolean isValidCastling(Board board, Square start, Square end) {

        if (this.isCastlingDone()) {
            return false;
        }
        
        if (this.isCastlingMove(start, end)) {
            return true;
        }
        
        return false;
    }

    public boolean isCastlingMove(Square start, Square end) {
        // check if the move is a castling move
        int x = Math.abs(start.getX() - end.getX());
        int y = Math.abs(start.getY() - end.getY());
        if (x == 0 && y == 2) {
            // check if the move will result in the king being attacked

            return true;
        }
        
        return false;
    }
}
