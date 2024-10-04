import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Actividad5Test {

    @Test
    void convertirPesetasAEuros() {
        assertEquals(1200, Actividad5.convertirPesetasAEuros(), 0.01);
    }
}