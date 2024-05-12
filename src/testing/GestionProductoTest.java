package testing;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import Data.GestionProducto;
import Logic.Cine;
import Logic.Musica;
import Logic.Videojuego;
import Producto.Producto;

class GestionProductoTest {

	  @Test
	    void testMostrarProductos() {
	        // Preparar los datos de prueba
		  // Preparar los datos de prueba
	        Map<Integer, Producto> listaProductos = new HashMap<>();
	        listaProductos.put(1, new Musica(1, "Portishead", 18.53, 6, true, "Trip Hop"));
	        listaProductos.put(2, new Musica(2, "Radiohead", 21.2, 20, true, "Rock"));
	        listaProductos.put(3, new Cine(3, "Willy Wonka", 30.2, 5, true, "Fantasía"));
	        listaProductos.put(4, new Videojuego(4, "Mario Bross", 35.11, 0, false, "Plataformas"));

	        // Redirigir la salida estándar a un ByteArrayOutputStream
	        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	        System.setOut(new PrintStream(outputStream));

	        // Ejecutar el método que queremos probar
	        GestionProducto gestionProducto = new GestionProducto();
	        gestionProducto.mostrarProductos();

	        // Capturar la salida de la consola
	        String output = outputStream.toString();

	        // Verificar que la salida contiene la información esperada
	        assertTrue(output.contains("PRODUCTO MUSICA\nGenero: Trip Hop"));
	        assertTrue(output.contains("Portishead"));
	        assertTrue(output.contains("Precio unidad: 18.53"));
	        assertTrue(output.contains("Cantidad: 6"));

	        assertTrue(output.contains("PRODUCTO MUSICA\nGenero: Rock"));
	        assertTrue(output.contains("Radiohead"));
	        assertTrue(output.contains("Precio unidad: 21.2"));
	        assertTrue(output.contains("Cantidad: 20"));

	        assertTrue(output.contains("PRODUCTO CINE\nGenero: Fantasía"));
	        assertTrue(output.contains("Willy Wonka"));
	        assertTrue(output.contains("Precio unidad: 30.2"));
	        assertTrue(output.contains("Cantidad: 5"));

	        assertTrue(output.contains("PRODUCTO VIDEOJUEGO\nGenero: Plataformas"));
	        assertTrue(output.contains("Mario Bross"));
	        assertTrue(output.contains("Precio unidad: 35.11"));
	        assertTrue(output.contains("Cantidad: 0"));
	    }
}
