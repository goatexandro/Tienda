package Store;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
import Logic.Producto;
import Logic.Videojuego;
import Producto.Pedido;
public class Fichero {

	static Scanner sc = new Scanner(System.in);
	static TreeMap<Integer, Producto> listaProductos = new TreeMap<>();

	

		public static void mostrarCaja() throws FileNotFoundException {
		FileReader leer = new FileReader(
				"C:\\Users\\caroa\\OneDrive\\Escritorio\\clase\\entorno\\Tiendai\\out\\ticket.txt");

		Scanner sc = new Scanner(leer);

		while (sc.hasNext()) {
			String linea = sc.nextLine();
			System.out.println(linea);

		}

	}

}
