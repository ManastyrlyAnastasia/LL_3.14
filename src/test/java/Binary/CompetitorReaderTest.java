package Binary;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class CompetitorReaderTest {
    @Test
    public void testReadCompetitors() {
        String filePath = "path/to/test/file.csv"; // путь к тестовому файлу
        List<Competitor> competitors = CompetitorReader.readCompetitors(filePath);

        assertEquals(2, competitors.size()); // проверка количества созданных объектов Competitor

        // проверка созданных объектов Competitor
        Competitor competitor1 = competitors.get(0);
        assertEquals("Ivanov", competitor1.getLastName());
        assertEquals("Ivan", competitor1.getFirstName());
        assertEquals("Russia", competitor1.getCountry());
        assertEquals(1990, competitor1.getBirthYear());
        assertEquals(1, competitor1.getTableNumber());
        assertEquals("Men's Singles", competitor1.getCategory());

        Competitor competitor2 = competitors.get(1);
        assertEquals("Petrova", competitor2.getLastName());
        assertEquals("Maria", competitor2.getFirstName());
        assertEquals("Russia", competitor2.getCountry());
        assertEquals(1995, competitor2.getBirthYear());
        assertEquals(2, competitor2.getTableNumber());
        assertEquals("Women's Singles", competitor2.getCategory());
    }

}