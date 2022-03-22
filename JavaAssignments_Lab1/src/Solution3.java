/*
 * Author: Rehna Anthru
 * Date: 3/22/2022
 * Sub: Write a program that declares and initializes a counter to 0. Run a forever while loop, increment counter by 1 with every iteration. 
 * break the loop when counter is 5. 
 * continue the loop without printing the number when counter is 3. 
 * Print the counter for all other values.
 * 
 */

public class Solution3 {
	
	public static void main(String[] args) {
		//initializing the counter to zero
		int counter=0;
		
		while (true) {
			counter++;
			if(counter==5) {
				break;//breaking the loop when the counter is 5
			}
			if(counter ==3) {
				continue;
			}
			else {
				System.out.println(counter); //printing the counter for all the other values
			}
		}
		
	}

}
