/*
 * Variable Name	DataType	Variable Description
 * User Name		String		The users name
 * firstNumber		Int			First number user wants to calculate
 * secondNumber		Int			Second number user wants to calculate
 * total			Int			Final calculation*/
// comment //
package barnwell.llcs;

import java.util.Scanner;

public class MainClass
{
	static Scanner input = new Scanner(System.in);
	static boolean isProgramRunning = false;
	
	public static void main(String[] args)
	{
		String userName;
		
		int userChoice;
			
		System.out.println("Hello, whats your name?");
		
		userName = input.nextLine();
				
		System.out.println("Hello "+ userName + " What would you like to do (Enter the number by your choice");
		
		isProgramRunning = true;
		
		while(isProgramRunning == true) 
		{
			System.out.println("(1)Add (2)Subtract (3)Multiply (4)Divide (5)Quit");	
			
			userChoice = input.nextInt();
			
		if (userChoice == 5)
		{
			isProgramRunning = false;
		
			calculate (userChoice);
		}
		else 
		{
			calculate(userChoice);
		}
	}
}
	public static void calculate(int userChoice)
	
	{
		int firstNumber;
		int secondNumber;
		int total;
		
		System.out.println("What is your first number");
		firstNumber = input.nextInt();
		System.out.println("What is your second number");
		secondNumber = input.nextInt();
		
		switch (userChoice)
		{
		case 1:
			
			
			total = firstNumber + secondNumber;
			
			System.out.println("Your total is: " + total);
			break;
			
		case 2:
			total = firstNumber - secondNumber;
			
			System.out.println("Your total is: " + total);
			break;
			
		case 3:
			total = firstNumber * secondNumber;
			
			System.out.println("Your total is: " + total);
			break;
			
		case 4:
			total = firstNumber / secondNumber;
			
			System.out.println("Your total is: " + total);
			break;
			
		default: 
			System.out.println("invalid selection");
			break;
			//problem here//
		}
	}
	
	
}



