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
import App.Aplicacion;

public class GestionCliente {

    static Scanner sc = new Scanner(System.in);

    public void crearCliente(Connection cn) {
        ArrayList<Cliente> clientes = new ArrayList<>();

        System.out.println("Buenos días, indique su código por favor");
        int codigo = sc.nextInt();

        System.out.println("Indique su número de cliente por favor");
        int numeroCliente = sc.nextInt();

        sc.nextLine(); // Consumir el salto de línea

        System.out.println("Ahora su nombre por favor");
        String nombre = sc.nextLine();

        System.out.println("Su apellido");
        String apellido = sc.nextLine();

        System.out.println("Dirección");
        String direccion = sc.nextLine();

        System.out.println("Localidad");
        String localidad = sc.nextLine();

        System.out.println("Provincia");
        String provincia = sc.nextLine();

        System.out.println("País");
        String pais = sc.nextLine();

        System.out.println("Código Postal");
        String codigoPostal = sc.nextLine();

        System.out.println("Teléfono");
        String telefono = null;
        try {
            telefono = sc.nextLine();
            NoTelefono t = new NoTelefono(telefono);
            t.TelefonoError(telefono);
        } catch (NoTelefono e) {
            System.err.println("Error: " + e.getMessage());
            sc.close();
            return;
        }

        System.out.println("Mail");
        String mail = sc.nextLine();

        System.out.println("Observaciones");
        String observaciones = sc.nextLine();

        Conexion conexion = new Conexion();
        try (Connection cn1 = conexion.conectar()) {
            seleccionarYGuardarProductos(cn1, codigo, nombre, apellido, direccion);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Cliente cliente = new Cliente(codigo, numeroCliente, nombre, apellido, direccion, localidad, provincia, pais, codigoPostal, telefono, mail, observaciones);
        clientes.add(cliente);
        insertarCliente(cliente);
    }

    public void insertarCliente(Cliente cliente) {
        Conexion conexion = new Conexion();
        Connection cn = null;
        PreparedStatement ps = null;

        String insertSQL = "INSERT INTO cliente (codigo, numero_cliente, nombre, apellidos, direccion, localidad, provincia, pais, codigo_postal, telefono, mail, observaciones) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            cn = conexion.conectar();
            ps = cn.prepareStatement(insertSQL);

            ps.setInt(1, cliente.getCodigo());
            ps.setInt(2, cliente.getNumeroCliente());
            ps.setString(3, cliente.getNombre());
            ps.setString(4, cliente.getApellidos());
            ps.setString(5, cliente.getDireccion());
            ps.setString(6, cliente.getLocalidad());
            ps.setString(7, cliente.getProvincia());
            ps.setString(8, cliente.getPais());
            ps.setString(9, cliente.getCodigoPostal());
            ps.setString(10, cliente.getTelefono());
            ps.setString(11, cliente.getMail());
            ps.setString(12, cliente.getObservaciones());

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

    public static void seleccionarYGuardarProductos(Connection cn, int codigo, String nombre, String apellidos, String direccion) {
        System.out.println("Ingrese los números de los productos seleccionados (separados por coma y sin espacios):");
        String productosSeleccionados = sc.nextLine();

        String ruta = "C:\\Users\\caroa\\OneDrive\\Escritorio\\clase\\entorno\\Tiendai\\out\\ticket.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ruta, true))) {
            writer.write("Código Cliente: " + codigo + "\n");
            writer.write("Nombre Cliente: " + nombre + "\n");
            writer.write("Código Cliente: " + apellidos + "\n");
            writer.write("Código Cliente: " + direccion + "\n");

            writer.write("Productos seleccionados: " + productosSeleccionados + "\n");
            writer.newLine();
            System.out.println("Guardado con exito en " + ruta);
        } catch (IOException e) {
            System.out.println("Error");
            System.out.println(e.getMessage());
        }
    }


	
	
}
