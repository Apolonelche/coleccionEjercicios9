public class InventarioTareas {
    public static void main(String[] args) {
    }

            // Variables globales para almacenar el nombre y prioridad de la tarea
            private static String nombreTarea = null;
            private static int prioridad = 0;

            public static void agregarTarea(String nombre, int prioridad) {
                nombreTarea = nombre;
                prioridad = prioridad;
            }

            public static void eliminarTarea(String nombre) {
                if (nombreTarea != null && nombreTarea.equals(nombre)) {
                    nombreTarea = null;
                    prioridad = 0;
                }
            }

            public static String listarTarea(String nombreTarea) {
                if (nombreTarea == null) {
                    return "La tarea no existe";
                }
                return "Tarea: " + nombreTarea + ", Prioridad: " + prioridad;
            }

            public static void actualizarPrioridad(String nombre, int nuevaPrioridad) {
                if (nombreTarea != null && nombreTarea.equals(nombre)) {
                    prioridad = nuevaPrioridad;
                }


            }
        }