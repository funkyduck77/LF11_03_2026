package tag5.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tag5.main.Taschenrechner;

public class TaschenrechnerTest {

    Taschenrechner taschenrechner = new Taschenrechner();

    @Test
    void testeAddition() {
        Assertions.assertEquals(5, taschenrechner.addiere(2, 3));
    }

    // Exkurs: Testen, ob Exception geworfen wird
    @Test
    void testeDivisionDurchNull(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> taschenrechner.dividiere(5,0));
    }
}
