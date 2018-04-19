package agenda;

public class Contacto {
	private String nombre;
	private String apellidos;
	private String email;
	private String telefono;
	private String FechaDeNacimiento;

	public Contacto(String _nombre, String _apellidos, String _email, String _telefono, String _FechaDeNacimiento) {
		this.nombre = _nombre;
		this.apellidos = _apellidos;
		this.email = _email;
		this.telefono = _telefono;
		this.FechaDeNacimiento = _FechaDeNacimiento;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFechaDeNacimiento() {
		return FechaDeNacimiento;
	}

	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		FechaDeNacimiento = fechaDeNacimiento;
	}

}
