package Logic;
/**
 * 
 */

/**
 * @author Pedro
 *
 */
public abstract class Producto {

	// Atributos
	
	//tuve q añadirle codigo para poder utilizar pedido correctamente
	private String nombre;
	private double precioUnit;
	private int cantStock;
	private boolean disponible = false;
	public static int dimesionArray;

	// Constructores
	/**
	 * 
	 */
	public Producto() {

	}

	/**
	 * Constructor clase producto con 4 parametros
	 * 
	 * @param nombre
	 * @param precioUnit
	 * @param cantStock
	 * @param disponible
	 */
	public Producto( String nombre, double precioUnit, int cantStock, boolean disponible) {

	
		this.nombre = nombre;
		this.precioUnit = precioUnit;
		this.cantStock = cantStock;
		this.disponible = disponible;

		// Se obtiene con esta variable la dimensión del array. Según número de
		// instancias del constructor
		dimesionArray++;
	}

	/**
	 * Nos devuelve si hay stock de un producto o no
	 * 
	 * @return
	 */
	public boolean isDisponible() {
		if (getCantStock() > 0) {
			this.disponible = true;
		}
		return this.disponible;
	}

	// Métodos Get and Set

	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return
	 */
	public double getPrecioUnit() {
		return this.precioUnit;
	}

	/**
	 * 
	 * @param precioUnit
	 */
	public void setPrecioUnit(double precioUnit) {
		this.precioUnit = precioUnit;
	}

	/**
	 * 
	 * @return
	 */
	public int getCantStock() {
		return this.cantStock;
	}

	/**
	 * 
	 * @param cantStock
	 */
	public void setCantStock(int cantStock) {
		this.cantStock = cantStock;
	}

	/**
	 * 
	 * @param disponible
	 */
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	
	}

	
	

