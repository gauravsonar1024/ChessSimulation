package pieceImplementation;

import java.util.List;

import interfaces.IPiece;
import utility.ChessUtilities;

public class Pawn implements IPiece {

	@Override
	public List<String> getPossibleMoves(int col, int row, String[][] board) {
		 System.out.println("\nPawn's possible moves from position " + board[row][col] + ":");
	        int newRow = row - 1;
	        if (ChessUtilities.isValidMove(newRow, col)) {
	            System.out.println(board[newRow][col]);
	        } else {
	            System.out.println("No valid moves for the Pawn.");
	        }
	        return null;
	}

}
