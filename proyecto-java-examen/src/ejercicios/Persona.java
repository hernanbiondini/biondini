package ejercicios;

import java.util.Date;

public class Persona {
	 
	
	private TipoDocumento docTipo; 
	private int numeroDocumento;
	private String nombre;
	private String apellido;
	private Date fechaNacimiento;

	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public TipoDocumento getDocTipo() {
		return docTipo;
	}



	public void setDocTipo(TipoDocumento docTipo) {
		this.docTipo = docTipo;
	}



	public int getNumeroDocumento() {
		return numeroDocumento;
	}


	public void setNumeroDocumento(int numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
}
