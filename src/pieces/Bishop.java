package pieces;

public class Bishop extends Piece {
    public Bishop(boolean white) {
        super(white);
    }


    @Override
    public boolean canMove(Board board, Square start, Square end) {

        if (end.getPiece().isWhite() == this.isWhite()) {
            return false;
        }

        int x = Math.abs(start.getX() - end.getX());
        int y = Math.abs(start.getY() - end.getY());
        if (x != 0 && x == y) {
            // Logic for valid move
            return true;
        }

        return false;
        
    }
}
