package pieceImplementation;

import java.util.ArrayList;
import java.util.List;

import interfaces.IPiece;
import utility.ChessUtilities;

public class King implements IPiece {

	@Override
	public List<String> getPossibleMoves(int col, int row, String[][] board) {
		
		System.out.println("\nKing's possible moves from position " + board[row][col] + ":");
		List<String> possiblePositions = new ArrayList<>();
	    for (int dx = -1; dx <= 1; dx++) {
	        for (int dy = -1; dy <= 1; dy++) {
	            if (dx == 0 && dy == 0) {
	                continue;
	            }

	            int newX = row + dx;
	            int newY = col + dy;

	            if (ChessUtilities.isValidMove(newX, newY)) {
	            	possiblePositions.add(board[newX][newY]);
	            }
	        }
	    }
	    return possiblePositions;
	}

}
