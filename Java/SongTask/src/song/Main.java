package song;

public class Main {

	public static void main(String[] args) {
		Song newSong = new Song();

        newSong.title = "Nome da Música";
        newSong.artist = "Nome do Artista";
        newSong.releaseYear = 2023;

        newSong.showInfo();

        newSong.rate(4.5);
        newSong.rate(3.8);
        newSong.rate(5.0);

        double ratingAverage = newSong.getAverage();
        System.out.println("Média das avaliações: " + ratingAverage);
    }
}
