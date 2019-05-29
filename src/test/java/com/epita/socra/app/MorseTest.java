package com.epita.socra.app;
import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class MorseTest {
    @Test
    public void givenZero_ThenReturnFiveUnderscores() {
        MorseRepresentation zero = new MorseRepresentation(0);
        assertEquals("_ _ _ _ _ ", zero.toString());
    }

    @Test
    public void givenOne_ThenReturnOneDotAndFourUnderscores() {
        MorseRepresentation one = new MorseRepresentation(1);
        assertEquals(". _ _ _ _ ", one.toString());
    }

    @Test
    public void givenTwo_ThenReturnTwoDotsAndThreeUnderscores() {
        MorseRepresentation two = new MorseRepresentation(2);
        assertEquals(". . _ _ _ ", two.toString());
    }

    @Test
    public void givenThree_ThenReturnThreeDotsAndTwoUnderscores() {
        MorseRepresentation three = new MorseRepresentation(3);
        assertEquals(". . . _ _ ", three.toString());
    }

    @Test
    public void givenFour_ThenReturnFourDotsAndOneUnderscore() {
        MorseRepresentation four = new MorseRepresentation(4);
        assertEquals(". . . . _ ", four.toString());
    }

    @Test
    public void givenFive_ThenReturnFiveDots() {
        MorseRepresentation five = new MorseRepresentation(5);
        assertEquals(". . . . . ", five.toString());
    }

    @Test
    public void givenSix_ThenReturnOneUnderscoreAndFourDots() {
        MorseRepresentation six = new MorseRepresentation(6);
        assertEquals("_ . . . . ", six.toString());
    }

    @Test
    public void givenSeven_ThenReturnTwoUnderscoresAndThreeDots() {
        MorseRepresentation seven = new MorseRepresentation(7);
        assertEquals("_ _ . . . ", seven.toString());
    }

    @Test
    public void givenEight_ThenReturnThreeUnderscoresAndTwoDots() {
        MorseRepresentation eight = new MorseRepresentation(8);
        assertEquals("_ _ _ . . ", eight.toString());
    }

    @Test
    public void givenTen_ThenReturnOneDotAndNineUnderscores() {
        MorseRepresentation ten = new MorseRepresentation(10);
        assertEquals(". _ _ _ _ _ _ _ _ _ ", ten.toString());
    }

    @Test
    public void givenFortyTwo_ThenReturnFourDotsAndOneUnderscoreAndTwoDotsAndThreeUnderscores() {
        MorseRepresentation fortyTwo = new MorseRepresentation(42);
        assertEquals(". . . . _ . . _ _ _ ", fortyTwo.toString());
    }

    @Test
    public void givenEightyThree_ThenReturnThreeUnderscoresAndFiveDotsAndTwoUnderscores() {
        MorseRepresentation eightyThree = new MorseRepresentation(83);
        assertEquals("_ _ _ . . . . . _ _ ", eightyThree.toString());
    }

    @Test
    public void givenNineHundredNinetyNine_ThenReturnFourUnderscoresAndOneDotAndFourUnderscoresAndOneDotAndFourUnderscoresAndOneDot() {
        MorseRepresentation nineHundredNinetyNine = new MorseRepresentation(999);
        assertEquals("_ _ _ _ . _ _ _ _ . _ _ _ _ . ", nineHundredNinetyNine.toString());
    }

    @Test
    public void givenOneThousandNineHundredAndThree_ThenReturnOneDotAndEightUnderscoresAndOneDotAndFiveUnderscoresAndThreeDotsAndTwoUnderscores() {
        MorseRepresentation oneThousandNineHundredAndThree = new MorseRepresentation(1903);
        assertEquals(". _ _ _ _ _ _ _ _ . _ _ _ _ _ . . . _ _ ", oneThousandNineHundredAndThree.toString());
    }

    @Test
    public void givenFiveUnderscores_ThenReturnZero() {
        MorseRepresentation zero = new MorseRepresentation("_ _ _ _ _ ");
        assertEquals("0", zero.toString());
    }
    @Test
    public void givenOneDotAndFourUnderscores_ThenReturnOne() {
        MorseRepresentation one = new MorseRepresentation(". _ _ _ _ ");
        assertEquals("1", one.toString());
    }

    @Test
    public void givenTwoDotsAndThreeUnderscores_ThenReturnTwo() {
        MorseRepresentation two = new MorseRepresentation(". . _ _ _ ");
        assertEquals("2", two.toString());
    }
}
