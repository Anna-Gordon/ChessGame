public class Pawn extends ChessPiece {
    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        boolean checkPosition= false;
        if (checkBoardLimits(toLine, toColumn) && moveToSamePosition(line, column, toLine, toColumn)) {
            if (color.equals("White")) {
                if (toLine < line) return false;
                else {
                    if (line == 1 && (line + 2 == toLine && column == toColumn)) checkPosition= true;
                    else {
                        if (line + 1 == toLine && column == toColumn) checkPosition= true;
                    }
                }
            } else if (color.equals("Black")) {
                if (toLine > line) return false;
                else {
                    if (line == 6 && (line - 2 == toLine && column == toColumn)) checkPosition= true;
                    else {
                        if (line - 1 == toLine && column == toColumn) checkPosition= true;
                    }
                }
            }
        }
        else checkPosition= false;
        return checkPosition;
    }

        @Override
        public String getSymbol () {
            return "P";
        }
    }
