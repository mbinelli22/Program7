//Michael Binelli
package Program7;
import java.util.Scanner;
import java.util.*;

public class DiceGamePvC {
	
	//member variables
	static Scanner stdIn = new Scanner(System.in);
	static String player1;
	static String computer = "Computer";
	static int rounds;
	static int roundWinsPlayer1;
	static int roundWinsComputer;
	static int totalWinsPlayer1;
	static int totalWinsComputer;
	static int player1Dice1;
	static int player1Dice2;
	static int player1Dice3;
	static int dice1Roll;
	static int dice2Roll;
	static int dice3Roll;
	static List<Integer> dice1 = new ArrayList<>();
	static List<Integer> dice2 = new ArrayList<>();
	static List<Integer> dice3 = new ArrayList<>();
	
	//member methods
	public static void displayRules() {
		System.out.println("DICE GAME");
		System.out.println("---------");
		System.out.println("\t TRIPLE:   When all the dice have the same number on their faces.");
		System.out.println("\t PAIR:     When exactly two of the dice have the same number on their top faces.");
		System.out.println("\t STRAIGHT: When the three dice values can be arranged into a consecutive sequence,");
		System.out.println("\t\t   there are exactly two possible straights (2,3,5) < (3,5,7).");
		System.out.println("\t JUNK:     Anything that is not a Triple, Pair, or Straight.");
		System.out.println("---------");
		System.out.println("TRIPLE > STRAIGHT	STRAIGHT > PAIR		PAIR > JUNK");
		System.out.println("TRIPLE > PAIR		STRAIGHT > JUNK");
		System.out.println("TRIPLE > JUNK");
	}
	
	public static void getPlayerName() {
		System.out.println("Enter yo name fool: ");
		player1 = stdIn.nextLine();
	}
	
	public static void playGame() {
		System.out.println("Press (Y) to play: ");
		String playGame = stdIn.nextLine();
		System.out.println(playGame);
		if(playGame == "Y" || playGame == "y") {
			for(rounds = 1; rounds >= 1; rounds++) {
				getPlayerRoll();
				getComputerRoll();
				
				
			}
		
			
		}
	}
	
	public static int rollDice1() {
		dice1.add(2);
		dice1.add(3);
		dice1.add(5);
		dice1.add(7);
		Collections.shuffle(dice1);
		int rndmDiceSide = (int)(Math.random()*4);
		dice1Roll = dice1.get(rndmDiceSide);
		return dice1Roll;		
	}
	public static int rollDice2() {
		dice2.add(2);
		dice2.add(3);
		dice2.add(5);
		dice2.add(7);
		Collections.shuffle(dice2);
		int rndmDiceSide = (int)(Math.random()*4);
		dice2Roll = dice2.get(rndmDiceSide);
		return dice2Roll;
	}
	public static int rollDice3() {
		dice3.add(2);
		dice3.add(3);
		dice3.add(5);
		dice3.add(7);
		Collections.shuffle(dice3);
		int rndmDiceSide = (int)(Math.random()*4);
		dice3Roll = dice3.get(rndmDiceSide);
		return dice3Roll;
	}
	
	public static void getPlayerRoll() {
		rollDice1();
		rollDice2();
		rollDice3();
		int player1Dice1 = dice1Roll;
		int player1Dice2 = dice2Roll;
		int player1Dice3 = dice3Roll;
		System.out.println(player1 + " Rolled:");
		System.out.println("DICE 1:   " + player1Dice1);
		System.out.println("DICE 2:   " + player1Dice2);
		System.out.println("DICE 3:   " + player1Dice3);
	}
	public static void getComputerRoll() {
		rollDice1();
		rollDice2();
		rollDice3();
		int comp1Dice1 = dice1Roll;
		int comp1Dice2 = dice2Roll;
		int comp1Dice3 = dice3Roll;
		System.out.println("Computer Rolled:");
		System.out.println("DICE 1:   " + comp1Dice1);
		System.out.println("DICE 2:   " + comp1Dice2);
		System.out.println("DICE 3:   " + comp1Dice3);
	}
	
	public static boolean checkTriples() {
		if(player1Dice1 == player1Dice2 && player1Dice1 == player1Dice3) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static void checkPlayerDie() {
		if(player1Dice1 == player1Dice2 && player1Dice1 == player1Dice3) {
			
		}
	}
	
	public static void checkComputerDie() {
		
	}
	public static void checkStraights() {
		
	}
	
	public static void checkPairs() {
		
	}
	
	
	//constructor
	public static void main (String[] args) {
		displayRules();
		getPlayerName();
		playGame();
	}
}
