package practice;

import java.util.Scanner;
import practice.Utility;

class Player1{
	int pGuessNum;
	public int guessNumber() {
		System.out.println("It's your turn Player-1");
		Utility utility=new Utility();
		pGuessNum= utility.getInput();
		return pGuessNum;
	}
}
class Player2{
	int pGuessNum;
	public int guessNumber() {
		System.out.println("It's your turn Player-2");
		Utility utility=new Utility();
		pGuessNum= utility.getInput();
		return pGuessNum;
	}
}
class Player3{
	int pGuessNum;
	public int guessNumber() {
		System.out.println("It's your turn Player-3");
		Utility utility=new Utility();
		pGuessNum= utility.getInput();
		return pGuessNum;
	}
}
class Player4{
	int pGuessNum;
	public int guessNumber() {
		System.out.println("It's your turn Player-4");
		Utility utility=new Utility();
		pGuessNum= utility.getInput();
		return pGuessNum;
	}
}
class Player5{
	int pGuessNum;
	public int guessNumber() {
		System.out.println("It's your turn Player-5");
		Utility utility=new Utility();
		pGuessNum= utility.getInput();
		return pGuessNum;
	}
}
class Guesser{
	int guessNum;
	Scanner sc=new Scanner(System.in);
	public int guessNumber() {
		System.out.println("It's your turn guesser: ");
		guessNum=sc.nextInt();
		return guessNum;
	}
}

class Umpire{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	int numFromPlayer4;
	int numFromPlayer5;
	
	public void collectNumFromGuesser() {
		Guesser g=new Guesser();
		numFromGuesser=g.guessNumber();
	}
	
	public void collectNumFromPlayer() {
		Player1 player1=new Player1();
		Player2 player2=new Player2();
		Player3 player3=new Player3();
		Player4 player4=new Player4();
		Player5 player5=new Player5();
		
		
		numFromPlayer1=player1.guessNumber();
		numFromPlayer2=player2.guessNumber();
		numFromPlayer3=player3.guessNumber();
		numFromPlayer4=player4.guessNumber();
		numFromPlayer5=player5.guessNumber();
		
	}
	
	void compare() {
		boolean player1=numFromGuesser==numFromPlayer1;
		boolean player2=numFromGuesser==numFromPlayer2;
		boolean player3=numFromGuesser==numFromPlayer3;
		boolean player4=numFromGuesser==numFromPlayer4;
		boolean player5=numFromGuesser==numFromPlayer5;
		
		if(player1) {
			if(player2 && player3 && player4 && player5) {
				System.out.println("Game tied all the players answered correctly");
			} else if(player2 && player3 && player4) {
				System.out.println("player 1,2,3 and player 4 won");
			} else if(player3 && player4 && player5) {
				System.out.println("player 1,3,4 and player 5 won");
			}else if(player2 && player3) {
				System.out.println("player 1,2 and player 3 won");
			}else if(player3 && player4) {
				System.out.println("player 1,3 and player 4 won");
			}else if(player4 && player5) {
				System.out.println("player 1,4 and player 5 won");
			}else if(player2) {
				System.out.println("player 1 and player 2 won");
			} else if(player3) {
				System.out.println("player 1 and player 3 won");
			}else if(player4) {
				System.out.println("player 1 and player 4 won");
			}else if(player5) {
				System.out.println("player 1 and player 5 won");
			} 
			else if(player5 && player3) {
				System.out.println("player 1,3 and player 5 won");
			}
			else if(player4 && player5) {
				System.out.println("player 1,4 and player 5 won");
			} else if(player2 && player5) {
				System.out.println("player 1,2 and player 5 won");
			} else if(player4 && player2) {
				System.out.println("player 1,2 and player 4 won");
			}
			else {
			System.out.println("Player 1 won");
			}
		}
		else if(player2) {
			if(player3 && player4 && player5) {
				System.out.println("player 2,3,4 and player 5 won the game");
			} else if(player3 && player4) {
				System.out.println("player 2,3 and player 4 won");
			}else if(player4 && player5) {
				System.out.println("player 2,4 and player 5 won");
			} else if(player3) {
				System.out.println("player 2 and player 3 won");
			}else if(player4) {
				System.out.println("player 2 and player 4 won");
			}else if(player5) {
				System.out.println("player 2 and player 5 won");
			}else {
			System.out.println("Player 2 won");
			}
		}
		else if(player3) {
			if(player4 && player5) {
				System.out.println("player 3,4 and player 5 won");
			} else if(player5) {
				System.out.println("player 3 and player 5 won");
			} else if(player4) {
				System.out.println("player 3 and player 4 won");
			} else {
			System.out.println("Player 3 won");
			}
		}
		else if(player4) {
			if(player5) {
				System.out.println("player 4 and 5 won");
			}else {
			System.out.println("Player 4 won");
			}
		}
		else if(player5) {
			System.out.println("Player 5 won");
		}
		else {
			System.out.println("Game Lost!!! try again please");
		}
	}
}


public class Game {
	public static void main(String[] args) {
		Umpire umpire=new Umpire();
		umpire.collectNumFromGuesser();
		umpire.collectNumFromPlayer();
		umpire.compare();
	}
}
