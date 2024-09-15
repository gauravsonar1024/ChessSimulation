package factory;

import enums.PieceEnum;
import interfaces.IPiece;
import pieceImplementation.King;
import pieceImplementation.Pawn;
import pieceImplementation.Queen;

public class PieceFactory {
	
	
	public IPiece getPiece(String pieceName) {
		if(pieceName.equalsIgnoreCase(PieceEnum.KING.toString())) {
			return new King();
		} else if ( pieceName.equalsIgnoreCase(PieceEnum.QUEEN.toString())) {
			return new Queen();
		} else if ( pieceName.equalsIgnoreCase(PieceEnum.PAWN.toString())) {
			return new Pawn();
		}
		
		return null;
	}

}
