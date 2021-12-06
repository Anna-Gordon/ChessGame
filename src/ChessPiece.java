public abstract class ChessPiece {
    protected String color;
    protected boolean check = true;

    public ChessPiece(String color) {
        this.color = color;
    }
    public abstract String getColor();
    public abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);
    public abstract String getSymbol(); // returns type of figure

    public boolean checkBoardLimits(int toLine, int toColumn){
        if (toLine > 7 || toLine < 0 || toColumn > 7 || toColumn < 0) return false;
        else return true;
    }

    public boolean moveToSamePosition(int line, int column, int toLine, int toColumn){
        if (line == toLine && column == toColumn) return false;
        else return true;
    }

}
