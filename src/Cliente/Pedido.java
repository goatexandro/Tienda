package Cliente;
import Logic.Producto;

public class Pedido {
	 int ordenDePedido;
     int codigoCliente;
     Producto producto;
     int cantidad;

    public Pedido(int ordenDePedido, int codigoCliente, Producto producto, int cantidad) {
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

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
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

    
    
}
