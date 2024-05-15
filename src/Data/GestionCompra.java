package Data;

import java.util.Scanner;

import Error.NoBanco;
import Error.NoTarjeta;

public class GestionCompra {
	Scanner sc=new Scanner(System.in);
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
}
