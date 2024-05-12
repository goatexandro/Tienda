/**
 * 
 */
package Logic;

import java.util.Map;

import Producto.Producto;

/**
 * @author Pedro
 *
 */
public class Cine extends Producto {

	// Atributo
	private String genero;


	// Constructores
	

	public Cine( int codigoproducto, String nombre, double precioUnit, int cantStock, boolean disponible, String genero) {
		super( codigoproducto, nombre, precioUnit, cantStock, disponible);
		this.genero = genero;
	}

	// Methods
	@Override
	public String toString() {
		return "PRODUCTO CINE\n" + "Genero: " + this.genero;
	}

	// Gets and Sets
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}


}
