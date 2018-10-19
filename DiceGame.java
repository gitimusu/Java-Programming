import java.util.Scanner;

/* A program to play the random dice game */

public class DiceGame {
	private int diceFace;	// declare diceFace instance variable.
	private int userGuess;	// declare userGuess instance variable.
	
	public DiceGame(int diceFace){		// a constructor that takes an integer value of diceFace.    
		for(diceFace=1;diceFace<=6;diceFace++)		// defined the range of diceFace.
		this.diceFace = diceFace;				// assign the integer value to the instance variable of diceFace.
	}
	private int rollDice(){			// a method used to pick up random numbers.
		return diceFace = (int)(Math.random()*6)+1;
	}
	private int getUserInput(){			// get user input.
		Scanner k = new Scanner(System.in);		// used the scanner to get keyboard input of the user.
			userGuess = k.nextInt();
			if(userGuess>6){			// condition for the userGuess value range.
				System.out.println("input number between 1~6");
			}
			return userGuess;
}
	private void checkUserGuess(){		// a method used to compare the user input with the random numbers.
		
		if(getUserInput()==diceFace){	// comparing userInput and diceFace.
			System.out.println("Bingo!");	// gives it a command if true.
		}
		else System.out.println("Wrong!");
		
	}
	public void startPlaying(){			// a method to call both rollDice() and checkUserInput() methods.
		rollDice();
		checkUserGuess();
		
	}
}

/*      TestDiceGame CLASS File     */

import java.util.Scanner;

public class TestDiceGame {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		DiceGame d = new DiceGame(1);	// create a diceGame object with 1 integer as argument.
		System.out.println("==========================");
		System.out.println("Major: Computer ENG.");
		System.out.println("ID: 1415001");
		System.out.println("Name: Ahmad Z. Muslimat");
		System.out.println("==========================");
		System.out.println(" ");
		
		String input = "y";		// declare and initialize the string to enable infinite loop.
		do{
			System.out.println(" ");
			System.out.println("<< GAME START >>");
			System.out.println("Dice is rolled!!!");
			System.out.println("Guess the number! What do you think?");
			d.startPlaying();
			
			System.out.println("Try again?(y/n)");
			input = kbd.next();
		}while(input.equalsIgnoreCase("y"));
		System.out.println("Game finished");
	}
}
