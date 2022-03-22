/*Author: Rehna Anthru
 *Sub: Write a program to initialize an array of 5 float numbers. Loop through the array using a for loop and print each number.
 *Date: 3/22/2022
 */
public class Solution4 {
	
	public static void main(String[] args) {
		
		//initializing the array
		float[] nums= {2.5f, 4.8f, 9.07f, 12.55f, 55.7f };
		
		//looping through the array
		for(float num : nums) {
			
			System.out.println(num);			
		}
		
	}

}
