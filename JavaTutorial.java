/* Author: Andrew Gurry
* Date: 2020/12/23
* Editor: Notepad (No IDE)
* Purpose: Breakdown and provide examples of Java's API
*/

import java.util.Scanner;

public class JavaTutorial{
	public static void main(String[] args){
		Scanner learnAbout = new Scanner(System.in);
		boolean continueLearning = true;

		while (continueLearning)
		{
			continueLearning = runProgram(learnAbout);
		}	
	}


	public static boolean runProgram(Scanner learnAbout){
		System.out.println("\nWelcome to my java tutorial!");
		System.out.println("0. Exit");
		System.out.println("1. Integer Class");
		System.out.print("Please select a number: ");

		int choice = getAnInt(learnAbout);

		switch(choice){
			case 0: 
				return false;
			case 1:
				IntegerPractice.runIntProgram();
				break;
			default:
				System.out.println("Invalid selection. Please try again.");
			}
		return true;
	}


	public static int getAnInt(Scanner myChoice){
	
		int choice;
		try{
			choice = myChoice.nextInt();
			return choice;
		}
		catch (Exception e)
		{
			myChoice.next();
			return 100000;
		}
	}
}
			 

		