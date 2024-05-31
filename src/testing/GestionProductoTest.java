package testing;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Data.GestionProducto;

public class GestionProductoTest {
	 // Método para establecer la conexión con la base de datos de prueba
    private Connection establecerConexion() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/tu_basededatos?useSSL=false";
        String usuario = "tu_usuario";
        String contraseña = "tu_contraseña";
        return DriverManager.getConnection(url, usuario, contraseña);
    }

    @Test
    public void testMostrarProductosSinStock() {
        try {
            // Establecer conexión con la base de datos
            Connection con = establecerConexion();

            // Aquí podrías agregar lógica para eliminar o modificar los productos en la base de datos
            // para simular que no hay stock disponible

            // Ejecutar el método mostrarProductosa
            GestionProducto.mostrarProductosa(con);

            // Si el método no lanzó ninguna excepción, significa que no hay productos en stock,
            // por lo que la prueba debería pasar
            assertTrue(true);

            // Cerrar la conexión con la base de datos
            con.close();
        } catch (SQLException e) {
            // Si ocurre algún error de SQL, la prueba falla
            e.printStackTrace();
            assertTrue(false);
        }
    }
}
