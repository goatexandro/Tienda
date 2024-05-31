/**
 * 
 */
package Data;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap;

import Logic.Cine;
import Logic.Musica;
import Logic.Producto;
import Logic.Videojuego;
import Mensaje.Mensaje;
import App.Aplicacion;
/**
 * @author Pedro
 *
 */

public class GestionProducto {

   
	static Scanner sc = new Scanner(System.in);

 
 public static void mostrarProductosa(Connection con) {
    	
    	String lo="select codigoproducto,nombre, precioUnit, cantStock from producto";
    	try (PreparedStatement statement = con.prepareStatement(lo)) {
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
            	int codigoproducto=resultSet.getInt("codigoproducto");
                String nombre = resultSet.getString("nombre");
                double precioUnitario = resultSet.getDouble("precioUnit");
                int cantidadStock = resultSet.getInt("cantStock");

                System.out.println(
                        "Codigo: "+codigoproducto+" El ombre: " + nombre + ", Precio: $" + precioUnitario + ", Stock: " + cantidadStock + "\n");

            }
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    
 }
 


}

