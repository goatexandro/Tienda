package Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import BDD.Conexion;
import Logic.Producto;

public class Pedido {
	ArrayList<Pedido> pedidos = new ArrayList<>();

	int ordenDePedido;
	Cliente codigoCliente;
	Producto producto;
	int cantidad;

	public Pedido(int ordenDePedido, Cliente codigoCliente, Producto producto, int cantidad) {
		this.ordenDePedido = ordenDePedido;
		this.codigoCliente = codigoCliente;
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public int getOrdenDePedido() {
		return ordenDePedido;
	}

	public void setOrdenDePedido(int ordenDePedido) {
		this.ordenDePedido = ordenDePedido;
	}

	public Cliente getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(Cliente codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public char[] getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	public void insertarPedido() {
		Conexion conexion = new Conexion();
		Connection cn = null;
		PreparedStatement ps = null;

		String insertSQL = "INSERT INTO pedido (ordenDePedido,  codigoCliente,  producto,  cantidad) VALUES (?, ?, ?, ?)";

		try {
			cn = conexion.conectar();
			ps = cn.prepareStatement(insertSQL);

			ps.setInt(1, ordenDePedido);
			ps.setInt(2, codigoCliente.getCodigo());
			ps.setString(3, producto.getNombre());
			ps.setInt(4, cantidad);

			ps.executeUpdate();
			System.out.println("Pedido insertado correctamente en la base de datos.");
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
