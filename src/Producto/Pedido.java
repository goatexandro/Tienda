package Producto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import BDD.Conexion;
import Cliente.Cliente;

public class Pedido {
	ArrayList<Pedido> pedidos = new ArrayList<>();

	int ordenDePedido;
	Cliente codigo;
	Producto codigoproducto;
	int cantidad;

	public Pedido(int ordenDePedido, Cliente codigo, Producto codigoproducto, int cantidad) {
		this.ordenDePedido = ordenDePedido;
		this.codigo = codigo;
		this.codigoproducto = codigoproducto;
		this.cantidad = cantidad;
	}

	public int getOrdenDePedido() {
		return ordenDePedido;
	}

	public void setOrdenDePedido(int ordenDePedido) {
		this.ordenDePedido = ordenDePedido;
	}


	public Cliente getCodigo() {
		return codigo;
	}

	public void setCodigo(Cliente codigo) {
		this.codigo = codigo;
	}




	public Producto getCodigoproducto() {
		return codigoproducto;
	}

	public void setCodigoproducto(Producto codigoproducto) {
		this.codigoproducto = codigoproducto;
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

		String insertSQL = "INSERT INTO pedido (ordenDePedido,  codigo,  codigoproducto,  cantidad) VALUES (?, ?, ?, ?)";

		try {
			cn = conexion.conectar();
			ps = cn.prepareStatement(insertSQL);

			ps.setInt(1, ordenDePedido);
			ps.setInt(2, codigo.getCodigo());
			ps.setInt(3, codigoproducto.getCodigoproducto());
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
