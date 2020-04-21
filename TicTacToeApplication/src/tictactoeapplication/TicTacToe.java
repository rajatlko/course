package tictactoeapplication;

public class TicTacToe {
	protected char[] board;
	protected char userMarker;
	protected char aiMarker;
	protected char winner;
	protected char currentMarker;
	public TicTacToe(char playerToken,char aiMarker) {
		this.userMarker=playerToken;
		this.aiMarker=aiMarker;
		this.winner='-';
		this.board=setBoard();
	}
	public static char[] setBoard() {
		char[] board=new char[9];
		for(int i=0;i<board.length;i++) {          
			board[i]='-';
		}
		//it will only create blank board           
		return board;
	}
	public boolean playTurn(int spot) {
		boolean isValid=withinRange(spot)&& !isSpotTaken(spot);
		//to check if spot is taken or not    
		if(isValid) {
			board[spot-1]=currentMarker;
			currentMarker=(currentMarker==userMarker)?aiMarker:userMarker;
			//to flip the turn
				
		}
		return isValid;
	} 
	//check if our spot is in our range
	public boolean withinRange(int number) {
		return number>0 && number<board.length+1;
	}
	//checkif the spot is taken
	public boolean isSpotTaken(int number) {
		return board[number-1]!='-';
	}
	public void printBoard() {
		
	}
}
