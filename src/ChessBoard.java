public class ChessBoard {

    static private ChessBoard instance = new ChessBoard();

    private ChessBoard() {
    }

    static ChessBoard getInstance() {
        if (instance == null) {
            instance = new ChessBoard();

        }
        return instance;
    }

    public static void main(String args[]) {
        ChessBoard tabuleiro1 = ChessBoard.getInstance();
        ChessBoard tabuleiro2 = ChessBoard.getInstance();
        ChessBoard tabuleiro3 = ChessBoard.getInstance();
        ChessBoard tabuleiro4 = ChessBoard.getInstance();

        System.out.println(tabuleiro1);
        System.out.println(tabuleiro2);
        System.out.println(tabuleiro3);
        System.out.println(tabuleiro4);

    }
}
