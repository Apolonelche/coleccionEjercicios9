import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EdadTestEquivalencia {
    @Test
    public void testEdadValida() {
        assertEquals("Edad válida", Edad.validarEdad(25), "La edad 25 debería ser válida");
    }
    @Test
    public void testEdadInferior() {
        assertEquals("Edad no válida", Edad.validarEdad(17), "La edad 17 debería ser no válida");
    }
    @Test
    public void testEdadSuperior() {
        assertEquals("Edad no válida", Edad.validarEdad(70), "La edad 70 debería ser no válida");
    }
}