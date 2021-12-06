import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ChessBoard board = new ChessBoard("White");
        board.printBoard();
        ChessPiece horse = new Horse("White");
        horse.canMoveToPosition(board,2,2,3,0);
        ChessPiece bishop = new Bishop("White");
        bishop.canMoveToPosition(board, 4, 3,1, 0);
    }
}
