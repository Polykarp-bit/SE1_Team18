import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class PartialOrderingTest {

    @Test
    @DisplayName("Testet die grundlegenden Funktionen")
    public void grundlegenderTest() {
        PartialOrdering p = PartialOrdering.studentLife();
        String[] l1 = new String[]{"Aufstehen","Fruehstuecken","KaffeeTrinken","Lernen"};
        String[] l2 = new String[]{"Aufstehen","KaffeeTrinken","Fruehstuecken","Lernen"};
        Iterator<String> i = p.iterator();
        for (int j = 0; i.hasNext(); j++) {
            String next = i.next();
            if (!l1[j].equals(next) && !l2[j].equals(next)) {
                fail();
            }
        }
    }

}