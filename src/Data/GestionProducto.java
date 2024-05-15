/**
 * 
 */
package Data;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap;

import Logic.Cine;
import Logic.Musica;
import Logic.Producto;
import Logic.Videojuego;
import Mensaje.Mensaje;
import App.Aplicacion;
/**
 * @author Pedro
 *
 */

public class GestionProducto {

    // Atributos
    public static TreeMap<Integer, Producto> listaProductos = new TreeMap<>();

    // Constructores
    public GestionProducto() {
        cargarProductos();
    }

    // Methods
    /**
     * Método para cargar los productos en un TreeMap.
     */
	static Scanner sc = new Scanner(System.in);

    public static void cargarProductos() {
        Producto disco1 = new Musica( 1, "Portishead", 18.53, 6, true, "Trip Hop");
        Producto disco2 = new Musica( 2, "Radiohead", 21.2, 20, true, "Rock");
        Producto cine1 = new Cine( 3, "Willy Wonka", 30.2, 5, true, "Fantasía");
		Producto juego1 = new Videojuego(4, "Mario Bross", 35.11, 0, false, "Plataformas");

        listaProductos.put(1, disco1);
        listaProductos.put(2, disco2);
        listaProductos.put(3, cine1);
        listaProductos.put(4, juego1);
    }
        
        
       
    /**
     * Método para mostrar los productos.
     */
    public void mostrarProductos() {
        for (Integer key : listaProductos.keySet()) {
            Producto producto = listaProductos.get(key);
            System.out.println("\n" + producto + "\n" + "Nombre: " + producto.getNombre() + "\n" + "Precio unidad: "
                    + producto.getPrecioUnit() + "\n" + "Cantidad: " + producto.getCantStock() + "\n");
        }
    }
}

