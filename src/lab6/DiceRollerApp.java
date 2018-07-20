package lab6;

import java.util.Scanner;
import java.util.Random;

//Darby O'Rear 7/19/18

public class DiceRollerApp {
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		int numSides;
		String userContinue;
		
		do {
		//Ask the user to enter the number of sides for a pair of dice. Each die will have the same number of sides.
		System.out.println("Please enter the number of sides you would like your virtual dice to have: ");
		numSides = scnr.nextInt();
		rollDice(numSides);
		
		System.out.println("Would you like to play again? (y/n)");
		userContinue = scnr.next();
		} while((userContinue.equals("y")));
			System.out.println("Thanks for playing!");
	}
	
	public static void rollDice(int numSides) {
	//Ask the user to roll the dice.
	System.out.println("Roll the dice!");
	System.out.println();
	
	//Roll the dice. First, generate a random number.
	//The number needs to be between 0 and numSides.
	//Set a seed value of 1 so it has a pseudo-random starting point.
	Random roll1 = new Random();
	int seedVal;
	seedVal = 1;
	roll1.setSeed(seedVal);
	
	//Generate a second random number.
	Random roll2 = new Random();
	seedVal = 2;
	roll2.setSeed(seedVal);

	System.out.println("Your first roll is a " + roll1.nextInt(numSides) + ".");
	System.out.println("Your second roll is a " + roll2.nextInt(numSides) + ".");

	}
}
