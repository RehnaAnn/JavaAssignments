import java.util.Scanner;
/*Author: Rehna Anthru
 *Sub:  Write a program to ask the user for a decimal number, and print the floor, ceil, round of that number
 *Date: 3/22/2022
 */
public class Solution5 {
	
	public static void main(String[] args) {
		
		double userInputDecimal;
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Please input a decimal number");	
		userInputDecimal=input.nextDouble();
		
		// return the largest integer value which is less than or equal to the argument and is equal to the mathematical integer of a double value.
		System.out.println("Floor value of the entered decimal number is  : "+Math.floor(userInputDecimal));
		
		//return the smallest integer value that is greater than or equal to the argument or mathematical integer.
		System.out.println("Ceil value of the entered decimal number is : "+Math.ceil(userInputDecimal));
		
		//return the round of the decimal numbers to the nearest value.
		System.out.println("Round value of the entered decimal number is : "+Math.round(userInputDecimal));
				
	}

}
