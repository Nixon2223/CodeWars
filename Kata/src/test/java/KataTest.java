import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class KataTest {

    @Test
    public void canSortTheOdd() {
        int[] numArray1 = {2, 4, 6, 3, 4};
        int[] numArray2 = {1, 4, 6, 3, 11};
        int[] numArray3 = {2, 4, 6, 3, 7, 5, 77};

        assertArrayEquals(new int[]{2, 4, 6, 3, 4}, Kata.sortTheOdd(numArray1));
        assertArrayEquals(new int[]{1, 4, 6, 3, 11}, Kata.sortTheOdd(numArray2));
        assertArrayEquals(new int[]{2, 4, 6, 3, 5, 7, 77}, Kata.sortTheOdd(numArray3));
    }

    @Test
    public void isIsogram() {
        String string1 = "Dermatoglyphics";
        String string2 = "aba";
        String string3 = "moOse";

        assertTrue(Kata.isIsogram(string1));
        assertFalse(Kata.isIsogram(string2));
        assertFalse(Kata.isIsogram(string3));
    }

    @Test
    public void reverseWords() {
        String string1 = "This is an example!";
        String string2 = "double  spaces";

        assertEquals("sihT si na !elpmaxe", Kata.reverseWords(string1));
        assertEquals("elbuod  secaps", Kata.reverseWords(string2));
    }

    @Test
    public void GetSumTest1()
    {
        assertEquals(-1, Kata.GetSum(0, -1));
        assertEquals(1, Kata.GetSum(0, 1));
    }

    @Test
    public void findNbTest1() {
        assertEquals(2022, Kata.findNb(4183059834009L));
    }
    @Test
    public void findNbTest2() {
        assertEquals(-1, Kata.findNb(24723578342962L));
    }
    @Test
    public void findNbTest3() {
        assertEquals(4824, Kata.findNb(135440716410000L));
    }
    @Test
    public void findNbTest4() {
        assertEquals(3568, Kata.findNb(40539911473216L));
    }

    @Test
    public void persistenceTests() {
        assertEquals(3, Kata.persistence(39));
        assertEquals(0, Kata.persistence(4));
        assertEquals(2, Kata.persistence(25));
        assertEquals(4, Kata.persistence(999));
    }

}



