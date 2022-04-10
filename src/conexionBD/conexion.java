package conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class conexion {
	
	public static Connection getConexion() {
		
		Connection conex = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/usuarios";
			String usuario = "root" ;
			String contraseña = "100224857" ;
			
			conex = DriverManager.getConnection(url, usuario, contraseña); 
			
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador");
			
			e.printStackTrace();
			
		} catch (SQLException e) {
			System.out.println("Error al al establecer la conexion");

			
			e.printStackTrace();
			
		}
		
		return conex;
	}
	
	public static ResultSet getTable(String Consulta) {
		
		Connection conex = getConexion();
		Statement st;
		ResultSet datos = null;
		
		try {
			st = conex.createStatement();
			datos = st.executeQuery(Consulta);
			
		} catch (Exception e) { System.out.println(e.toString());
		
		}
		return datos;
		
	}
	
	
	
	/*private static final String controlador = "com.mysql.jdbc.Driver" ;
	private static final String url = "jdbc:mysql://localhost:3306/usuarios" ;
	private static final String usuario = "root" ;
	private static final String contrase�a = "100224857" ;
	
	
	static {
		try {
		
		Class.forName(controlador);

		}catch(ClassNotFoundException e){
		System.out.print("Error al cargar el controlador");
		e.printStackTrace();
		}
		
	}
	
        public Connection Conectar() {
		Connection conexion = null;
		
		
	
	    try {
			
			conexion = DriverManager.getConnection(url, usuario, contrase�a);
			
			System.out.print("Conexi�n exitosa");

		}catch (SQLException e) {
			System.out.print("Error en la conexi�n");
			e.printStackTrace();
			
		}
	    
	    return conexion;
		
	}*/

		
}


