/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();

        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }

    @Test
    public void TestRestaurant() {
        Restaurant test = new Restaurant("dodo","6");

        System.out.println(test.toString());
        String expected = "dodo has 5.00 stars and costs 6.";
        String actual = test.toString();
        assertEquals(expected, actual);

    }
    @Test
    public void TestReview() {
        Review test = new Review("big place","dado",2, establishment);

        System.out.println(test.toString());
        String expected = "big place, 2 stars. From dado.";
        String actual = test.toString();
        assertEquals(expected, actual);

    }

    @Test
    public void TestAdding() {
        Restaurant test = new Restaurant("dodo","5");


        String expected = test.addReview("gg","ff",5);
        String actual ="gg, 5 stars. From ff.";
        assertEquals(expected, actual);

    }
}
