package pieces;

import board.Board;
import square.Square;

public class Pawn extends Piece {
    public Pawn(boolean white) {
        super(white);
    }

    @Override
    public boolean canMove(Board board, Square start, Square end) {

        if (end.getPiece().isWhite() == this.isWhite()) {
            return false;
        }

        int x = Math.abs(start.getX() - end.getX());
        int y = Math.abs(start.getY() - end.getY());
        if (x == 0 && y == 1) {
            // logic for valid move
        }
        
        return this.capture(board, start, end);
    }

    private boolean capture(Board board, Square start, Square end) {

        int x = Math.abs(start.getX() - end.getX());
        int y = Math.abs(start.getY() - end.getY());
        if (x == 1 && y == 1) {
            // logic for valid capture move
        }
        

        return this.startingMove(start, end);
    }

    private boolean startingMove(Square start, Square end) {
        
        int x = Math.abs(start.getX() - end.getX());
        int y = Math.abs(start.getY() - end.getY());
        if (x == 0 && y == 2) {
            // logic for valid starting move
        }

        return false;
    }

    
}
