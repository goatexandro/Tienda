package Logic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import Error.NoBanco;
import Error.NoTarjeta;
import Error.NoTelefono;
import Producto.Pedido;

public class Compra {
	Scanner sc = new Scanner(System.in);
	
	/**	
		TreeMap<Integer, Producto> listaProductos = new TreeMap<>();
		Producto disco1 = new Musica(1, "Portishead", 18.53, 6, true, "Trip Hop");
		Producto disco2 = new Musica(2, "Radiohead", 21.2, 20, true, "Rock");
		Producto cine1 = new Cine(3, "Willy Wonka", 30.2, 5, true, "Fantasía");
		Producto juego1 = new Videojuego(8, "Mario Bross", 35.11, 0, false, "Plataformas");

		listaProductos.put(1, disco1);
		listaProductos.put(2, disco2);
		listaProductos.put(3, cine1);
		listaProductos.put(4, juego1);

		ArrayList<Cliente> clientes = new ArrayList<>();
		ArrayList<Pedido> pedidos = new ArrayList<>();

		System.out.println("Buenos dias, indique su nombre por favor");

		String nombrec = sc.nextLine();
		System.out.println("Sus apellidos");
		String apellidos = sc.nextLine();
		System.out.println("Cual es su direccion");
		String direccion = sc.nextLine();
		System.out.println("Cual es su localidad");
		String localidad = sc.nextLine();
		System.out.println("Cual es su provincia");
		String provincia = sc.nextLine();
		System.out.println("Cual es su pais");
		String pais = sc.nextLine();
		System.out.println("Cual es su codigo postal");
		String codigo_postal = sc.nextLine();
		System.out.println("Cual es tu numero de cliente");
		int numero = sc.nextInt();
sc.nextLine();
		System.out.println("Hola, " + nombrec
				+ " danos su numero de telefono");
		String telefono = null;
		try {
			telefono = sc.nextLine();
			NoTelefono t = new NoTelefono(telefono);
			t.TelefonoError(telefono);
		} catch (NoTelefono e) {
			System.err.println("Error: " + e.getMessage());
			sc.close();
		}

		sc.nextLine();
		System.out.println("Perfecto, ahora por favor dinos tu email");
		String email = sc.nextLine();
**/
	public void pago() {
		System.out.println(
				"Por favor dinos que prefieres: ¿tarjeta (Escribe 'Tarjeta' con la mayúscula) o el número de cuenta bancaria (IBAN en mayúscula)?");
		String metodo_pago = sc.nextLine();

		if (metodo_pago.equals("Tarjeta")) {
			System.out.println("Introduzca su numero de tarjeta por favor");
			String codigot = null;
			try {
				codigot = sc.nextLine();
				NoTarjeta codigo = new NoTarjeta(codigot);
				codigo.error_t(codigot);
			} catch (NoTarjeta e) {
				System.err.println("Error: " + e.getMessage() + ", vuelve a intentarlo desde el principio ");
				sc.close();
				sc.nextLine();
			}
			System.out.println("De acuerdo su numero de tarjeta es " + codigot);

		} else if (metodo_pago.equals("IBAN")) {
			System.out.println("Introduzca su IBAN por favor");
			String codigob = null;
			try {

				codigob = sc.nextLine();
				NoBanco IBAN = new NoBanco(codigob);
				IBAN.banco(codigob);
			} catch (NoBanco e) {
				System.err.println("Error: " + e.getMessage() + ", vuelve a intentarlo desde el principio ");
				sc.close();
				sc.nextLine();
			}
			System.out.println("De acuerdo su numero de banco es ES" + codigob);

			
		} else {
			System.err.println("ERROR DEBE ESCRIBIR TARJETA O IBAN");
			sc.close();
		}
	}
		/**
int c=0;
		System.out.println("Dime su observacion");
		String observaciones = sc.nextLine();
		Cliente cliente1 = new Cliente(c, numero, nombrec, apellidos, direccion, localidad, provincia, pais,
				codigo_postal, telefono, email, observaciones);
		clientes.add(cliente1);
		
		System.out.println("¿Qué cantidad desea?");
		int cantidad = sc.nextInt();
		sc.nextLine();

		System.out.println("¿Cual es la orden del pedido?");
		int orden = sc.nextInt();
		sc.nextLine();

		System.out.println("¿De que producto? Escriba un numero porfavor");
		int codigo = sc.nextInt();
		Producto codigo1 = null;
		Iterator<Map.Entry<Integer, Producto>> iterator = listaProductos.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, Producto> entry = iterator.next();
			Producto producto = entry.getValue();
			if (producto.getCodigoproducto() == codigo) {
				codigo1 = entry.getValue();

			}

		}
		sc.next();

		Pedido pedido1 = new Pedido(orden, cliente1, codigo1, cantidad);
		pedidos.add(pedido1);

		recorrerArrayList(pedidos);
		sc.close();

		Compra.recorrerArrayListClientes(clientes);
		cliente1.insertarCliente();
		pedido1.insertarPedido();

		Compra.mostrarCaja(pedidos);

	}

	// 3333333333333333333333

	**/
	public static void mostrarCaja(ArrayList<Pedido> listaPedidos) {
		if (listaPedidos == null) {
			return;
		}
		double total = 0.0;

		for (Pedido pedido : listaPedidos) {
			total += pedido.getCodigoproducto().getPrecioUnit() * pedido.getCantidad();
		}

		System.out.println("Importe total de la compra actual: " + total);
	}
	}
	/**public static void recorrerArrayList(ArrayList<Pedido> listaPedidos) {
		for (Pedido pedido : listaPedidos) {
			System.out.println("PEDIDO");

			System.out.println("Pedido del cliente: " + pedido.getCodigo().getNombre());
			System.out.println("Producto: " + pedido.getCodigoproducto().getCodigoproducto());
			System.out.println("Cantidad: " + pedido.getCantidad());
		}
	}

	public static void recorrerArrayListClientes(ArrayList<Cliente> listaClientes) {
		for (Cliente cliente : listaClientes) {
			System.out.println("CLIENTE");

			System.out.println("Nombre: " + cliente.getNombre());
			System.out.println("Apellidos: " + cliente.getApellidos());
			System.out.println("Dirección: " + cliente.getDireccion());
			System.out.println("Localidad: " + cliente.getLocalidad());
			System.out.println("Provincia: " + cliente.getProvincia());
			System.out.println("País: " + cliente.getPais());
			System.out.println("Código Postal: " + cliente.getCodigoPostal());
			System.out.println("Teléfono: " + cliente.getTelefono());
			System.out.println("Email: " + cliente.getMail());
			System.out.println("Observaciones: " + cliente.getObservaciones());
			System.out.println("----------------------------------");
		}
	}

}**/
