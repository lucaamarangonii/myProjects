import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		
		int randomNum = ((int)(Math.random() * 10000) + 1);
		int minRange = 1;
		int maxRange = 10000;
		int guess = -1; 
		
	    System.out.println("Please type your guess: ");

		
		while (guess != randomNum) { 
		    guess = scnr.nextInt(); 

		    if (guess < randomNum) {
		        System.out.println("Your guess is too low, try again.");
		        minRange = guess;
		    } else if (guess > randomNum) {
		        System.out.println("Your guess is too high, try again.");
		        maxRange = guess;  
		    } 

		    System.out.println("Please enter a number between " + minRange + " and " + maxRange);
		}

		System.out.println("WINNER!!!");
		
		scnr.close();
	
	}

}
