package Error;

public class NoTarjeta extends Exception{
	public NoTarjeta(String message) {
		super(message);
	}

	
	public void error_t(String target) throws NoTarjeta{
		if(target.length()>16 || target.length()<16) {
			throw new NoTarjeta("Numero de tarjeta invalido, debe tener 16 caracteres");
			
		}if(!target.matches("[0-9]+")) {
			throw new NoTarjeta("El numero de tarjeta solo permite numeros");
		}
	}
}
