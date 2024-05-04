package Cliente;
import java.util.ArrayList;

import Logic.Producto;

public class Pedido {
	ArrayList<Pedido> pedidos=new ArrayList<>();
	
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

    
    
}
