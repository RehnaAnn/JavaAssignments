import java.util.Scanner;
/*
 * Author: Rehna Anthru
 * Sub: Write a program to ask the user to enter a year and tell them if it's a leap year or not
 * Date: 3/22/2022
 * 
*/

public class Solution2 {
	public static void main(String[] args) {

		int userInputYear;
		Scanner input=new Scanner(System.in);

		//prompting the user to enter an year
		System.out.println("Enter a year to find leap year or not");
		userInputYear=input.nextInt();

		//checking the conditions to calculate the leap year	
		if((userInputYear % 4==0 && userInputYear % 100 !=0) || userInputYear % 400 ==0 ) {

			System.out.println(userInputYear+ " is a leap year" );
		}
		else {

			System.out.println(userInputYear+ " is not a leap year" );
		}
	}	
}
