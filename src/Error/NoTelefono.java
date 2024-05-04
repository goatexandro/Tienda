package Error;

public class NoTelefono extends Exception{
	public NoTelefono(String message) {
		super(message);
	}

	public void TelefonoError(String t) throws NoTelefono{
		if(t.length()>9 || t.length()<9) {
			throw new NoTelefono("El numero de telefono debe de tener 9 digitos");
		}if(!t.matches("[0-9]+")) {
			throw new NoTelefono("El numero de telefono solo permite numeros");
		}
	}	
	
	
}
