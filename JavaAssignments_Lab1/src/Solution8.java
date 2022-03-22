import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

/*
 * Author: Rehna Anthru 
 * Date: 3/22/2022
 * Sub: Write a program that counts the occurances of each word in a text file (the_prince_quotes.txt in the same repository). 
 * Make it case-insensitive by coverting each word to lower case before counting
 * Note: Needed help from google 
*/
public class Solution8 {

	public static void main(String[] args) {

		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();			
		FileReader fileReader;
		//reading the file using filereader and BufferedReader
		try {
			fileReader = new FileReader("C:\\Users\\RehnaAnthru\\OneDrive - Xpanxion\\Documents\\Java Assignments\\the_prince_quotes.txt");
			BufferedReader bufferReader = new BufferedReader(fileReader);				
			String line;
			
			// iterating over the line in backwards
			while ((line=bufferReader.readLine()) !=null) {
				String[] words =  line.split(" ");

				for (int i=0; i<=words.length-1; i++) {
					String word=words[i].toLowerCase();
					if(wordCount.containsKey(word)){

						wordCount.put(word, wordCount.get(word) + 1);

					}
					else {
						wordCount.put(word, 1);
					}
				}
			}			
			bufferReader.close();
			fileReader.close();
		} catch (Exception e) {

			e.printStackTrace();
		}
		//printing out the word count 
		System.out.println(wordCount);
	}

}
