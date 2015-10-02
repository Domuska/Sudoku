package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {

	public int verify(String candidateSolution) {
		
		
		// returns 1 if the candidate solution is correct
		/*
		
    R1: A cell in a Sudoku game can only store positive digits, i.e. 1...9.
    R2: All digits appear only once in a sub-grid, i.e. they cannot repeat.
    R3: A digit can appear only once in the rows of the global grid.
    R4: A digit can appear only once in the columns of the global grid.

		
		Return -1: means it is violating Rule #1
		Return -2: means it is violating Rule #2
		Return -3: means it is violating Rule #3
		Return -4: means it is violating Rule #4
		return -1 if the length is too short or long*/
		
		
		if(candidateSolution.length() != 81)
			return -1;
		
		
		//check that the string includes only numbers
		
		try{
			for (int i = 0; i < candidateSolution.length(); i++){
				
				if(Integer.parseInt("" + candidateSolution.charAt(i)) < 0){
					
					return -1;
				}
			}
		}
		//index inspected wasn't a number
		catch(NumberFormatException e){
			return -1;
		}
		
		//for(int i = 0; i < candidateSolution.length(); i+=9){
			
		
		String subString = candidateSolution.substring(0, 9);
		
		for (int i = 0; i < subString.length(); i++){
			
			String inspectable = "" + subString.charAt(i);
			
			for(int j = 0; j < subString.length()-1; j++){
				
				if(inspectable.equals("" + subString.charAt(j))){
					
					return -3;
				}
			}
		}
			
			
		//}
		
		
			
		return 0;
	}
	
	
}

/*for(int i = 0; i <= 9; i++){
String row = candidateSolution.substring(i, i+9);
System.out.println(row);

if(Integer.parseInt(row) < 0){
	return -1;
}


}*/


/*
 try{
			for (int i = 0; i < candidateSolution.length(); i++){
				
				if(Integer.parseInt("" + candidateSolution.charAt(i) + "") < 0){
					
					return -1;
				}
			}
		}
		//index inspected wasn't a number
		catch(NumberFormatException e){
			return -1;
		}
 */

