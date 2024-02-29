/**
 * 
 */
package Data;
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
	public void mostrarProductos(Producto[] productos) {
		for (int i = 0; i < productos.length; i++) {

			System.out.print("\n" + productos[i] + "\n" + "Nombre: " + productos[i].getNombre() + "\n" + "Disponible: "
					+ productos[i].getCantStock() + "\n" + "Precio Unitario: " + productos[i].getPrecioUnit()
					+ " euros."
					+ "\n");

		}
	}

	public void mostrar(ArrayList<Producto> lista) {
		for (int i =0;i<lista.size();i++) {
			System.out.println("\n" + lista.get(i) + "\n" + "Nombre: " + lista.get(i).getNombre() + "\n" + "Precio unidad: "
					+ lista.get(i).getPrecioUnit() + "\n" + "Cantidad: " + lista.get(i).getCantStock()
					
					+ "\n");
		}
	}
		
}
