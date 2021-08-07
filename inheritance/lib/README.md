
# Lab 06 Inheritance

This lab was geared toward creating multiple classes, relating
to each other, and creating Interfaces of the classes in order to
implement certain features of one class to another.
In this lab, I created a Restaurant Class and a review class,
and then an addReview Interface that is called in the
Restaurant Class as an inheritance.

# Lab 07 Inheritance
This lab was about adding some additional classes to the repo. A Shop class, and a Theater
class. The Theater should also contain a list of movies that are playing at the
theater. The reviews are added to each of those classes as well as an ability to
add and remove movies from the list of movies at each theater.

## How to test the code
Tests are built in to the package and can be located here:
[tests](../inheritance/lib/src/test/java/inheritance)

in the command line run
``./gradlew test``



## Inheritance

**Feature Tasks**

- Create a class to represent a Restaurant. Each Restaurant should have a name, a number of stars betweeen 0 and 5, and a price category.

- Create a class to represent a Review. Each Review should have a body, an author, and a number of stars.

- A Review should be about a single Restaurant. implement it.

- Add an instance method addReview to your Restaurant class. This method should take in a Review instance, and associate that review with this Restaurant.

- Add tests to ensure that when you call addReview, the association is created between the Restaurant and the Review.

- When associate a review with a restaurant, that restaurant’s star rating should change. addReview method updates the Restaurant star rating appropriately.

- if you’re trying to call addReview when the restaurant and the review are already associated, the star rating of the restaurant does not update.

- Create a class to represent a Restaurant. Each Restaurant should have a name, a number of stars betweeen 0 and 5, and a price category (i.e. number of dollar signs).

- Create a class to represent a Review. Each Review should have a body, an author, and a number of stars.

- A Review should be about a single Restaurant. Choose an implementation for this, and implement it. Some considerations:

- Add an instance method addReview to your Restaurant class. This method should take in a Review instance, and associate that review with this Restaurant. The specific methodology for this will vary, depending on the implementation you chose above.

- When you associate a review with a restaurant, that restaurant’s star rating should change. Ensure that your addReview method updates the Restaurant star rating appropriately, and add tests. (In particular, ensure that if you’re trying to call addReview when the restaurant and the review are already associated, the star rating of the restaurant does not update.)

- The users want shops! Create a Shop class; a Shop should have a name, description, and number of dollar signs.

- The users also want to review shops!

- The users want theaters! Create a Theater class; a Theater should have a name and all of the movies currently showing there. (Strings are fine for the movies; no need to create another class.)

- Review all the things!

- Users are frustrated: they like having a body, an author, and a number of stars, but when they’re reviewing a Theater, they also want to specify which movie they saw.


