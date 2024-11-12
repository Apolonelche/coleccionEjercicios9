import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventarioTareasTest {


    @BeforeAll
    public static void setup(){
        InventarioTareas.agregarTarea("Ingles", 1);
    }
    @Test
    void agregarTarea() {
        InventarioTareas.agregarTarea("Mates", 5);
    }

    @Test
    void eliminarTarea() {
        InventarioTareas.eliminarTarea("Ingles");
    }

    @Test
    void listarTarea() {
        InventarioTareas.listarTarea("Ingles");
    }

    @Test
    void actualizarPrioridad() {
        InventarioTareas.actualizarPrioridad("Ingles", 5);
    }
}