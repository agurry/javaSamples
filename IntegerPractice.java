/* Author: Andrew Gurry
* Date: 2020/12/05
* Editor: Notepad (No IDE)
* Purpose: Practice with the Integer class
*/

import java.util.Scanner;

public class IntegerPractice{

	public static void main (String[] args){
		System.out.println("\n\nWelcome! This is a breakdown of the Integer Class with sample code. \n");
		showFields();

		Scanner intIn = new Scanner(System.in);		
		System.out.print("Let's use some methods. Enter An Integer: ");
		int yourInt = intIn.nextInt();
		
		myOneBitCount(yourInt);
		
		Integer oldWay = new Integer(yourInt);
			System.out.println("byteValue() returns the value of this Integer as a byte after a narrowing primitive conversion: " + oldWay.byteValue());	
	}
	
	//Shows the constant fields in the Integer class
	static void showFields(){
		System.out.println("Let's start with Constants or Fields");
		System.out.println("MAX_VALUE: A constant holding the maximum value an int can have, 2^31-1: " + Integer.MAX_VALUE);
		System.out.println("MIN_VALUE: A constant holding the minimum value an int can have, -2^31: " + Integer.MIN_VALUE);
		System.out.println("BYTES: The number of bytes (1 byte == 8 bits) used to represent an int value in two's complement binary form: " + Integer.BYTES);
		System.out.println("SIZE: The number of bits (1 byte == 8 bits) used to represent an int value in two's complement binary form: " + Integer.SIZE + "\n");
		
	}

	//Integer.bitCount(yourInt) returns the number of one-bits in the two's complement binary representation of the specified int value.
	static void myOneBitCount(int yourInt){
		System.out.println("Integer.bitCount(yourInt) returns the number of one-bits in the two's complement binary representation of yourInt.");
		System.out.print("The total number of one-bits in the Integer " + yourInt + " is: ");
		System.out.println(Integer.bitCount(yourInt)); 
	}

	


}




