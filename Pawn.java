package Chess.src.StartingCode;

public class
Pawn extends Piece {

        public Pawn(int x, int y, Side side, Board board) {
                super(x, y, side, board);
        }

        @Override
        public boolean canMove(int destX, int destY) {

                if (getSide() == Side.WHITE) {
                        if (this.x - destX == 0 && this.y - destY == 1) {
                                if (board.get(destX, destY) == null) {
                                        return true;
                                }
                        }

                        if (this.y == 6) {
                                if (this.x - destX == 0 && (this.y - destY) <= 2 && (this.y - destY) >= 0) {
                                        if (board.get(destX, destY) == null) {
                                                return true;
                                        } else {
                                                if (this.x - destX == 0 && this.y - destY == 1) {
                                                        if (board.get(destX, destY) == null) {
                                                                return true;
                                                        }
                                                }
                                        }
                                }
                        }
                        if (Math.abs(this.x - destX) == 1 && this.y - destY == 1) {
                                if (board.get(destX, destY) != null && board.get(destX, destY).getSide() != getSide()) {
                                        return true;
                                }
                        }
                }
                else if (getSide() == Side.BLACK) {
                        if (this.x - destX == 0 && this.y - destY == -1) {
                                if (board.get(destX, destY) == null) {
                                        return true;
                                }
                        }

                        if (this.y == 1) {
                                if (this.x - destX == 0 && (this.y - destY) >= -2 && (this.y - destY) <= 0) {
                                        if (board.get(destX, destY) == null) {
                                                return true;
                                        } else {
                                                if (this.x - destX == 0 && this.y - destY == -1) {
                                                        if (board.get(destX, destY) == null) {
                                                                return true;
                                                        }
                                                }
                                        }

                                }
                        }
                        if (Math.abs(this.x - destX) == 1 && this.y - destY == -1) {
                                if (board.get(destX, destY) != null && board.get(destX, destY).getSide() != getSide()) {
                                        return true;
                                }
                        }

                }
                return false;
        }


        @Override
        public String getSymbol() {
                return this.getSide() == Side.BLACK ? "♟" : "♙";
        }
}
