
package App;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap;

import Cliente.Compra;
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

		GestionProducto gestionProducto = new GestionProducto();
        gestionProducto.cargarProductos();
        
		Mensaje.Mensaje_Inicial();

		boolean continuar = true;

		int casos=0;

		do {

			Mensaje.Opciones_Menu();

			switch (Leer.datoInt()) {
			case 1:
				  GestionProducto gestionProducto1 = new GestionProducto();
			        gestionProducto1.mostrarProductos();			
			        break;
			case 2:
				

		Mensaje.Opciones_Menu2();
				casos=sc.nextInt();
				switch(casos) {
				case 1:
					Mensaje.Opciones_Menu0();	
                    Fichero.seleccionarYGuardarProductos(gestionProducto);

					break;
				case 2:
				Mensaje.Opciones_Menu3();
				}
				break;

			case 3:
				Compra nuevaCompra = new Compra();
			    nuevaCompra.ins();
			    nuevaCompra.mostrarCaja(null);
			    sc.nextLine();


				 break;
			default:
				// Se sale del programa
				continuar = false;
			}

		} while (continuar);

		Mensaje.Mensaje_Fin();

	}

}

