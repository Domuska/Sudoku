package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	@Test
	public void testVerifyMethodCorrectString() {
		
		SudokuVerifier verifier = setupVerifier();
		
		assertEquals(1, verifier.
				verify("417369825632158947958724316825437169791586432346912758289643571573291684164875293"));
		
	}
	/*
	@Test
	public void testVerifyMethodWrongString(){
		
		SudokuVerifier verifier = setupVerifier();
		
		assertEquals(-2, verifier
				.verify("123456789912345678891234567789123456678912345567891234456789123345678912234567891"));
		
	}*/
	
	@Test 
	public void testVerifyMethodNegativeNumbers(){
		
		SudokuVerifier verifier = setupVerifier();
		
		assertEquals(-1, 
				verifier.verify("-417369825632158947958724316825437169791586432346912758289643571573291684164875293"));
	}
	
	private SudokuVerifier setupVerifier(){
		
		return new SudokuVerifier();
	}

}
