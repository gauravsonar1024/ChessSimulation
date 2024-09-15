package interfaces;

import java.util.List;

public interface IPiece {
	public List<String> getPossibleMoves(int x, int y, String[][] board);
}
