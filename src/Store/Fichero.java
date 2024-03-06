package Store;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import Logic.Producto;

public class Fichero {
	
	
	
	public static void guardarProductosEnArchivo(ArrayList<Producto> productos) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\caroa\\OneDrive\\Escritorio\\clase\\entorno\\Tiendai\\conf\\conf_fichero.txt"))) {
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
		String ruta = "C:\\Users\\caroa\\OneDrive\\Escritorio\\clase\\entorno\\Tiendai\\conf\\conf_fichero.txt";
		FileWriter txt = null;
		PrintWriter pw = null;
		try {
			// Añadir flag a true para no machacar contenido del fichero de escritura
			txt = new FileWriter(ruta, false);
			pw = new PrintWriter(txt);

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
				if (null != txt) {

					System.out.println(" completado ");
					txt.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	
	
	
	public void leer() {


	}
	

}
	
	
	
	


