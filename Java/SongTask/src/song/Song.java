package song;

public class Song {
	String title;
    String artist;
    int releaseYear;
    private double sumOfRating;
    private int ratingQuantity;

    void showInfo() {
        System.out.println("Song title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Release year: " + releaseYear);
    }

    void rate(double rate) {
        sumOfRating += rate;
        ratingQuantity++;
    }

    double getAverage() {
        return sumOfRating / ratingQuantity;
    }
}
