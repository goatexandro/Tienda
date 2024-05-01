package Store;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

import Data.GestionProducto;
import Logic.Producto;

public class Fichero {
	
	static Scanner sc = new Scanner(System.in);
    static TreeMap<Integer, Producto> listaProductos = new TreeMap<>();
    public static void cargarProductos() {
        // Código para cargar los productos
    }
  
    public static void seleccionarYGuardarProductos(GestionProducto gestionProducto) {
        // Acceder al TreeMap listaProductos de la clase GestionProducto
        TreeMap<Integer, Producto> listaProductos = gestionProducto.listaProductos;

        // Resto del código para seleccionar y guardar productos
        System.out.println("Ingrese los números de los productos seleccionados (separados por coma y sin espacios):");
        String productosSeleccionados = sc.nextLine();

        String ruta = "C:\\Users\\caroa\\OneDrive\\Escritorio\\clase\\entorno\\Tiendai\\conf\\conf_fichero.txt\\"
        		+ ""; // Ruta predeterminada o modificar según necesidades

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(ruta));

            writer.write("Productos seleccionados:\n");
            String[] numerosProductos = productosSeleccionados.split(",");
            for (String numProducto : numerosProductos) {
                int key = Integer.parseInt(numProducto.trim());
                if (listaProductos.containsKey(key)) {
                    Producto producto = listaProductos.get(key);
                    writer.write(producto.toString() + "\n");
                } else {
                    writer.write("Producto con clave " + key + " no encontrado\n");
                }
            }

            writer.close();

            System.out.println("Los productos seleccionados han sido guardados en " + ruta);
        } catch (IOException e) {
            // No imprimir el mensaje de error
            System.out.println("Error al guardar el archivo. Por favor, inténtelo de nuevo.");
        }
    }
    
 

}
	
	
	
	


