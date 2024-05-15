package Data;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import Logic.Cliente;
import BDD.Conexion;
import Error.NoTelefono;
import Logic.Cliente;


public class GestionCliente {
	
	Scanner sc=new Scanner(System.in);
	public void creararCliente() {
		ArrayList <Cliente> clientes= new ArrayList<>();

		
		System.out.println("Buenos dias, indique su codigo porfavor");

		int codigo;

		codigo = sc.nextInt();
		
		
		System.out.println("Indique su numeroCliente porfavor");
		
		int numeroCliente = 0;

		codigo = sc.nextInt();
		
		
		System.out.println("Ahora su nombre porfavor");
		
		String nombrec;

		nombrec = sc.next();

		
		
		
		
		
		System.out.println("Su apellido");
		String apellido;

		apellido = sc.next();

		
		System.out.println("direccion");
		String direccion;

		direccion = sc.next();

		
		System.out.println("localidad");
		String localidad;

		localidad = sc.next();

		
		System.out.println("provincia");
		String provincia;

		provincia = sc.next();

		
		System.out.println("pais");
		
		String pais;

		pais = sc.next();


		System.out.println("codigoPostal");
		
		String codigoPostal;

		codigoPostal = sc.next();

		
		System.out.println("telefono");
		
		String telefono = null;
		try {
			telefono = sc.next();

			NoTelefono t = new NoTelefono(telefono);
			t.TelefonoError(telefono);
		} catch (NoTelefono e) {
			System.err.println("Error: " + e.getMessage());
			sc.close();
		}
		sc.nextLine();
		
		
		System.out.println("mail");
		
		String mail;

		mail = sc.next();

		
		System.out.println("observaciones");
		
		String observaciones;

		observaciones = sc.next();
		
		Cliente cliente1=new Cliente(codigo, numeroCliente, nombrec, apellido, direccion, localidad, provincia, pais, codigoPostal, telefono, mail, observaciones);

		clientes.add(cliente1);
	}

	
	public void insertarCliente() {
        Conexion conexion = new Conexion();
        Connection cn = null;
        PreparedStatement ps = null;

        String insertSQL = "INSERT INTO cliente (codigoCliente, numero_cliente, nombre, apellidos, direccion, localidad, provincia, pais, codigo_postal, telefono, mail, observaciones) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            cn = conexion.conectar();
            ps = cn.prepareStatement(insertSQL);
            
       
            ps.setInt(1, Cliente.codigo);
            
				ps.setInt(2, Cliente.numeroCliente);
			
            ps.setString(3, Cliente.nombre);
            ps.setString(4, Cliente.apellidos);
            ps.setString(5, Cliente.direccion);
            ps.setString(6, Cliente.localidad);
            ps.setString(7, Cliente.provincia);
            ps.setString(8, Cliente.pais);
            ps.setString(9, Cliente.codigoPostal);
            ps.setString(10, Cliente.telefono);
            ps.setString(11, Cliente.mail);
            ps.setString(12, Cliente.observaciones);
            
        
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
