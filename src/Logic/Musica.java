/**
 * 
 */
package Logic;

/**
 * @author Pedro
 *
 */
public class Musica extends Producto {

	// Atributo
	private String genero;
	private String autor;// Autor de la canción

	// Constructores
	public Musica() {

	}

	public Musica(String nombre, double precioUnit, int cantStock, boolean disponible, String genero) {
		super(nombre, precioUnit, cantStock, disponible);
		this.genero = genero;
	}

	// Methods
	@Override
	public String toString() {
		return "PRODUCTO MUSICA\n" + "Genero: " + this.genero;
	}

	// Gets and Sets
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
}
