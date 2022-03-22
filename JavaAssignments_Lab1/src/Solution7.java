import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/*Author: Rehna Anthru
 * Date: 3/22/2022
 * Sub: Write a program that asks user for 2 integers and print the divison of the 2 integers. 
 * Handle ArithmeticException and print its stacktrace.
 *  Handle all other RuntimeException and print its message. 
 * Irrespective of whether an exception ocurred or not, print a "Thank you" message.
 */
public class Solution7 {

	public static void main(String[] args) throws IOException {

		try {		
			Scanner userInput=new Scanner(System.in);
			
			//prompting the user to enter the first integer
			System.out.println("Enter first integer : ");
			int a =userInput.nextInt();
			
			//prompting the user to enter the second integer
			System.out.println("Enter second integer : ");
			int b =userInput.nextInt();
			
			//printing the division result 
			int div=(a/b);
			System.out.println("Division of two integers entered is: " + div);
		}
		//catching an arithmetic exception
		catch(ArithmeticException e) {

			System.out.println(e.getMessage());
		}
		//catching an input mismatch exception
		catch(InputMismatchException e) {
			System.out.println(e.getMessage());
		}
		//catching a null pointer exception at runtime 
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}		
		finally {
			System.out.println("Thank you");
		}

	}
}