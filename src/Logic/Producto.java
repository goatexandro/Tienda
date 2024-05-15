package Logic;
/**
 * 
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import BDD.Conexion;

/**
 * @author Pedro
 *
 */
public abstract class Producto {

	// Atributos
	
	//tuve q añadirle codigo para poder utilizar pedido correctamente
	private int codigoproducto;
	private String nombre;
	private double precioUnit;
	private int cantStock;
	private boolean disponible = false;
	public static int dimesionArray;

	// Constructores
	/**
	 * 
	 */

	/**
	 * Constructor clase producto con 4 parametros
	 * 
	 * @param nombre
	 * @param precioUnit
	 * @param cantStock
	 * @param disponible
	 */
	public Producto( int codigoproducto, String nombre, double precioUnit, int cantStock, boolean disponible) {

	this.codigoproducto=codigoproducto;
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

	

	public int getCodigoproducto() {
		return codigoproducto;
	}

	public void setCodigoproducto(int codigoproducto) {
		this.codigoproducto = codigoproducto;
	}

	@Override
	public String toString() {
		return "Producto [codigoproducto=" + codigoproducto + ", nombre=" + nombre + ", precioUnit=" + precioUnit
				+ ", cantStock=" + cantStock + ", disponible=" + disponible + "]";
	}

	public void insertarProducto() {
		Conexion conexion = new Conexion();
		Connection cn = null;
		PreparedStatement ps = null;

		String insertSQL = "INSERT INTO producto (codigoproducto, nombre, precioUnit, cantStock) VALUES (?, ?, ?, ?)";

		try {
			cn = conexion.conectar();
			ps = cn.prepareStatement(insertSQL);

			ps.setInt(1,codigoproducto );
			ps.setString(2, nombre);
			ps.setDouble(3, precioUnit);
			ps.setInt(4, cantStock);

			ps.executeUpdate();
			System.out.println("Producto insertado correctamente en la base de datos.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			try {
				if (ps != null)
					ps.close();
				if (cn != null)
					cn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	}

	
	

