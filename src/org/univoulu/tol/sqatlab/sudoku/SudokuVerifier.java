package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {

	private String candidateString;
	private final int ROW_LENGTH = 9;
	
	public int verify(String candidateSolution) {
		
		candidateString = candidateSolution;
		
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
		
		
		if(candidateString.length() != 81)
			return -1;
		
		
		//check that the string includes only numbers
		
		try{
			for (int i = 0; i < candidateString.length(); i++){
				
				if(Integer.parseInt("" + candidateString.charAt(i)) < 0){
					
					return -1;
				}
			}
		}
		//index inspected wasn't a number
		catch(NumberFormatException e){
			return -1;
		}
		
		//see if rows contain same numbers
		if(!testRow()){
			return -3;
		}
		
		//see if column contains same numbers
		if(!testColumn()){
			return -4;
		}
		
		
			
		return 0;
	}
	
	private boolean testRow(){
		
		for(int j = 0; j < candidateString.length(); j+=9){
			
			
			String subString = candidateString.substring(j, j+9);
			
			for (int i = 0; i < subString.length(); i++){
				
				String inspectable = "" + subString.charAt(i);
				
				StringBuilder builder = new StringBuilder(subString);
				subString = builder.deleteCharAt(i).toString();
				
				
				if(subString.contains(inspectable)){
					return false;
				}
				
			}
				
		}
		
		return true;
	}
	
	private boolean testColumn(){
		
		String subString = "";
		
		//THIS METHOD IS STILL INCOMPLETE, IT DOES NOT GO THROUGH
		//ALL COLUMNS, ONLY THE FIRST COLUMN
		
		System.out.println(candidateString.length()/ROW_LENGTH);
		
		for(int j = 0; j < candidateString.length()/ROW_LENGTH; j++){
		
			for(int i = 0; i < candidateString.length(); i +=ROW_LENGTH){
				subString = subString + candidateString.charAt(i);
			}
			
			
			//for(int i = 0; i < subString.length(); i++){
			do{
				
				String inspectable = "" + subString.charAt(i);
				
				StringBuilder builder = new StringBuilder(subString);
				subString = builder.deleteCharAt(i).toString();
				
				
				if(subString.contains(inspectable)){
					System.out.println("Row " + j);
					return false;
				}
			//}
			}while(subString.length() > 0);
		}
		
		//METHOD INCOMPLETE
		return true;
	}
}
