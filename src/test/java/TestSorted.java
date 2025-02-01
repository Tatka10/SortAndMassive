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

    @Test
    public void test5() {
        String[] original = {"Petya", "Vasya", "Anya", "Masha", "Igor"};
        String[] originalCopy = Arrays.copyOf(original, original.length);
        String[] expected = {"Anya", "Igor", "Masha", "Petya", "Vasya"};
        Assert.assertArrayEquals(expected, Main.sortMerge(original));
        Assert.assertArrayEquals(originalCopy, original);
    }

    //пустые
    @Test
    public void test6() {
        String[] original = {};
        String[] originalCopy = Arrays.copyOf(original, original.length);
        String[] expected = {};
        Assert.assertArrayEquals(expected, Main.sortByBubble(original));
        Assert.assertArrayEquals(originalCopy, original);

    }

    @Test
    public void test7() {
        String[] original = {};
        String[] originalCopy = Arrays.copyOf(original, original.length);
        String[] expected = {};
        Assert.assertArrayEquals(expected, Main.sortByBubbleWithFlag(original));
        Assert.assertArrayEquals(originalCopy, original);

    }

    @Test
    public void test8() {
        String[] original = {};
        String[] originalCopy = Arrays.copyOf(original, original.length);
        String[] expected = {};
        Assert.assertArrayEquals(expected, Main.sortByMinElement(original));
        Assert.assertArrayEquals(originalCopy, original);
    }

    @Test
    public void test9() {
        String[] original = {};
        String[] originalCopy = Arrays.copyOf(original, original.length);
        String[] expected = {};
        Assert.assertArrayEquals(expected, Main.sortByShuttleSort(original));
        Assert.assertArrayEquals(originalCopy, original);
    }

    @Test
    public void test10() {
        String[] original = {};
        String[] originalCopy = Arrays.copyOf(original, original.length);
        String[] expected = {};
        Assert.assertArrayEquals(expected, Main.sortMerge(original));
        Assert.assertArrayEquals(originalCopy, original);
    }

    //отсортированные
    @Test
    public void test11() {
        String[] original = {"Anya", "Igor", "Masha", "Petya", "Vasya"};
        String[] originalCopy = Arrays.copyOf(original, original.length);
        String[] expected = {"Anya", "Igor", "Masha", "Petya", "Vasya"};
        Assert.assertArrayEquals(expected, Main.sortByBubble(original));
        Assert.assertArrayEquals(originalCopy, original);

    }

    @Test
    public void test12() {
        String[] original = {"Anya", "Igor", "Masha", "Petya", "Vasya"};
        String[] originalCopy = Arrays.copyOf(original, original.length);
        String[] expected = {"Anya", "Igor", "Masha", "Petya", "Vasya"};
        Assert.assertArrayEquals(expected, Main.sortByBubbleWithFlag(original));
        Assert.assertArrayEquals(originalCopy, original);

    }

    @Test
    public void test13() {
        String[] original = {"Anya", "Igor", "Masha", "Petya", "Vasya"};
        String[] originalCopy = Arrays.copyOf(original, original.length);
        String[] expected = {"Anya", "Igor", "Masha", "Petya", "Vasya"};
        Assert.assertArrayEquals(expected, Main.sortByMinElement(original));
        Assert.assertArrayEquals(originalCopy, original);
    }

    @Test
    public void test14() {
        String[] original = {"Anya", "Igor", "Masha", "Petya", "Vasya"};
        String[] originalCopy = Arrays.copyOf(original, original.length);
        String[] expected = {"Anya", "Igor", "Masha", "Petya", "Vasya"};
        Assert.assertArrayEquals(expected, Main.sortByShuttleSort(original));
        Assert.assertArrayEquals(originalCopy, original);
    }

    @Test
    public void test15() {
        String[] original = {"Anya", "Igor", "Masha", "Petya", "Vasya"};
        String[] originalCopy = Arrays.copyOf(original, original.length);
        String[] expected = {"Anya", "Igor", "Masha", "Petya", "Vasya"};
        Assert.assertArrayEquals(expected, Main.sortMerge(original));
        Assert.assertArrayEquals(originalCopy, original);
    }

    //обратная сортировка
    @Test
    public void test16() {
        String[] original = {"Vasya", "Petya", "Masha", "Igor", "Anya"};
        String[] originalCopy = Arrays.copyOf(original, original.length);
        String[] expected = {"Anya", "Igor", "Masha", "Petya", "Vasya"};
        Assert.assertArrayEquals(expected, Main.sortByBubble(original));
        Assert.assertArrayEquals(originalCopy, original);
    }

    @Test
    public void test17() {
        String[] original = {"Vasya", "Petya", "Masha", "Igor", "Anya"};
        String[] originalCopy = Arrays.copyOf(original, original.length);
        String[] expected = {"Anya", "Igor", "Masha", "Petya", "Vasya"};
        Assert.assertArrayEquals(expected, Main.sortByBubbleWithFlag(original));
        Assert.assertArrayEquals(originalCopy, original);
    }

    @Test
    public void test18() {
        String[] original = {"Vasya", "Petya", "Masha", "Igor", "Anya"};
        String[] originalCopy = Arrays.copyOf(original, original.length);
        String[] expected = {"Anya", "Igor", "Masha", "Petya", "Vasya"};
        Assert.assertArrayEquals(expected, Main.sortByMinElement(original));
        Assert.assertArrayEquals(originalCopy, original);
    }

    @Test
    public void test19() {
        String[] original = {"Vasya", "Petya", "Masha", "Igor", "Anya"};
        String[] originalCopy = Arrays.copyOf(original, original.length);
        String[] expected = {"Anya", "Igor", "Masha", "Petya", "Vasya"};
        Assert.assertArrayEquals(expected, Main.sortByShuttleSort(original));
        Assert.assertArrayEquals(originalCopy, original);
    }

    @Test
    public void test20() {
        String[] original = {"Vasya", "Petya", "Masha", "Igor", "Anya"};
        String[] originalCopy = Arrays.copyOf(original, original.length);
        String[] expected = {"Anya", "Igor", "Masha", "Petya", "Vasya"};
        Assert.assertArrayEquals(expected, Main.sortMerge(original));
        Assert.assertArrayEquals(originalCopy, original);
    }

    @Test
    public void test21() {
        String[] original = {"Petya", "Vasya", "Anya", "Masha", "Igor"};
        String[] originalCopy = Arrays.copyOf(original, original.length);
        String[] expected = {"Anya", "Igor", "Masha", "Petya", "Vasya"};
        System.out.println(Arrays.toString(Main.quickSort(originalCopy, 0, originalCopy.length - 1)));
        Assert.assertArrayEquals(expected, Main.quickSort(originalCopy, 0, originalCopy.length - 1));
        Assert.assertArrayEquals(originalCopy, original);
    }

    @Test
    public void test22() {
        String[] original = {};
        String[] originalCopy = Arrays.copyOf(original, original.length);
        String[] expected = {};
        System.out.println(Arrays.toString(Main.quickSort(originalCopy, 0, originalCopy.length - 1)));
        Assert.assertArrayEquals(expected, Main.quickSort(original, 0, original.length - 1));
        Assert.assertArrayEquals(originalCopy, original);
    }

    @Test
    public void test23() {
        String[] original = {"Vasya", "Petya", "Masha", "Igor", "Anya"};
        String[] originalCopy = Arrays.copyOf(original, original.length);
        String[] expected = {"Anya", "Igor", "Masha", "Petya", "Vasya"};
        System.out.println(Arrays.toString(Main.quickSort(originalCopy, 0, originalCopy.length - 1)));
        Assert.assertArrayEquals(expected, Main.quickSort(original, 0, original.length - 1));
        Assert.assertArrayEquals(originalCopy, original);
    }
    @Test
    public void test24() {
        String[] original = {"Anya", "Igor", "Masha", "Petya", "Vasya"};
        String[] originalCopy = Arrays.copyOf(original, original.length);
        String[] expected = {"Anya", "Igor", "Masha", "Petya", "Vasya"};
        System.out.println(Arrays.toString(Main.quickSort(originalCopy, 0, originalCopy.length - 1)));
        Assert.assertArrayEquals(expected, Main.quickSort(original, 0, original.length - 1));
        Assert.assertArrayEquals(originalCopy, original);
    }

}
