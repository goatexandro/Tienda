package Error;

public class NoBanco extends Exception{
	public NoBanco(String message) {
		super(message);
	}

	
	public void banco(String banco) throws NoBanco{
		if(banco.length()>22 || banco.length()<22){
			throw new NoBanco("Numero de IBAN invalido,debe tener 22 caracteres");
			
		}if(!banco.matches("[0-9]+")) {
			throw new NoBanco("El numero de banco solo permite numeros");
		}
	}
}
