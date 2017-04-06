/**
 * Javier Velazco
 * Florida International University
 *
 */

import java.util.Scanner;

public class Crypter 
{
	public static void main(String args[])
	{
		System.out.print("Input Message to encrypt or decrypt: ");
		
		// Scanner object to get input
		Scanner scan = new Scanner(System.in);
		
		//Hold input from scanner
		String input = scan.nextLine();
		
		// Measures time taken for the ASCII method of conversion
		long startTimeASCII = System.nanoTime();
		methodASCII(input);
		long endTimeASCII = System.nanoTime();
		
		System.out.println();
		System.out.println("Time taken using ASCII Conversion: " + 
				((endTimeASCII - startTimeASCII) / 1000));
		
		System.out.println();
		
		// Measures time taken for the Switch Statement method of conversion
		long startTimeSwitch = System.nanoTime();
		methodSwitch(input);
		long endTimeSwitch = System.nanoTime();
		
		System.out.println();
		System.out.println("Time taken using Switch Statement Conversion: " + 
		((endTimeSwitch - startTimeSwitch) / 1000));
		
		
	}
	
	
	/**
	 * @param sentence String to be converted
	 */
	public static void methodASCII(String sentence)
	{
		System.out.println("\nMessage to Process: " + sentence + "\nMessage Converted: " );
		
		// Create array to hold the string to be deciphered
		char[] messageToDecipher = sentence.toCharArray(); 
		
		// For loop to cycle through all letter and convert, ignoring everything but lower case
		for (char eachLetter : messageToDecipher)
		{
			if (eachLetter >= 'a' && eachLetter <= 'z')
			{
				eachLetter = (char)('z' - eachLetter + 'a');
				System.out.print(eachLetter);
				
			}
			else
				System.out.print(eachLetter);	
		}
	}
	
	/**
	 * @param sentence String to be converted
	 */
	public static void methodSwitch(String sentence)
	{
		System.out.println("\nMessage to Process: " + sentence + "\nMessage Converted: ");
		
		// Create array to hold the string to be deciphered
		char[] messageToDecipher = sentence.toCharArray(); 
		
		// For loop to cycle through all letter and convert, ignoring everything but lower case
		for (char eachLetter : messageToDecipher)
		{
			switch(eachLetter)
			{	
				case 'a':
					System.out.print("z");
					break;
				case 'b':
					System.out.print("y");
					break;
				case 'c':
					System.out.print("x");
					break;
				case 'd':
					System.out.print("w");
					break;
				case 'e':
					System.out.print("v");
					break;
				case 'f':
					System.out.print("u");
					break;
				case 'g':
					System.out.print("t");
					break;
				case 'h':
					System.out.print("s");
					break;
				case 'i':
					System.out.print("r");
					break;
				case 'j':
					System.out.print("q");
					break;
				case 'k':
					System.out.print("p");
					break;
				case 'l':
					System.out.print("o");
					break;
				case 'm':
					System.out.print("n");
					break;
				case 'n':
					System.out.print("m");
					break;
				case 'o':
					System.out.print("l");
					break;
				case 'p':
					System.out.print("k");
					break;
				case 'q':
					System.out.print("j");
					break;
				case 'r':
					System.out.print("i");
					break;
				case 's':
					System.out.print("h");
					break;
				case 't':
					System.out.print("g");
					break;
				case 'u':
					System.out.print("f");
					break;
				case 'v':
					System.out.print("e");
					break;
				case 'w':
					System.out.print("d");
					break;
				case 'x':
					System.out.print("c");
					break;
				case 'y':
					System.out.print("b");
					break;
				case 'z':
					System.out.print("a");
					break;
				default:
					System.out.print(eachLetter);
					break;
			}
		}
	}
	
		
	
}
