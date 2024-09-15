package utility;

public class ChessBoard {
	private static final int BOARD_SIZE = 8;
    private static final String[][] board = new String[BOARD_SIZE][BOARD_SIZE];
    
    public ChessBoard( ) {
		this.initializeBoard();
	}
	
	public void initializeBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = ChessUtilities.convertToChessNotation(i, j);
            }
        }
    }
	
	public String[][] getBoard() {
		return board;
	}
}
