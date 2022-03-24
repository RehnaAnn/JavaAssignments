/*
 * Create an object of PlayList, give it a name and an empty arraylist to begin with
Create some Song objects and add it to object's playList
Print all the songs in the playlist
Find a song in the playlist
Write the playlist object to an object file.
 * 
 */
public class SongMain {
	public static void main(String[] args) {
		
		
		PlayList songList= new PlayList();
		
		songList.playList.add(new Song("Title1", 3));
		songList.playList.add(new Song("Title2", 4));
		songList.playList.add(new Song("Title3", 5));
		
		songList.printPlayList();
		
		boolean isFound = songList.findSong("Title2");
		
		if(isFound) {
		System.out.println("Song Title2 was found");
		}		
		else {
			System.out.println("Song Title2 was not found");
		}
	}

}
