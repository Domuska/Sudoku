package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {

	public int verify(String candidateSolution) {
		// returns 1 if the candidate solution is correct
		/*Return -1: means it is violating Rule #1
		Return -2: means it is violating Rule #2
		Return -3: means it is violating Rule #3
		Return -4: means it is violating Rule #4
		return -1 if the length is too short*/
		
		
		String row = candidateSolution.substring(0, 9);
		System.out.println(row);
		
		/*
		if(Integer.parseInt(candidateSolution) < 0){
			
			return -1;
		}
		else{
			return 1;
		}
			*/
		
		return 0;
	}
}
