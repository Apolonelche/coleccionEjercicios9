import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegistroUsuariosTest {
    @Test
    void testInicioSesionCorrecto() {
        assertEquals("Inicio de sesión exitoso",
                RegistroUsuarios.iniciarSesion("usuario1", "contrasena123"),
                "Debería permitir el inicio de sesión para 'usuario1' con la contraseña correcta.");
                assertEquals("Inicio de sesión exitoso", RegistroUsuarios.iniciarSesion("usuario2", "miContrasena"),
                        "Debería permitir el inicio de sesión para 'usuario2' con la contraseña correcta.");
    }
    @Test
    void testUsuarioCorrectoContrasenaIncorrecta() {
        assertEquals("Usuario o contraseña incorrectos",
                RegistroUsuarios.iniciarSesion("usuario1", "malContrasena"),
                "Debería fallar el inicio de sesión para 'usuario1' con una contraseña incorrecta.");
    }
    @Test
    void testUsuarioInexistente() {
        assertEquals("Usuario o contraseña incorrectos",
                RegistroUsuarios.iniciarSesion("usuarioInexistente",
                        "cualquierContrasena"),
                "Debería fallar el inicio de sesión para un usuario inexistente.");
    }
    @Test
    void testUsuarioOContrasenaVacia() {
        assertEquals("Usuario o contraseña incorrectos",
                RegistroUsuarios.iniciarSesion("", ""),
                "Debería fallar el inicio de sesión cuando el usuario y la contraseña están vacíos.");
    }

}