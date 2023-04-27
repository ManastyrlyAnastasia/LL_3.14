package Binary;
import LinkedList.LinkedList;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompetitorTest {

    @Test
    public void testToString() {
        Competitor competitor = new Competitor("Doe", "John", "USA", 1, 1990, "Men's Singles");
        String expected = "Doe,John,USA,1,1990,Men's Singles";
        String actual = competitor.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testConstructorAndGetters() {
        Competitor competitor = new Competitor("Doe", "John", "USA", 1, 1990, "Men's Singles");
        assertEquals("Doe", competitor.getLastName());
        assertEquals("John", competitor.getFirstName());
        assertEquals("USA", competitor.getCountry());
        assertEquals(1, competitor.getTableNumber());
        assertEquals(1990, competitor.getBirthYear());
        assertEquals("Men's Singles", competitor.getCategory());
    }
}
