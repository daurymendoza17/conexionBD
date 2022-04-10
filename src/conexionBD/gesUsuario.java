package conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class gesUsuario {

	
	public static  Usuario getUsuario(Usuario usu) {
	
	Usuario usuario = null; 
	
	Connection conex = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	try {
		
		conex = conexion.getConexion();
		
		String sql = "select*from usuario where Nombre_usuario = ? and Contraseña = ?";
		
		pst = conex.prepareStatement(sql);
		
		pst.setString(1, usu.getNombre_usuario());
		pst.setString(2, usu.getContraseña());
		
		rs = pst.executeQuery();
       
		while (rs.next()) {
			usuario = new Usuario(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
			
		}
		
	} catch (Exception e) {
	  System.out.println("Error al obtener usuario");	
  	}
	
	
	return usuario;
		
		}
	
   public static Usuario setUsuario(Usuario usua) {
	   
	   Usuario usuarioo = null;
	   
	    Connection conex = null;
		PreparedStatement pst = null;
		int rs = 0;
		
		try {
			
			conex = conexion.getConexion();
			
			String sql = "insert into usuario values (?,?,?,?,?,?,?)";
			
			pst = conex.prepareStatement(sql);
			
			pst.setString(1, usua.getNombre_usuario());
			pst.setString(2, usua.getNombre());
			pst.setString(3, usua.getApellido());
			pst.setString(4, usua.getTelefono());
			pst.setString(5, usua.getCorreo());
			pst.setString(6, usua.getContraseña());
			pst.setString(7, usua.getConfirmar_contraseña());
			
			rs = pst.executeUpdate();
	       
			//while (rs.next()) {
				//usuarioo = new Usuario(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
				
			//}
			
		} catch (Exception e) {
		  System.out.println("Error al registrar");	
	  	}
		
		return usuarioo;
		
	   
	   
	   
	   
   }
	
	
	
	

}
