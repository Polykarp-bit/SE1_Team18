import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbhaengigkeitTest {

    private Abhaengigkeit a1;
    String[][] regeln = {{"A", "C"}, {"C", "D"}, {"B", "C"}, {"D", "E"}};

    @BeforeEach
    public void setUp() {
        a1 = new Abhaengigkeit(regeln);
    }

    @Test
    @DisplayName("Ein Objekt soll auf Korrektheit überprüft werden")
    public void erzeugtest() {
        String[] testString1 = {"A", "B", "C", "D"};
        assertTrue(a1.isWellSorted(testString1));
    }

    @Test
    @DisplayName("Ein Objekt soll auf transitivitaet getestet werden")
    public void transtest() {

        String[] testString2 = {"D", "A"};
        assertFalse(a1.isWellSorted(testString2));

        String[] testString3 = {"E"};
        assertFalse(a1.isWellSorted(testString3));

    }

    @Test
    @DisplayName("Ein Objekt soll auf doppelte Vorkommen getestet werden")
    public void doppeltevorkommen() {

        String[] testString4 = {"A", "A"};
        assertFalse(a1.isWellSorted(testString4));

    }

}