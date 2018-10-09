package ejercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * A. Crear una clase Persona con los siguientes campos
 * (con sus respectivos getters, setters y constructor)
 * 
 * TipoDocumento - enum (dni/libretacivica) 
 * NroDocumento - Integer
 * Nombre - String
 * Apellido - String
 * FechaNacimiento - Date
 * 
 * B. En el método main de la clase "Ejercicio2" crear una nueva instancia
 * de la clase persona y settearle valores reales con tus datos
 * 
 * 
 * C. En el método main de la clase "Ejercicio 2" imprimir los valores en 
 * consola 
 * (crear método main e imprimir valores) 
 *  
 * @author examen
 *
 */
public class Ejercicio2 {


	public Ejercicio2() {}
		
	public static Date formatStringToDate(String miFecha){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date f = new Date();
		try {
			f = sdf.parse(miFecha);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return f;
	}
		
	public static String formatDateToString(Date miFecha){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String f;
		f = sdf.format(miFecha);
		return f;
	}	
	
	public static void main(String[] args) {
		
		Persona pe = new Persona();
		pe.setNombre("Victor Hernan");
		pe.setApellido("Biondini");
		TipoDocumento td = TipoDocumento.DNI;
		pe.setDocTipo(td);
		pe.setNumeroDocumento(30344290);
		pe.setFechaNacimiento(formatStringToDate("1982-12-13"));
		
		System.out.println("Nombre:" + pe.getNombre());
		System.out.println("Apellido:" + pe.getApellido());
		System.out.println("Tipo Documento:" + pe.getDocTipo());
		System.out.println("Numero Documento:" + pe.getNumeroDocumento());
		System.out.println("Fecha de nacimiento:" + formatDateToString(pe.getFechaNacimiento()));
		
		

	}

	
	
}
