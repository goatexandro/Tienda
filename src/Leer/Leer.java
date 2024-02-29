package Leer;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 *@author Alexandro
 */
public class Leer {
	public static String dato() {
		String sdato = " ";
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader flujoE = new BufferedReader(isr);
			sdato = flujoE.readLine();
		} catch (IOException e) {
			System.out.println("Error " + e.getMessage());
		}
		return sdato;

	}
	
	//se crea un constructor vacio que devuelve al metodo dato en forma de entero al tener el parse lo que hace es convertir el String en un entero(en este caso por el Integer y el parse int) al igual que los de abajo con el tipo de dato que se quiera dar  
	public static int datoInt() {

		return Integer.parseInt(dato());
	}
	
	//se crea un constructor vacio que devuelve al metodo dato en forma de decimal float
	public static float datoFloat() {
		return Float.parseFloat(dato());
	}

	// Leer un char por teclado

	public static char datoChar() {
		char c = ' ';
		try {
			java.io.BufferedInputStream b = new BufferedInputStream(System.in);
			c = (char) b.read();
		} catch (IOException e) {
			System.out.println("Error al leer");
			e.printStackTrace();
		}
		return c;
	}

	//se crea un constructor vacio que devuelve al metodo dato en forma de entero long, es decir, un entero de 64 bits, la diferencia con el int es que el int usa 32 bits
	public static long datoLong() {
		return Long.parseLong(dato());
	}

}
