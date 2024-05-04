package Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import BDD.Conexion;

public class Cliente {
	ArrayList <Cliente> clientes= new ArrayList<>();
	
	int codigo;
	int numeroCliente;
	String nombre;
	String apellidos;
	String direccion;
	String localidad;
	String provincia;
	String pais;
	String codigoPostal;
	String telefono;
	String mail;
	String observaciones;

	public Cliente(int codigo, int numeroCliente, String nombre, String apellidos, String direccion, String localidad,
			String provincia, String pais, String codigoPostal, String telefono, String mail, String observaciones) {

		this.codigo=codigo;
		this.numeroCliente = numeroCliente;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.localidad = localidad;
		this.provincia = provincia;
		this.pais = pais;
		this.codigoPostal = codigoPostal;
		this.telefono = telefono;
		this.mail = mail;
		this.observaciones = observaciones;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public void insertarCliente() {
        Conexion conexion = new Conexion();
        Connection cn = null;
        PreparedStatement ps = null;

        String insertSQL = "INSERT INTO cliente (codigo, numero_cliente, nombre, apellidos, direccion, localidad, provincia, pais, codigo_postal, telefono, mail, observaciones) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            cn = conexion.conectar();
            ps = cn.prepareStatement(insertSQL);
            
       
            ps.setInt(1, codigo);
            ps.setInt(2, numeroCliente);
            ps.setString(3, nombre);
            ps.setString(4, apellidos);
            ps.setString(5, direccion);
            ps.setString(6, localidad);
            ps.setString(7, provincia);
            ps.setString(8, pais);
            ps.setString(9, codigoPostal);
            ps.setString(10, telefono);
            ps.setString(11, mail);
            ps.setString(12, observaciones);
            
        
            ps.executeUpdate();
            System.out.println("Cliente insertado correctamente en la base de datos.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) ps.close();
                if (cn != null) cn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    

	
	
}

