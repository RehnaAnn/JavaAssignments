
/*
 * Author: Rehna Anthru
 * Sub: Write a program to reverse the order of words in a sentence
 * Date: 3/22/2022
 * 
*/
public class Solution1 {

	public static void main(String[] args) {
		//splitting the sentence by using split
		String[] sentence =  "The first program everyone writes is Hello World".split(" ");

		String rev = "";
		//iterating backwards 
		for(int i = sentence.length - 1; i >= 0 ; i--)
		{
		   rev += sentence[i] + " ";
		}
		//printing the string in reverse
		System.out.println(rev);
	}
}