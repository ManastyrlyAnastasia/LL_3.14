package LinkedListTests;
import LinkedList.LinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

public class LinkedListTest {

    @Test
    public void testInsertAndTraverse() {
        LinkedList list = new LinkedList();
        Competitor c1 = new Competitor("Doe", "John", "USA", 1, 1990, "Men's Singles");
        Competitor c2 = new Competitor("Smith", "Jane", "USA", 2, 1995, "Women's Singles");
        list.insert(c1);
        list.insert(c2);
        String expected = "Competitors: \n" +
                "Doe,John,USA,1,1990,Men's Singles\n" +
                "Smith,Jane,USA,2,1995,Women's Singles\n";
        String actual = captureOutput(() -> list.traverse());
        assertEquals(expected, actual);
    }

    @Test
    public void testSearch() {
        LinkedList list = new LinkedList();
        Competitor c1 = new Competitor("Doe", "John", "USA", 1, 1990, "Men's Singles");
        Competitor c2 = new Competitor("Smith", "Jane", "USA", 2, 1995, "Women's Singles");
        Competitor c3 = new Competitor("Lee", "Jae-Sung", "South Korea", 3, 1985, "Men's Singles");
        list.insert(c1);
        list.insert(c2);
        list.insert(c3);
        String expected = "Competitor found: Lee,Jae-Sung,South Korea,3,1985,Men's Singles\n";
        String actual = captureOutput(() -> list.search("Lee"));
        assertEquals(expected, actual);
    }

    @Test
    public void testDelete() {
        LinkedList list = new LinkedList();
        Competitor c1 = new Competitor("Doe", "John", "USA", 1, 1990, "Men's Singles");
        Competitor c2 = new Competitor("Smith", "Jane", "USA", 2, 1995, "Women's Singles");
        Competitor c3 = new Competitor("Lee", "Jae-Sung", "South Korea", 3, 1985, "Men's Singles");
        list.insert(c1);
        list.insert(c2);
        list.insert(c3);
        String expected = "Competitor deleted: Smith,Jane,USA,2,1995,Women's Singles\n";
        String actual = captureOutput(() -> list.delete("Smith"));
        assertEquals(expected, actual);
        expected = "Competitors: \n" +
                "Doe,John,USA,1,1990,Men's Singles\n" +
                "Lee,Jae-Sung,South Korea,3,1985,Men's Singles\n";
        actual = captureOutput(() -> list.traverse());
        assertEquals(expected, actual);
    }

    private String captureOutput(Runnable runnable) {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));
        runnable.run();
        System.setOut(originalOut);
        return bos.toString();
    }
}
