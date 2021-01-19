/**
 * 
 */
package Act20;

/**
 * @author magui
 *
 */
public class Persona {
	//Atributos de la clase privados, no accesibles desde fuera de la clase
	private String nombre;
	private String apellidos;
	private int anioNacimiento;
	private int mesNacimiento;
	private int diaNacimiento;
	private char sexo;

	//Constructor vacio
	public Persona() {
		
	}
	
	//Constructor
	public Persona(String nombre, String apellidos, int anio, int mes, int dia, char sexo) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.anioNacimiento = anio;
		this.mesNacimiento = mes;
		this.diaNacimiento = dia;
		this.sexo = sexo;
	}
	
	//Getter
	public String getNombre() {
		return this.nombre;
	}
	public int getAnio() {
		return this.anioNacimiento;
	}
	// TODO crear resto de getters
	
	//Setters
	public void setNombre(String nombre) {
		if(nombre.length()<4)
			nombre="Sin especificar";
		this.nombre = nombre;
	}
	// TODO crear resto de setters
}


