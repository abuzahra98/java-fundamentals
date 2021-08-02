package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    String name;
    double rating;
    String price;
    Review review;

    public Restaurant(String name, String price) {
        this.name = name;
        this.rating = 5;
        this.price = price;
    }

    public String toString() {
        System.out.println("===== in the toString method printing... =====");
        System.out.println(String.format("%s has %.2f stars and costs %s.", name, rating, price));
        return String.format("%s has %.2f stars and costs %s.", name, rating, price);
    }

    List<Review> reviewList = new ArrayList<>();

//    @Override
    public String addReview(String body, String author, int stars) {

        this.review=new Review(body,author,stars, establishment);

        this.rating = ((this.rating + stars) / 2);
        reviewList.add(this.review);
        String temp=reviewList.get(0).toString();
       return temp;
    }

//    @Override
    public void printReview(List<Review> reviewList) {
        for(Object element : reviewList){
            System.out.println(review.toString());
        }
    }

}