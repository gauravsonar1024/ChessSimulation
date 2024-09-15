package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exceptions.InvalidPieceException;
import factory.PieceFactory;
import interfaces.IPiece;
import utility.ChessBoard;
import utility.ChessUtilities;

public class Main {
	
	public List<String> printPossibleMoves(String pieceName, String location) throws InvalidPieceException {
		int[] coordinates = ChessUtilities.convertFromChessNotation(location);
        int x = coordinates[0];
        int y = coordinates[1];
		PieceFactory pf = new PieceFactory();
		IPiece piece = pf.getPiece(pieceName);
		ChessBoard cb = new ChessBoard();
		String [][] board = cb.getBoard();
		List<String> possibleMoves  = new ArrayList<>();
		if(piece != null) {
			possibleMoves = piece.getPossibleMoves(x, y, board);
			System.out.println(possibleMoves);
		} else {
			throw new InvalidPieceException("");
		}
		
		return possibleMoves;
	}
	
	public static void main(String[] args) throws InvalidPieceException {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the piece type (King, Pawn, Queen): ");
			String pieceName = scanner.nextLine();
			System.out.println("Enter the position in chess notation (e.g., D5): ");
			String location = scanner.nextLine();
			Main m = new Main();
			m.printPossibleMoves(pieceName, location);
		}
	}
}
