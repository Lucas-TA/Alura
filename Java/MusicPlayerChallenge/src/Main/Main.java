package Main;

import br.com.alura.musicplayerchallenge.models.Podcast;
import br.com.alura.musicplayerchallenge.models.Song;

public class Main {

	public static void main(String[] args) {
		Song song = new Song();
		song.setTitle("Forever");
		song.setArtist("Kiss");
		song.setAlbum("Pra sempre");
		song.setGenre("Rock");
		
		for (int i = 0; i < 1000; i++) {
			song.play();
		}
		for (int i = 0; i < 50; i++) {
			song.like();
		}
		
		Podcast podcast = new Podcast();
		podcast.setTitle("Alura podcast");
		
		for (int i = 0; i < 500; i++) {
			podcast.play();
		}
		for (int i = 0; i < 25; i++) {
			podcast.like();
		}
		
		System.out.println("Song: " + song.getClassification());
		System.out.println("Podcast: " + podcast.getClassification());
	}

}
