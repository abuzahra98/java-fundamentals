package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop  {

    String name;
    String description;
    String price;
    int rating;
    List<Review> reviewList = new ArrayList<>();


    public Shop(String name, String description, String price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.rating = 5;
    }

    public String toString(){
        return String.format("This is the Shop: Name: %s, description: %s, Price: %s", name, description, price);
    }


    public int addReview(String body, String author, int stars) {
        Review review = new Review();
        review.body = body;
        review.author = author;
        review.stars = stars;
        int numStars = 0;
        int counter = 0;
        this.reviewList.add(review);
        for(Review review1 : reviewList){
            numStars += review1.stars;
            counter++;
        }
        this.rating = numStars/counter;
        return this.rating;


    }
}
