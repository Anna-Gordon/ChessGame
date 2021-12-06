public class Horse extends ChessPiece {
    public Horse(String color) {
        super(color);
    }

    @Override // getter
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        boolean checkPosition = false;
        if (checkBoardLimits(toLine, toColumn) && moveToSamePosition(line, column, toLine, toColumn)) {
            if (
                    (line + 2 == toLine && (column + 1 == toColumn || column - 1 == toColumn)) ||
                            (line - 2 == toLine && (column + 1 == toColumn || column - 1 == toColumn)) ||
                            ((line + 1 == toLine || line - 1 == toLine) && column + 2 == toColumn) ||
                            ((line + 1 == toLine || line - 1 == toLine) && column - 2 == toColumn)
            ) checkPosition= true;
        } else checkPosition= false;
        System.out.println("checkPosition" + checkPosition+ " " + line + "/" + column + " " + toLine + "/" + toColumn);
        return checkPosition;
    }

    @Override
    public String getSymbol() {
        return "H";
    }
}
