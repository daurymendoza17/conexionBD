package conexionBD;

public class Usuario {
	private String Nombre_usuario;
	private String Nombre;
	private String Apellido;
	private String Telefono;
	private String Correo;
	private String Contraseña;
	private String Confirmar_contraseña;

	public Usuario(String nombre_usuario, String nombre, String apellido, String telefono, String correo,
			String contraseña, String confirmar_contraseña) {

		Nombre_usuario = nombre_usuario;
		Nombre = nombre;
		Apellido = apellido;
		Telefono = telefono;
		Correo = correo;
		Contraseña = contraseña;
		Confirmar_contraseña = confirmar_contraseña;
	}

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre_usuario() {
		return Nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		Nombre_usuario = nombre_usuario;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public String getContraseña() {
		return Contraseña;
	}

	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}

	public String getConfirmar_contraseña() {
		return Confirmar_contraseña;
	}

	public void setConfirmar_contraseña(String confirmar_contraseña) {
		Confirmar_contraseña = confirmar_contraseña;
	}

}
