package Binary;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompetitorTest {

    @Test
    public void testGetLastName() {
        Competitor competitor = new Competitor("Doe", "John", "USA", 1990, 1, "Men's Singles");
        assertEquals("Doe", competitor.getLastName());
    }

    @Test
    public void testGetFirstName() {
        Competitor competitor = new Competitor("Doe", "John", "USA", 1990, 1, "Men's Singles");
        assertEquals("John", competitor.getFirstName());
    }

    @Test
    public void testGetCountry() {
        Competitor competitor = new Competitor("Doe", "John", "USA", 1990, 1, "Men's Singles");
        assertEquals("USA", competitor.getCountry());
    }

    @Test
    public void testGetBirthYear() {
        Competitor competitor = new Competitor("Doe", "John", "USA", 1990, 1, "Men's Singles");
        assertEquals(1990, competitor.getBirthYear());
    }

    @Test
    public void testGetTableNumber() {
        Competitor competitor = new Competitor("Doe", "John", "USA", 1990, 1, "Men's Singles");
        assertEquals(1, competitor.getTableNumber());
    }

    @Test
    public void testGetCategory() {
        Competitor competitor = new Competitor("Doe", "John", "USA", 1990, 1, "Men's Singles");
        assertEquals("Men's Singles", competitor.getCategory());
    }
}
