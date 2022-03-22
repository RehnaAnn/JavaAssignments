import java.util.ArrayList;
import java.util.Scanner;

/*Author: Rehna Anthru
 * Date: 3/22/2022
 * Sub: Write a program to ask the user for states they have visited in the US. 
 * Ignore case by converting their input to lower case. Ignore duplicate inputs. Order of input doesn't matter. 
 * The program runs forever until the user types "done".
 * When the user types "done", display the unique list of states back to the user.
 */
public class Solution6 {

	public static void main(String[] args) {
		//initializing an Array List
		ArrayList<String> statesVisited=new ArrayList<String>();

		String inputState;		
		Scanner input= new Scanner(System.in);

		//prompting the users to enter the states visited in US
		System.out.println("Enter the states that you have visited in the US, enter done to exit");	

		//running a forever loop until the user types done
		do {
			inputState= input.nextLine().toLowerCase();
			if(inputState.equals("done")) {
				break;
			}
			else {
				if(!statesVisited.contains(inputState)) {				
					statesVisited.add(inputState);
				}
			}

		} while(true);

		//displaying the states visited when the user enters done
		System.out.println(statesVisited);

	}

}
