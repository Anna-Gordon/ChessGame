public class Bishop extends ChessPiece {
    public Bishop(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        boolean checkPosition = false;
        if (checkBoardLimits(toLine, toColumn) && moveToSamePosition(line, column, toLine, toColumn)) {
                if (Math.abs(toLine - line) == Math.abs(toColumn - column)) checkPosition = true;
        } else {
            checkPosition = false;
        }
        return checkPosition;
    }

    @Override
    public String getSymbol() {
        return "B";
    }
}
