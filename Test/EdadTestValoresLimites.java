import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EdadTestValoresLimites {
    @Test
    public void testLimiteInferior() {
        assertEquals("Edad válida", Edad.validarEdad(18), "La edad 18 debería ser válida");
    }

    @Test
    public void testLimiteInferiorFallido() {
        assertEquals("Edad no válida", Edad.validarEdad(17), "La edad 17 debería ser no válida");
    }

    @Test
    public void testLimiteSuperior() {
        assertEquals("Edad válida", Edad.validarEdad(65), "La edad 65 debería ser válida");
    }

    @Test
    public void testLimiteSuperiorFallido() {
        assertEquals("Edad no válida", Edad.validarEdad(66), "La edad 66 debería ser no válida");

    }
}