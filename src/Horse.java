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
        boolean check;
        if (toLine > 7 || toLine < 0 || toColumn > 7 || toColumn < 0) check = false;
        else if (line == toLine && column == toColumn) check = false;
        else if (
                        (line + 2 == toLine && (column + 1 == toColumn || column - 1 == toColumn)) ||
                        (line - 2 == toLine && (column + 1 == toColumn || column - 1 == toColumn)) ||
                        ((line + 1 == toLine || line - 1 == toLine) && column + 2 == toColumn) ||
                        ((line + 1 == toLine || line - 1 == toLine) && column - 2 == toColumn)
        ) check = true;
        else check = false;
        System.out.println("check " + check + " " + line + column + " " + toLine + toColumn);
        return check;
    }

    @Override
    public String getSymbol() {
        return "H";
    }
}
