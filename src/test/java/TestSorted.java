import org.example.Main;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestSorted {


    @Test
    public void test1() {
        String[] original = {"Petya", "Vasya", "Anya", "Masha", "Igor"};
        String[] originalCopy = Arrays.copyOf(original, original.length);
        String[] expected = {"Anya", "Igor", "Masha", "Petya", "Vasya"};
        Assert.assertArrayEquals(expected, Main.sortByBubble(original));
        Assert.assertArrayEquals(originalCopy, original);

    }

    @Test
    public void test2() {
        String[] original = {"Petya", "Vasya", "Anya", "Masha", "Igor"};
        String[] originalCopy = Arrays.copyOf(original, original.length);
        String[] expected = {"Anya", "Igor", "Masha", "Petya", "Vasya"};
        Assert.assertArrayEquals(expected, Main.sortByBubbleWithFlag(original));
        Assert.assertArrayEquals(originalCopy, original);

    }

    @Test
    public void test3() {
        String[] original = {"Petya", "Vasya", "Anya", "Masha", "Igor"};
        String[] originalCopy = Arrays.copyOf(original, original.length);
        String[] expected = {"Anya", "Igor", "Masha", "Petya", "Vasya"};
        Assert.assertArrayEquals(expected, Main.sortByMinElement(original));
        Assert.assertArrayEquals(originalCopy, original);
    }

    @Test
    public void test4() {
        String[] original = {"Petya", "Vasya", "Anya", "Masha", "Igor"};
        String[] originalCopy = Arrays.copyOf(original, original.length);
        String[] expected = {"Anya", "Igor", "Masha", "Petya", "Vasya"};
        Assert.assertArrayEquals(expected, Main.sortByShuttleSort(original));
        Assert.assertArrayEquals(originalCopy, original);

    }

}
