package pieceImplementation;

import java.util.List;

import interfaces.IPiece;
import utility.ChessUtilities;

public class Queen implements IPiece {
	private final static int BOARD_SIZE = 8;
	@Override
	public List<String> getPossibleMoves(int col, int row, String[][] board) {
		System.out.println("\nQueen's possible moves from position " + board[row][col] + ":");
		for (int i = 0; i < BOARD_SIZE; i++) {
            if (i != row) {
                System.out.print(board[i][col] + " "); // Vertical movement
            }
            if (i != col) {
                System.out.print(board[row][i] + " "); // Horizontal movement
            }
        }

        // Diagonal movements
        for (int i = 1; i < BOARD_SIZE; i++) {
            if (ChessUtilities.isValidMove(row + i, col + i)) {
                System.out.print(board[row + i][col + i] + " ");
            }
            if (ChessUtilities.isValidMove(row + i, col - i)) {
                System.out.print(board[row + i][col - i] + " ");
            }
            if (ChessUtilities.isValidMove(row - i, col + i)) {
                System.out.print(board[row - i][col + i] + " ");
            }
            if (ChessUtilities.isValidMove(row - i, col - i)) {
                System.out.print(board[row - i][col - i] + " ");
            }
        }
        System.out.println();
        return null;

	}

}
