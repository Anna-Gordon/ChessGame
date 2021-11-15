public class Main {
    public static void main(String[] args) {
        ChessBoard board = new ChessBoard("White");
        board.printBoard();
        ChessPiece horse = new Horse("White");
        horse.canMoveToPosition(board,2,2,3,0);
    }
}
