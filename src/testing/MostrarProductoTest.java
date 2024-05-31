package testing;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.jupiter.api.Test;

import Data.GestionProducto;

class MostrarProductoTest {
	  private Connection establecerConexion() throws SQLException {
	        final String NOMBRE_BD = "tienda";
	        final String UBICACION = "localhost";
	        final String PUERTO = "9999"; // Puerto por defecto de MySQL
	        final String USUARIO = "sip";
	        final String CLAVE = "123456789a.";
	        final String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
	        final String URL = "jdbc:mysql://" + UBICACION + ":" + PUERTO + "/" + NOMBRE_BD
	                + "?useUnicode=true&characterEncoding=utf-8";

	        try {
	            Class.forName(CONTROLADOR);
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	            throw new SQLException("No se pudo cargar el controlador de base de datos.");
	        }

	        return DriverManager.getConnection(URL, USUARIO, CLAVE);
	    }
@Test
	    private void actualizarPreciosACero(Connection con) throws SQLException {
	        try (Statement statement = con.createStatement()) {
	            statement.executeUpdate("UPDATE producto SET precioUnit = 0");
	        }
	    }
	@Test
	void testMostrarProductosSinStock() {
		 try {
	            Connection con = establecerConexion();
	            actualizarPreciosACero(con);
	            GestionProducto.mostrarProductosa(con);
	            assertTrue(true);
	            con.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	            assertTrue(false);
	        }
	    }
	

@Test
public void testConexionExitosa() {
    try {
        Connection con = establecerConexion();
        assertTrue(con != null && !con.isClosed());//Esto lo q hace es verificar que con que en este caso es nuestra connection esta enchufada, es decir no es null y esta en funcionamiento, es decir no esta cerrada
        con.close();
    } catch (SQLException e) {
        e.printStackTrace();
        assertTrue(false);
    }
}

@Test
public void testActualizarPreciosACero() {
    try {
        Connection con = establecerConexion();
        actualizarPreciosACero(con);//Aqui llamo al metodo el cual pone los precios a 0 y pongo mi connection para que afecte a los productos
 
        assertTrue(true);
        con.close();
    } catch (SQLException e) {
        e.printStackTrace();
        assertTrue(false);
    }
}

}
