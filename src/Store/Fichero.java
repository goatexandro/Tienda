package Store;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import Data.GestionProducto;
import Logic.Cine;
import Logic.Musica;
import Logic.Videojuego;
import Producto.Producto;

public class Fichero {
	
	static Scanner sc = new Scanner(System.in);
    static TreeMap<Integer, Producto> listaProductos = new TreeMap<>();
    public static void cargarProductos() {
    	Producto disco1 = new Musica( 3, "Portishead", 18.53, 6, true, "Trip Hop");
        Producto disco2 = new Musica( 2, "Radiohead", 21.2, 20, true, "Rock");
        Producto cine1 = new Cine( 4, "Willy Wonka", 30.2, 5, true, "Fantasía");
		Producto juego1 = new Videojuego(1, "Mario Bross", 35.11, 0, false, "Plataformas");
    }
  
    public static void seleccionarYGuardarProductos(GestionProducto gestionProducto) {
        // Acceder al TreeMap listaProductos de la clase GestionProducto
        TreeMap<Integer, Producto> listaProductos = gestionProducto.listaProductos;

        // Resto del código para seleccionar y guardar productos
        System.out.println("Ingrese los números de los productos seleccionados (separados por coma y sin espacios):");
        String productosSeleccionados = sc.nextLine();

        String ruta = "C:\\Users\\caroa\\OneDrive\\Escritorio\\clase\\entorno\\Tiendai\\out\\ticket.txt\\"
        		+ ""; // Ruta predeterminada o modificar según necesidades

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(ruta));

            writer.write("Productos seleccionados:\n");
            /**String[] numerosProductos = productosSeleccionados.split(",");
            for (String numProducto : numerosProductos) {
                int key = Integer.parseInt(numProducto.trim());
                if (listaProductos.containsKey(key)) {
                    Producto producto = listaProductos.get(key);
                    writer.write(producto.toString() + "\n");
                } else {
                    writer.write("Producto con clave " + key + " no encontrado\n");
                }
            }
*/
           /** String[] idProducto = productosSeleccionados.split(",");
            for (int i = 0; i < idProducto.length; i++) {
                int id = Integer.parseInt(idProducto[i]);
                if (listaProductos.get(i).getCodigoproducto()==id) {
                    Producto producto = listaProductos.get(id);
                    writer.write(producto.toString() + "\n");
                } else {
                    writer.write("Producto con clave " + id + " no encontrado\n");
                }
            }*/
           /** String[] idProducto = productosSeleccionados.split(",");
            for (int i = 0; i < idProducto.length; i++) {
                int id = Integer.parseInt(idProducto[i]);
                Producto p=new Musica(id, ruta, id, id, false, ruta);
                for (Integer key : listaProductos.keySet()) {
                    p = listaProductos.get(key);
                    if (p.getCodigoproducto()==(id)){
                        Producto producto = listaProductos.get(key);
                        writer.write(producto.toString() + "\n");
                    }
                }
            }**/
            String[] idProducto = productosSeleccionados.split(",");
            for (int i = 0; i < idProducto.length; i++) {
                int id = Integer.parseInt(idProducto[i]);
                
                   Iterator<Map.Entry<Integer, Producto>> iterator = listaProductos.entrySet().iterator();
                    while (iterator.hasNext()) {
                        Map.Entry<Integer, Producto> entry = iterator.next();
                        Producto producto = entry.getValue();
                        if(producto.getCodigoproducto()==id)
                        {
                        writer.write("\n" + producto + "\n" + "Nombre: " + producto.getNombre() + "\n" + "Precio unidad: "
                                + producto.getPrecioUnit() + "\n" + "Cantidad: " + producto.getCantStock() + "\n"+" codigo: "+producto.getCodigoproducto());
                        }
                    }

            }
            writer.close();

            System.out.println("Los productos seleccionados han sido guardados en " + ruta);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo. Por favor, inténtelo de nuevo.");
            System.out.println(e.getMessage());

        }
        
    }
    
    }
    
	
	
	
	


