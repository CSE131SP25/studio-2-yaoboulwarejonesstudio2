package studio2;
import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your starting amount");
		int startingAmt = scan.nextInt();
		
		System.out.println("Please enter your win probability");
		double winChance = scan.nextDouble();
		
		System.out.println("Please enter your success amount");
		int winLimit = scan.nextInt();
		
		System.out.println("How many simulations would you like to run?");
		int simulations = scan.nextInt();
		
		int current = startingAmt;
		int plays;
		double win;
		int ruins = 0;
		
		for (int runs = 0; runs < simulations; runs++) {
			plays = 0;
			current = startingAmt;
			while (current > 0 && current < winLimit) {
			
				win = Math.random();
				if (win <= winChance) {
					current++;
				}
				else {
					current--;
				}
				plays++;
				
			}
			System.out.println("Simulation day number: " + (runs+1));
			System.out.println("Plays this day: " + plays);
			if (current == 0) {
				System.out.println("Ruin");
				ruins++;
			}
			if (current == winLimit) {
				System.out.println("Success");
			}
			
		}
		double expected;
		double alpha = (1 - winChance) / winChance;
		if (winChance == 0.5)
			expected = 1 - ((double)(startingAmt)/winLimit);
		else {
			expected = (Math.pow(alpha, startingAmt) - Math.pow(alpha, winLimit)) / (1 - Math.pow(alpha, winLimit));
		}
		
		System.out.println("Actual ruin rate: " + ruins/(double)(simulations) + "\nExpected ruin rate: " + expected);
	}

}
