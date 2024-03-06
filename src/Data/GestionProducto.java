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

import Logic.Producto;

/**
 * @author Pedro
 *
 */
public class GestionProducto {

	// Atributos
	private Producto productos[] = null;
	public double caja;

	// Constructores
	public GestionProducto() {

	}

	public GestionProducto(Producto[] productos) {
		this.productos = productos;
	}

	// Methods
	/**
	 * 
	 * @return
	 */
	public Producto[] cargarProductos() {

		return productos;
	}

	/**
	 * 
	 * @param productos
	 */

	public void mostrar(ArrayList<Producto> lista) {
		for (int i =0;i<lista.size();i++) {
			System.out.println("\n" + lista.get(i) + "\n" + "Nombre: " + lista.get(i).getNombre() + "\n" + "Precio unidad: "
					+ lista.get(i).getPrecioUnit() + "\n" + "Cantidad: " + lista.get(i).getCantStock()
					
					+ "\n");
		}
	}

	

		
}
