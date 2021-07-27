package basiclibrary;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class  LibraryTest {
    @Test public void rollTest() {
        int num = 5;
        int[] rollArray = Library.roll(num);
        long expected = num;
        long actual = rollArray.length;
        assertEquals(expected, actual);
    }


    @Test public void duplicateTest() {
        int[] nums = {1, 2, 3, 5};
        boolean result = Library.containsDuplicates(nums);
        assertFalse("The test passes if the array has no duplicate", result);
    }
    @Test public void duplicateTest2() {
        int[] numbs = {1, 2, 3, 3, 5};
        boolean result = Library.containsDuplicates(numbs);
        assertTrue("The test passes if the array has duplicate", result);
    }

    @Test public void averageTest() {
        double expected = 2.8;
        int[] nums = {1, 2, 3, 3, 5};
        double actual = Library.calculatedAverage(nums);
        assertEquals(expected,actual,0);
    }

    @Test public void lowestAverageTest() {
        double expected = 57.0;
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        double actual = Library.lowestAverage(weeklyMonthTemperatures);
        assertEquals(expected,actual,0);
    }
    @Test public void analyzeWeatherDataTest() {
//
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        String expected= ("High: 72" +
                "\nLow: 51" +
                "\nNever saw temperature: 63" +
                "\nNever saw temperature: 67" +
                "\nNever saw temperature: 68" +
                "\nNever saw temperature: 69\n");
        String actual = Library.analyzeWeatherData(weeklyMonthTemperatures);
        assertEquals(expected, actual);
    }
    @Test public void tallyElectionTest(){
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String actual = Library.tallyElection(votes);
        assertEquals("Bush received the most votes!", actual);
    }

}