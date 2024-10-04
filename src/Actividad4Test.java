import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Actividad4Test {

    @Test
    void convertirEurosAPesetas() {
        assertEquals(998.316, Actividad4.convertirEurosAPesetas(), 0.01);
    }
}