/* Author: Andrew Gurry
* Date: 2020/12/23
* Editor: Notepad (No IDE)
* Purpose: Breakdown and provide examples of Java's API
*/

import java.util.Scanner;

public class JavaTutorial{
	public static void main(String[] args){
		Scanner learnAbout = new Scanner(System.in);
		int choice = 1;

		while (choice != 0)
		{
			displayMenu();

			choice = getAnInt(learnAbout);

			switch(choice){
				case 0: 
					choice = 0;
					break;
				case 1:
					IntegerPractice.runIntProgram();
					break;
				default:
					System.out.println("Invalid selection. Please try again.");

			}
		}	
	}

	public static void displayMenu(){
		System.out.println("\nWelcome to my java tutorial!");
		System.out.println("0. Exit");
		System.out.println("1. Integer Class");
		System.out.print("Please select a number: ");
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
			 

		