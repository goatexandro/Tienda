
package App;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import Data.GestionProducto;
import Leer.Leer;
import Logic.Cine;
import Logic.Musica;
import Logic.Producto;
import Logic.Videojuego;
import Mensaje.Mensaje;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import Store.Fichero;


/**
 * @author Pedro
 *
 */
public class Aplicacion {

static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {


		Mensaje.Mensaje_Inicial();

		boolean continuar = true;

		// Se instancian y cargan los productos
		Producto disco1 = new Musica("Portishead", 18.53, 6, true, "Trip Hop");
		Producto disco2 = new Musica("Radiohead", 21.2, 20, true, "Rock");
		Producto cine1 = new Cine("Willy Wonka", 30.2, 5, true, "Fantasía");
		Producto juego1 = new Videojuego("Mario Bross", 35.11, 0, false, "Plataformas");


		// Se crea el array "catálogo" para contener los productos.
		// Su dimensión viene del número de veces que se instancia el contructor de
		// Producto
		Producto catalogo[] = new Producto[Producto.dimesionArray];

		// Se crea el objeto gestion para trabajar (mostrar y vender productos, y
		// mostrar caja)
		GestionProducto gestion = new GestionProducto();

		// Se rellena el array catálogo
		catalogo[0] = disco1;
		catalogo[1] = disco2;
		catalogo[2] = cine1;
		catalogo[3] = juego1;

		
		ArrayList<Producto> lista=new ArrayList<>();
		lista.add(disco1);
		lista.add(disco2);
		lista.add(cine1);
		lista.add(juego1);

		int casos=0;

		do {

			Mensaje.Opciones_Menu();

			switch (Leer.datoInt()) {
			case 1:
			gestion.mostrar(lista);
				break;
			case 2:
				Mensaje.Opciones_Menu2();
				casos=sc.nextInt();
				switch(casos) {
				case 1:
					Fichero.escribir(lista);
					
					break;
				case 2:
				Mensaje.Opciones_Menu3();
					break;
				}
				Fichero.guardarProductosEnArchivo(lista);
				break;

			case 3:
				

				 break;
			default:
				// Se sale del programa
				continuar = false;
			}

		} while (continuar);

		Mensaje.Mensaje_Fin();

	}

}

