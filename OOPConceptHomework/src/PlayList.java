import java.util.ArrayList;

/*
name
ArrayList of Songs called playList
Methods:
Print all songs in the playlist
Find song by name : findSong(String song) returns true if the song name is present in the playList HINT: .getName().equals()
*/


public class PlayList {

	public String name;

	public ArrayList<Song> playList = new ArrayList<Song>();

	void printPlayList() {

		for(Song song : playList) {			    
			System.out.println(song.getTitle());
		}

	}


	boolean findSong(String songName) {

		for(Song song : playList) {	

			if(song.getTitle().equals(songName)) {
				return true;
			}
		}
		return false;
	}
}