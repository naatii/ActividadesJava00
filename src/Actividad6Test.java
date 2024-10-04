import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Actividad6Test {

    @Test
    void calcularIva() {
        assertEquals(1452.0, Actividad6.calcularIva(), 0.01);
    }
}