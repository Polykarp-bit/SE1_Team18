import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AbhaengigkeitTest {

    private Abhaengigkeit a1;
    String[][] regeln= {{"A","C"},{"C","D"},{"B","C"}};

    @BeforeEach
    public void setUp(){
        a1 = new Abhaengigkeit(regeln);
    }

    @Test
    @DisplayName("Ein Object soll auf Korrektheit überprüft werden")
    public void erzeugtest(){
        String [] testString1 = {"A","B","C","D"};
        assertTrue(a1.isWellSorted(testString1));
    }

}