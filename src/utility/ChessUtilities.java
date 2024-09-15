package utility;

public class ChessUtilities {
	private final static int BOARD_SIZE = 8;
	
	public static String convertToChessNotation(int row, int col) {
        char column = (char) ('A' + col);
        int boardRow = BOARD_SIZE - row;
        return "" + column + boardRow;
    }
	
    public static int[] convertFromChessNotation(String position) {
        int col = position.charAt(0) -'A';
        int row = BOARD_SIZE -Integer.parseInt(position.substring(1));
        return new int[]{col, row};
    }
    
    // Function to check if a move is within bounds of the chessboard
    public static boolean isValidMove(int x, int y) {
        return x >= 0 && x < BOARD_SIZE && y >= 0 && y < BOARD_SIZE;
    }
}
