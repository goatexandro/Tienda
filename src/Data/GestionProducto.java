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

	
	public static void guardarProductosEnArchivo(ArrayList<Producto> productos) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\caroa\\OneDrive\\Escritorio\\ticket.txt"))) {
            for (int i =0;i<productos.size();i++) {
                writer.write("\n" + productos.get(i) + "\n" + "Nombre: " + productos.get(i).getNombre() + "\n" + "Precio unidad: "
    					+ productos.get(i).getPrecioUnit() + "\n" + "Cantidad: " + productos.get(i).getCantStock()
    					
    					+ "\n");
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
	
	public static void escribir(ArrayList<Producto> productos) {
		String ruta = "C:\\Users\\caroa\\OneDrive\\Escritorio\\ticket.txt";
		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			// Añadir flag a true para no machacar contenido del fichero de escritura
			fichero = new FileWriter(ruta, false);
			pw = new PrintWriter(fichero);

			for (int i = 0; i < productos.size(); i++) {
				pw.println("\n" + productos.get(i) + "\n" + "Nombre: " + productos.get(i).getNombre() + "\n" + "Precio unidad: "
    					+ productos.get(i).getPrecioUnit() + "\n" + "Cantidad: " + productos.get(i).getCantStock()
    					
    					+ "\n");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// Nuevamente aprovechamos el finally para
				// asegurarnos que se cierra el fichero.
				if (null != fichero) {

					System.out.println("La escritura en el fichero escritura.txt se ha completado con exito");
					fichero.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
		
}
