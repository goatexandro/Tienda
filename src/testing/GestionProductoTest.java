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
import Logic.Producto;
import Logic.Videojuego;

class GestionProductoTest {

	  @Test
	    void testMostrarProductos() {
	        // Aqui puse la version normal para q se teste
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
	  @Test
	    void testMostrarProductos1() {
		  //Aqui como se puede comprobar la clave de la primera musica la cambie 
		  Map<Integer, Producto> listaProductos = new HashMap<>();
	        listaProductos.put(2, new Musica(1, "Portishead", 18.53, 6, true, "Trip Hop"));
	        listaProductos.put(2, new Musica(2, "Radiohead", 21.2, 20, true, "Rock"));
	        listaProductos.put(3, new Cine(3, "Willy Wonka", 30.2, 5, true, "Fantasía"));
	        listaProductos.put(4, new Videojuego(4, "Mario Bross", 35.11, 0, false, "Plataformas"));

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
	  @Test
	    void testMostrarProductos2() {
		  //Aqui como se puede comprobar cambie todas las claves

		  Map<Integer, Producto> listaProductos = new HashMap<>();
		  listaProductos.put(155, new Musica(1, "Portishead", 18.53, 6, true, "Trip Hop"));
	        listaProductos.put(2888, new Musica(2, "Radiohead", 21.2, 20, true, "Rock"));
	        listaProductos.put(3099, new Cine(3, "Willy Wonka", 30.2, 5, true, "Fantasía"));
	        listaProductos.put(4778, new Videojuego(4, "Mario Bross", 35.11, 0, false, "Plataformas"));
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
	  @Test
	    void testMostrarProductos4() {
		  //Aqui como se puede comprobar cambie todos los genero

		  Map<Integer, Producto> listaProductos = new HashMap<>();

	        listaProductos.put(1, new Musica(1, "Portishead", 18.53, 6, true, "Macedonia"));
	        listaProductos.put(2, new Musica(2, "Radiohead", 21.2, 20, true, "MCdonals"));
	        listaProductos.put(3, new Cine(3, "Willy Wonka", 30.2, 5, true, "Kame hame ha"));
	        listaProductos.put(4, new Videojuego(4, "Mario Bross", 35.11, 0, false, "kienzan"));

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
	  @Test
	    void testMostrarProductos5() {
		  //Aqui como se puede comprobar cambie todos los precios

		  Map<Integer, Producto> listaProductos = new HashMap<>();
		  listaProductos.put(1, new Musica(1, "Portishead", 1, 6, true, "Trip Hop"));
	        listaProductos.put(2, new Musica(2, "Radiohead", 2, 20, true, "Rock"));
	        listaProductos.put(3, new Cine(3, "Willy Wonka", 3, 5, true, "Fantasía"));
	        listaProductos.put(4, new Videojuego(4, "Mario Bross", 3, 0, false, "Plataformas"));

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
	  
	  @Test	
	  void testMostrarProductos6() {
		  //Aqui como se puede comprobar cambie todas las cantidades 

		  Map<Integer, Producto> listaProductos = new HashMap<>();
		  listaProductos.put(1, new Musica(1, "Portishead", 18.53, 699, true, "Trip Hop"));
	        listaProductos.put(2, new Musica(2, "Radiohead", 21.2, 2990, true, "Rock"));
	        listaProductos.put(3, new Cine(3, "Willy Wonka", 30.2, 50, true, "Fantasía"));
	        listaProductos.put(4, new Videojuego(4, "Mario Bross", 35.11, 990, false, "Plataformas"));

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
	  
	  @Test	
	  void testMostrarProductos7() {
		  //Aqui como se puede comprobar cambie el tipo de la primera musica a Cine

		  Map<Integer, Producto> listaProductos = new HashMap<>();
		  listaProductos.put(1, new Cine(1, "Portishead", 18.53, 6, true, "Trip Hop"));
	        listaProductos.put(2, new Musica(2, "Radiohead", 21.2, 20, true, "Rock"));
	        listaProductos.put(3, new Cine(3, "Willy Wonka", 30.2, 5, true, "Fantasía"));
	        listaProductos.put(4, new Videojuego(4, "Mario Bross", 35.11, 0, false, "Plataformas"));
   
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
	  
	  @Test
	    void testMostrarProductos8() {
	        // Aqui como se puede comprobar cambie el nombre de la primera musica
	        Map<Integer, Producto> listaProductos = new HashMap<>();
	        listaProductos.put(1, new Musica(1, "Sparking zero", 18.53, 6, true, "Trip Hop"));
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
	  @Test
	    void testMostrarProductos9() {
	        // Aqui se puede comprobar q quita la disponibilidad de la primera musica
	        Map<Integer, Producto> listaProductos = new HashMap<>();
	        listaProductos.put(1, new Musica(1, "Portishead", 18.53, 6, false, "Trip Hop"));
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
	  @Test
	    void testMostrarProductos10() {
	        // Aqui comprueba la disponibilidad del videojuego ya q le puse 6 de cantidad asi q lo puse a true
	        Map<Integer, Producto> listaProductos = new HashMap<>();
	        listaProductos.put(1, new Musica(1, "Portishead", 18.53, 6, true, "Trip Hop"));
	        listaProductos.put(2, new Musica(2, "Radiohead", 21.2, 20, true, "Rock"));
	        listaProductos.put(3, new Cine(3, "Willy Wonka", 30.2, 5, true, "Fantasía"));
	        listaProductos.put(4, new Videojuego(4, "Mario Bross", 35.11, 6, true, "Plataformas"));

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

	  @Test
	    void testMostrarProductos11() {
	        // Aqui comprueba q cambie el nombre del videojuego
	        Map<Integer, Producto> listaProductos = new HashMap<>();
	        listaProductos.put(1, new Musica(1, "Portishead", 18.53, 6, true, "Trip Hop"));
	        listaProductos.put(2, new Musica(2, "Radiohead", 21.2, 20, true, "Rock"));
	        listaProductos.put(3, new Cine(3, "Willy Wonka", 30.2, 5, true, "Fantasía"));
	        listaProductos.put(4, new Videojuego(4, "zapatillla", 35.11, 0, false, "Plataformas"));

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

	  @Test
	    void testMostrarProductos12() {
	        // Aqui cambie todos los productos a musica
	        Map<Integer, Producto> listaProductos = new HashMap<>();
	        listaProductos.put(1, new Musica(1, "Portishead", 18.53, 6, true, "Trip Hop"));
	        listaProductos.put(2, new Musica(2, "Radiohead", 21.2, 20, true, "Rock"));
	        listaProductos.put(3, new Musica(3, "Willy Wonka", 30.2, 5, true, "Fantasía"));
	        listaProductos.put(4, new Musica(4, "Mario Bross", 35.11, 0, false, "Plataformas"));

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
	  
	  @Test
	    void testMostrarProductos13() {
	        // Aqui cambie todos los productos a cine
	        Map<Integer, Producto> listaProductos = new HashMap<>();
	        listaProductos.put(1, new Cine(1, "Portishead", 18.53, 6, true, "Trip Hop"));
	        listaProductos.put(2, new Cine(2, "Radiohead", 21.2, 20, true, "Rock"));
	        listaProductos.put(3, new Cine(3, "Willy Wonka", 30.2, 5, true, "Fantasía"));
	        listaProductos.put(4, new Cine(4, "Mario Bross", 35.11, 0, false, "Plataformas"));

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
	  @Test
	    void testMostrarProductos14() {
	        // Aqui cambie todos los productos a Videojuego
	        Map<Integer, Producto> listaProductos = new HashMap<>();
	        listaProductos.put(1, new Videojuego(1, "Portishead", 18.53, 6, true, "Trip Hop"));
	        listaProductos.put(2, new Videojuego(2, "Radiohead", 21.2, 20, true, "Rock"));
	        listaProductos.put(3, new Videojuego(3, "Willy Wonka", 30.2, 5, true, "Fantasía"));
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
	  
	  @Test
	    void testMostrarProductos15() {
	        // Aqui le cambie la cantidad a la segunda musica junto a su disponibilidad
	        Map<Integer, Producto> listaProductos = new HashMap<>();
	        listaProductos.put(1, new Musica(1, "Portishead", 18.53, 6, true, "Trip Hop"));
	        listaProductos.put(2, new Musica(2, "Radiohead", 21.2, 0, false, "Rock"));
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
	        assertTrue(output.contains("Cantidad: 0"));

	        assertTrue(output.contains("PRODUCTO CINE\nGenero: Fantasía"));
	        assertTrue(output.contains("Willy Wonka"));
	        assertTrue(output.contains("Precio unidad: 30.2"));
	        assertTrue(output.contains("Cantidad: 5"));

	        assertTrue(output.contains("PRODUCTO VIDEOJUEGO\nGenero: Plataformas"));
	        assertTrue(output.contains("Mario Bross"));
	        assertTrue(output.contains("Precio unidad: 35.11"));
	        assertTrue(output.contains("Cantidad: 0"));
	    }
	  @Test
	    void testMostrarProductos16() {
	        // Aqui le cambie la cantidad a la primera musica junto a su disponibilidad
	        Map<Integer, Producto> listaProductos = new HashMap<>();
	        listaProductos.put(1, new Musica(1, "Portishead", 18.53, 0, false, "Trip Hop"));
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
	        assertTrue(output.contains("Cantidad: 0"));

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
	  @Test
	    void testMostrarProductos17() {
	        // Aqui puse en el caso deq no haya stock en ninguno
	        Map<Integer, Producto> listaProductos = new HashMap<>();
	        listaProductos.put(1, new Musica(1, "Portishead", 18.53, 0, false, "Trip Hop"));
	        listaProductos.put(2, new Musica(2, "Radiohead", 21.2, 0, false, "Rock"));
	        listaProductos.put(3, new Cine(3, "Willy Wonka", 30.2, 0, false, "Fantasía"));
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
	  
	  @Test
	    void testMostrarProductos18() {
	        // Aqui quite el producto videojuego
	        Map<Integer, Producto> listaProductos = new HashMap<>();
	        listaProductos.put(1, new Musica(1, "Portishead", 18.53, 6, true, "Trip Hop"));
	        listaProductos.put(2, new Musica(2, "Radiohead", 21.2, 20, true, "Rock"));
	        listaProductos.put(3, new Cine(3, "Willy Wonka", 30.2, 5, true, "Fantasía"));

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

	      }
	  @Test
	    void testMostrarProductos19() {
	        // Aqui el primer producto de musica
	        Map<Integer, Producto> listaProductos = new HashMap<>();
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
	  @Test
	    void testMostrarProductos20() {
	        // Aqui añadi un producto mas
	        Map<Integer, Producto> listaProductos = new HashMap<>();
	        listaProductos.put(1, new Musica(1, "Portishead", 18.53, 6, true, "Trip Hop"));
	        listaProductos.put(2, new Musica(2, "Radiohead", 21.2, 20, true, "Rock"));
	        listaProductos.put(3, new Cine(3, "Willy Wonka", 30.2, 5, true, "Fantasía"));
	        listaProductos.put(4, new Videojuego(4, "Mario Bross", 35.11, 0, false, "Plataformas"));
	        listaProductos.put(5, new Musica(5, "mio", 18.53, 6, true, "Trip Hop"));
	        
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
	  @Test
	    void testMostrarProductos21() {
	        // Aqui teste si todos los productos fueran gratis
	        Map<Integer, Producto> listaProductos = new HashMap<>();
	        listaProductos.put(1, new Musica(1, "Portishead", 0, 6, true, "Trip Hop"));
	        listaProductos.put(2, new Musica(2, "Radiohead", 0, 20, true, "Rock"));
	        listaProductos.put(3, new Cine(3, "Willy Wonka", 0, 5, true, "Fantasía"));
	        listaProductos.put(4, new Videojuego(4, "Mario Bross", 0, 0, false, "Plataformas"));

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
	  @Test
	    void testMostrarProductos22() {
	        // Aqui puse todos los codigos a 1
	        Map<Integer, Producto> listaProductos = new HashMap<>();
	        listaProductos.put(1, new Musica(1, "Portishead", 18.53, 6, true, "Trip Hop"));
	        listaProductos.put(1, new Musica(1, "Radiohead", 21.2, 20, true, "Rock"));
	        listaProductos.put(1, new Cine(1, "Willy Wonka", 30.2, 5, true, "Fantasía"));
	        listaProductos.put(1, new Videojuego(1, "Mario Bross", 35.11, 0, false, "Plataformas"));

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
	  
	  @Test
	    void testMostrarProductos23() {
	        // Aqui puse todos los codigos a 2
	        Map<Integer, Producto> listaProductos = new HashMap<>();
	        listaProductos.put(2, new Musica(2, "Portishead", 18.53, 6, true, "Trip Hop"));
	        listaProductos.put(2, new Musica(2, "Radiohead", 21.2, 20, true, "Rock"));
	        listaProductos.put(2, new Cine(2, "Willy Wonka", 30.2, 5, true, "Fantasía"));
	        listaProductos.put(2, new Videojuego(2, "Mario Bross", 35.11, 0, false, "Plataformas"));

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
	  @Test
	    void testMostrarProductos24() {
	        // Aqui puse todos los codigos a 3
	        Map<Integer, Producto> listaProductos = new HashMap<>();
	        listaProductos.put(3, new Musica(3, "Portishead", 18.53, 6, true, "Trip Hop"));
	        listaProductos.put(3, new Musica(3, "Radiohead", 21.2, 20, true, "Rock"));
	        listaProductos.put(3, new Cine(3, "Willy Wonka", 30.2, 5, true, "Fantasía"));
	        listaProductos.put(3, new Videojuego(3, "Mario Bross", 35.11, 0, false, "Plataformas"));

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
	  @Test
	    void testMostrarProductos25() {
	        // Aqui puse todos los codigos a 4
	        Map<Integer, Producto> listaProductos = new HashMap<>();
	        listaProductos.put(4, new Musica(4, "Portishead", 18.53, 6, true, "Trip Hop"));
	        listaProductos.put(4, new Musica(4, "Radiohead", 21.2, 20, true, "Rock"));
	        listaProductos.put(4, new Cine(4, "Willy Wonka", 30.2, 5, true, "Fantasía"));
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
	  
	  @Test
	    void testMostrarProductos26() {
	        // Aqui puse todos los generos a rock
	        Map<Integer, Producto> listaProductos = new HashMap<>();
	        listaProductos.put(4, new Musica(4, "Portishead", 18.53, 6, true, "Rock"));
	        listaProductos.put(4, new Musica(4, "Radiohead", 21.2, 20, true, "Rock"));
	        listaProductos.put(4, new Cine(4, "Willy Wonka", 30.2, 5, true, "Rock"));
	        listaProductos.put(4, new Videojuego(4, "Mario Bross", 35.11, 0, false, "Rock"));

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
	  
	  @Test
	    void testMostrarProductos27() {
	        // Aqui cambie el nombre de treemap
	        Map<Integer, Producto> Productos = new HashMap<>();
	        Productos.put(1, new Musica(1, "Portishead", 18.53, 6, true, "Trip Hop"));
	        Productos.put(2, new Musica(2, "Radiohead", 21.2, 20, true, "Rock"));
	        Productos.put(3, new Cine(3, "Willy Wonka", 30.2, 5, true, "Fantasía"));
	        Productos.put(4, new Videojuego(4, "Mario Bross", 35.11, 0, false, "Plataformas"));

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
	  @Test
	    void testMostrarProductos28() {
	        // Aqui puse q todos los productos cuesten 100 euros
	        Map<Integer, Producto> listaProductos = new HashMap<>();
	        listaProductos.put(1, new Musica(1, "Portishead", 100, 6, true, "Trip Hop"));
	        listaProductos.put(2, new Musica(2, "Radiohead", 100, 20, true, "Rock"));
	        listaProductos.put(3, new Cine(3, "Willy Wonka", 100, 5, true, "Fantasía"));
	        listaProductos.put(4, new Videojuego(4, "Mario Bross", 100, 0, false, "Plataformas"));

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
	  
	  @Test
	    void testMostrarProductos29() {
	        // Aqui puse q todos los generos a fantasia
	        Map<Integer, Producto> listaProductos = new HashMap<>();
	        listaProductos.put(1, new Musica(1, "Portishead", 100, 6, true, "Fantasía"));
	        listaProductos.put(2, new Musica(2, "Radiohead", 100, 20, true, "Fantasía"));
	        listaProductos.put(3, new Cine(3, "Willy Wonka", 100, 5, true, "Fantasía"));
	        listaProductos.put(4, new Videojuego(4, "Mario Bross", 100, 0, false, "Fantasía"));

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
	  
	  @Test
	    void testMostrarProductos30() {
	        // Aqui puse que todos sean fe genero trip hop
	        Map<Integer, Producto> listaProductos = new HashMap<>();
	        listaProductos.put(1, new Musica(1, "Portishead", 18.53, 6, true, "Trip Hop"));
	        listaProductos.put(2, new Musica(2, "Radiohead", 21.2, 20, true, "Trip Hop"));
	        listaProductos.put(3, new Cine(3, "Willy Wonka", 30.2, 5, true, "Trip Hop"));
	        listaProductos.put(4, new Videojuego(4, "Mario Bross", 35.11, 0, false, "Trip Hop"));

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
	  @Test
	    void testMostrarProductos31() {
	        // Aqui puse que todos se llamen como el primer producto de musica
	        Map<Integer, Producto> listaProductos = new HashMap<>();
	        listaProductos.put(1, new Musica(1, "Portishead", 18.53, 6, true, "Trip Hop"));
	        listaProductos.put(2, new Musica(2, "Portishead", 21.2, 20, true, "Rock"));
	        listaProductos.put(3, new Cine(3, "Portishead", 30.2, 5, true, "Fantasía"));
	        listaProductos.put(4, new Videojuego(4, "Portishead", 35.11, 0, false, "Plataformas"));

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
	  @Test
	    void testMostrarProductos32() {
	        // Aqui puse para todos los productos el nombre del segundo producto de musica
	        Map<Integer, Producto> listaProductos = new HashMap<>();
	        listaProductos.put(1, new Musica(1, "Radiohead", 18.53, 6, true, "Trip Hop"));
	        listaProductos.put(2, new Musica(2, "Radiohead", 21.2, 20, true, "Rock"));
	        listaProductos.put(3, new Cine(3, "Radiohead", 30.2, 5, true, "Fantasía"));
	        listaProductos.put(4, new Videojuego(4, "Radiohead", 35.11, 0, false, "Plataformas"));

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
	  
	  @Test
	    void testMostrarProductos33() {
	        // Aqui puse para todos los productos el nombre del tercero producto, cine
	        Map<Integer, Producto> listaProductos = new HashMap<>();
	        listaProductos.put(1, new Musica(1, "Willy Wonka", 18.53, 6, true, "Trip Hop"));
	        listaProductos.put(2, new Musica(2, "Willy Wonka", 21.2, 20, true, "Rock"));
	        listaProductos.put(3, new Cine(3, "Willy Wonka", 30.2, 5, true, "Fantasía"));
	        listaProductos.put(4, new Videojuego(4, "Willy Wonka", 35.11, 0, false, "Plataformas"));

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
	  @Test
	    void testMostrarProductos34() {
	        // Aqui puse para todos los productos el nombre del cuarto producto, videojuego
	        Map<Integer, Producto> listaProductos = new HashMap<>();
	        listaProductos.put(1, new Musica(1, "Mario Bross", 18.53, 6, true, "Trip Hop"));
	        listaProductos.put(2, new Musica(2, "Mario Bross", 21.2, 20, true, "Rock"));
	        listaProductos.put(3, new Cine(3, "Mario Bross", 30.2, 5, true, "Fantasía"));
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
	  @Test
	    void testMostrarProductos35() {
	        // Aqui puse el precio en entero
	        Map<Integer, Producto> listaProductos = new HashMap<>();
	        listaProductos.put(1, new Musica(1, "Portishead", 19, 6, true, "Trip Hop"));
	        listaProductos.put(2, new Musica(2, "Radiohead", 21, 20, true, "Rock"));
	        listaProductos.put(3, new Cine(3, "Willy Wonka", 30, 5, true, "Fantasía"));
	        listaProductos.put(4, new Videojuego(4, "Mario Bross", 35, 0, false, "Plataformas"));

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
	  @Test
	    void testMostrarProductos36() {
	        // Aqui puse que todos tengan el mismo precio qe el primer producto de musica
	        Map<Integer, Producto> listaProductos = new HashMap<>();
	        listaProductos.put(1, new Musica(10, "Portishead", 18.53, 6, true, "Trip Hop"));
	        listaProductos.put(2, new Musica(2, "Radiohead", 18.53, 20, true, "Rock"));
	        listaProductos.put(3, new Cine(3, "Willy Wonka", 18.53, 5, true, "Fantasía"));
	        listaProductos.put(4, new Videojuego(4, "Mario Bross", 18.53, 0, false, "Plataformas"));

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
	  
	  @Test
	    void testMostrarProductos37() {
	        // Aqui puse el mismo precio que el seguundo producto de musica
	        Map<Integer, Producto> listaProductos = new HashMap<>();
	        listaProductos.put(1, new Musica(1, "Portishead", 21.2, 6, true, "Trip Hop"));
	        listaProductos.put(2, new Musica(2, "Radiohead", 21.2, 20, true, "Rock"));
	        listaProductos.put(3, new Cine(3, "Willy Wonka", 21.2, 5, true, "Fantasía"));
	        listaProductos.put(4, new Videojuego(4, "Mario Bross", 21.2, 0, false, "Plataformas"));

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
	  @Test
	    void testMostrarProductos38() {
	        // Aqui puse el mismo precio que el tercer producto
	        Map<Integer, Producto> listaProductos = new HashMap<>();
	        listaProductos.put(1, new Musica(1, "Portishead", 30.2, 6, true, "Trip Hop"));
	        listaProductos.put(2, new Musica(2, "Radiohead", 30.2, 20, true, "Rock"));
	        listaProductos.put(3, new Cine(3, "Willy Wonka", 30.2, 5, true, "Fantasía"));
	        listaProductos.put(4, new Videojuego(4, "Mario Bross", 30.2, 0, false, "Plataformas"));

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
	  
	  @Test
	    void testMostrarProductos39() {
	        // Aqui puse para todos el mismo precio que el ultimo producto
	        Map<Integer, Producto> listaProductos = new HashMap<>();
	        listaProductos.put(1, new Musica(1, "Portishead", 35.11, 6, true, "Trip Hop"));
	        listaProductos.put(2, new Musica(2, "Radiohead", 35.11, 20, true, "Rock"));
	        listaProductos.put(3, new Cine(3, "Willy Wonka", 35.11, 5, true, "Fantasía"));
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
