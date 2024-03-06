package Mensaje;
/**
 * 
 *@author Alexandro
 */
public class Mensaje {
	
	public static void Mensaje_Inicial() {

		System.out.println("Bienvenido a la tienda virtual\n\n"
				+ "El programa simula una tienda que vende juegos, música y cine\n"
				+ "Solamente se pueden vender productos si aparecen disponibles en la tienda\n"
		);
	}

	
	public static void Opciones_Menu() {

		System.out.println("\nSeleccione que desea realizar:\n\n" + "\t1. Mostrar productos. (Listar productos)\n"
				+ "\t2. Comprar productos\n" + "\t3. Mostrar caja. (Importe total de la compra actual)\n"
				+ "\tSALIR --> Pulse cualquier otro número\n");
	}
	
	public static void Opciones_Menu1() {
		System.out.println("\nDesea realizar otra compra?");
	}
	
	public static void Opciones_Menu2() {
		System.out.println("\nDesea ticket de la compra? Pulse 1 en el caso de que sea asi, pulse 2 en el caso contrario");
	}
	
	public static void Opciones_Menu3() {
		System.out.println("\nDe acuerdo");

	}


	public static void Mensaje_Fin() {

		System.out.println("---- Gracias por usar este software. ----");
	}
	
}

