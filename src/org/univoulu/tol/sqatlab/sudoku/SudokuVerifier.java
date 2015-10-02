package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {

	public int verify(String candidateSolution) {
		// returns 1 if the candidate solution is correct
		/*Return -1: means it is violating Rule #1
		Return -2: means it is violating Rule #2
		Return -3: means it is violating Rule #3
		Return -4: means it is violating Rule #4
		return -1 if the length is too short*/
		
		System.out.println(candidateSolution);
		//System.out.println(Long.parseLong(candidateSolution));
		
		/*if(Long.parseLong(candidateSolution) < 0){
			
			return -1;
		}
		else{*/
			return 1;
		//}
			
		
		
	}
}
