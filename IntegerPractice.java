/* Author: Andrew Gurry
* Date: 2020/12/23
* Editor: Notepad (No IDE)
* Purpose: Practice with the Integer class
*/

import java.util.Scanner;
import java.lang.Object;

public class IntegerPractice{
	
	//Runs the program and minimizes code in main
	public static void runIntProgram(){
		System.out.println("\n\nWelcome! This is a breakdown of the Integer Class with sample code. \n");
		
		//Integer.MAX_VALUE,MIN_VALUE,BYTES SIZE
		showFields();

		//nextInt()
		int yourInt = getInt();
		
		//.Integer.toBinaryString(int)
		getBinaryString(yourInt);
		
		//Integer.bitCount(yourInt)
		getOneBitCount(yourInt);
		
		//.byteValue()
		getByteValue(yourInt);
	}
	
	//Shows the binary code of the int
	private static void getBinaryString(int inputInt){
		System.out.println("Integer.toBinaryString(inputInt) shows the binary code of our Integer.");
		System.out.println("Binary Code: " + Integer.toBinaryString(inputInt));
	}	


	//Shows the constant fields in the Integer class
	private static void showFields(){
		System.out.println("Let's start with Constants or Fields");
		System.out.println("MAX_VALUE: A constant holding the maximum value an int can have, 2^31-1: " + Integer.MAX_VALUE);
		System.out.println("MIN_VALUE: A constant holding the minimum value an int can have, -2^31: " + Integer.MIN_VALUE);
		System.out.println("BYTES: The number of bytes (1 byte == 8 bits) used to represent an int value in two's complement binary form: " + Integer.BYTES);
		System.out.println("SIZE: The number of bits (1 byte == 8 bits) used to represent an int value in two's complement binary form: " + Integer.SIZE + "\n");
	}

	//byteValue() returns the value of this Integer as a byte after a narrowing primitive conversion
	private static void getByteValue(int inputInt){
		Integer oldWay = new Integer(inputInt);
		System.out.println("byteValue() returns the value of this Integer as a byte after a narrowing primitive conversion: " + oldWay.byteValue());
	}

	//this is to get the Integer we want to learn about.
	private static int getInt(){
		Scanner intIn = new Scanner(System.in);		
		System.out.print("Let's use some methods. Enter An Integer: ");
		int myInt;
		try{
			myInt = intIn.nextInt();
			return myInt;
		}
		catch (Exception e)
		{
			System.out.println("Invalid input... Let's use 10 instead.");
			myInt = 10;
			return myInt;
		}
	}

	//Integer.bitCount(yourInt) returns the number of one-bits in the two's complement binary representation of the specified int value.
	private static void getOneBitCount(int yourInt){
		System.out.println("Integer.bitCount(yourInt) returns the number of one-bits in the two's complement binary representation of yourInt.");
		System.out.print("The total number of one-bits in the Integer " + yourInt + " is: ");
		System.out.println(Integer.bitCount(yourInt)); 
	}

	


}




