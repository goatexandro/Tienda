package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


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

    // Método para limpiar la tabla de productos (simula que no hay productos)
    private void limpiarTablaProductos(Connection con) throws SQLException {
        try (Statement statement = con.createStatement()) {
            statement.executeUpdate("DELETE FROM producto");
        }
    }

    @Test
    public void testMostrarProductos() {
        // Redireccionar la salida estándar a un ByteArrayOutputStream para capturarla
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        try {
            // Establecer conexión con la base de datos
            Connection con = establecerConexion();

            // Caso 1: No hay productos en la base de datos
            GestionProducto.mostrarProductosa(con);
            // Verificar que se imprima el mensaje de error
            assertTrue(outContent.toString().contains("Error al recuperar los productos"));

            // Limpiar la tabla de productos (simular que no hay productos)
            limpiarTablaProductos(con);

            // Caso 2: Hay productos en la base de datos
            // Insertar algunos datos de prueba en la tabla producto
            try (Statement statement = con.createStatement()) {
                statement.executeUpdate("INSERT INTO producto (codigoproducto, nombre, precioUnit, cantStock) VALUES (1, 'Producto1', 10.0, 5)");
                statement.executeUpdate("INSERT INTO producto (codigoproducto, nombre, precioUnit, cantStock) VALUES (2, 'Producto2', 20.0, 8)");
            }

            // Ejecutar el método mostrarProductosa
            GestionProducto.mostrarProductosa(con);

            // Verificar que se impriman los productos correctamente
            assertTrue(outContent.toString().contains("Producto1") && outContent.toString().contains("Producto2"));

            // Cerrar la conexión con la base de datos
            con.close();
        } catch (SQLException e) {
            // Si ocurre algún error de SQL, la prueba falla
            e.printStackTrace();
            assertTrue(false);
        } finally {
            // Restaurar la salida estándar
            System.setOut(System.out);
        }
    }
}

