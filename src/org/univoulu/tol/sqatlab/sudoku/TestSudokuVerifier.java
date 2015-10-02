package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	private static final String CORRECT_SUDOKU_STRING = "417369825632158947958724316825437169791586432346912758289643571573291684164875293"; 
	
	@Test
	public void testVerifyMethodCorrectString() {
		
		SudokuVerifier verifier = setupVerifier();
		
		assertEquals(0, verifier.
				verify(CORRECT_SUDOKU_STRING));
		
	}
	
	@Test 
	public void testVerifyMethodNegativeNumbers(){
		
		SudokuVerifier verifier = setupVerifier();
		
		assertEquals(-1, 
				verifier.verify("-417369825632158947958724316825437169791586432346912758289643571573291684164875293"));
	}
	
	@Test
	public void testVerifyMethodIncorrectCharacterInInputString(){
		
		SudokuVerifier verifier = setupVerifier();
		
		assertEquals(-1, verifier.verify(CORRECT_SUDOKU_STRING.replace('1', '-')));
	}
	
	@Test
	public void testVerifyMethodTooShortString(){
		
		SudokuVerifier verifier = setupVerifier();
		
		assertEquals(-1, verifier.verify(CORRECT_SUDOKU_STRING.substring(0, 18)));
	}
	
	@Test
	public void testVerifyMethodTooLongString(){
		
		SudokuVerifier verifier = setupVerifier();
		
		assertEquals(-1, verifier.verify(CORRECT_SUDOKU_STRING + "12312"));
	}
	
	@Test
	public void testVerifyMethodIncorrectFirstRow(){
		
		SudokuVerifier verifier = setupVerifier();
		
		String testString = "111111111" + CORRECT_SUDOKU_STRING.substring(9);
		
		assertEquals(-3, verifier.verify(testString));
	}
	
	@Test
	public void testVerifyMethodIncorrectThirdRow(){
		
		SudokuVerifier verifier = setupVerifier();
		
		String testString = CORRECT_SUDOKU_STRING.substring(0, 18) +
							"333333333" +
							CORRECT_SUDOKU_STRING.substring(27, 81);
		System.out.println(testString.length());
		
		
		assertEquals(-3, verifier.verify(testString));
	}
	
	
	private SudokuVerifier setupVerifier(){
		
		return new SudokuVerifier();
	}

}
