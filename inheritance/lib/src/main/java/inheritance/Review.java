package inheritance;

public class Review {
    protected String movie;
    String body;
    String author;
    int stars;


    public Review(){
        this.body = body;
        this.author = author;
        this.stars = stars;

    }

    public Review(String body, String author, int stars, String movie) {
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.movie = movie;

    }

    public String toString() {
        System.out.println("===== In the toString method for the Review class printing... =====");
        System.out.println(String.format("grinds is ono, 5 stars. From Keawe Malapit Okuno III."));
        return String.format("%s, %s stars. From %s.", body, stars, author);
    }

}