import org.example.Main;
import org.junit.Assert;
import org.junit.Test;

public class TestSorted {


    @Test
    public void test1() {
        String[] expected = {"Petya", "Vasya", "Anya", "Masha", "Igor"};
        String [] actual ={"Anya","Igor","Masha","Petya","Vasya"};
        Assert.assertArrayEquals(actual, Main.sortByBubble(expected));

    }
    @Test
    public void test2() {
        String[] expected = {"Petya", "Vasya", "Anya", "Masha", "Igor"};
        String [] actual ={"Anya","Igor","Masha","Petya","Vasya"};
        Assert.assertArrayEquals(actual, Main.sortByBubbleWithFlag(expected));

    }
    @Test
    public void test3() {
        String[] expected = {"Petya", "Vasya", "Anya", "Masha", "Igor"};
        String[] actual = {"Anya", "Igor", "Masha", "Petya", "Vasya"};
        Assert.assertArrayEquals(actual, Main.sortByMinElement(expected));
    }
    @Test
    public void test4() {
        String[] expected = {"Petya", "Vasya", "Anya", "Masha", "Igor"};
        String [] actual ={"Anya","Igor","Masha","Petya","Vasya"};
        Assert.assertArrayEquals(actual, Main.sortByShuttleSort(expected));

    }

}
