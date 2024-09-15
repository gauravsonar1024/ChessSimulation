package main;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MainTest {

	@Test
	public void testKingMoves( ) {
		Main m = new Main();
		List<String> expectedMoves = new ArrayList();
		expectedMoves.add("A2");
		expectedMoves.add("B2");
		expectedMoves.add("B1");
		List<String> actualMoves = m.printPossibleMoves("King", "A1");
		assertEquals(expectedMoves,actualMoves);
	}

}
