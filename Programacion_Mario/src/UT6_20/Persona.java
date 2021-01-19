/**
 * 
 */
package UT6_20;

/**
 * @author magui Clase persona con nombre,
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
	public String getApillidos() {
		return this.apellidos;
	}
	public int getAnioNacimiento() {
		return this.anioNacimiento;
	}
	public int getMesNacimiento() {
		return this.mesNacimiento;
	}
	public int getDiaNacimiento() {
		return this.diaNacimiento;
	}
	public char getSexo() {
		return this .sexo;
	}

	//Setters
	public void setNombre(String nombre) {
		//Convierto el nombre a palabra con la primera en mayusculas
		nombre = toUpperPrimeraLetra(nombre);
		if(nombre.length()<4)
			nombre="Sin especificar";
		
		this.nombre = nombre;
	}
	public void setApellidos(String apellidos) {
		//Convierto el nombre a palabra con la primera en mayusculas
		nombre = toUpperPrimeraLetra(nombre);
		if(nombre.length()<4)
			nombre="Sin especificar";
		
		this.nombre = nombre;
	}
	
	public void setAnio(int anio) {
		if(anio<1900 || anio>2020)
			anio = 2000;
		
		this.anioNacimiento = anio;
	}
	
	public void setMes(int mes) {
		if(mes<1 || mes>12)
			mes = 1;
		
		this.mesNacimiento = mes;
	}
	
	public void setDia(int dia) {
		if(dia<1 || dia>31)
			dia = 1;
		
		this.diaNacimiento = dia;
	}
	
	private String toUpperPrimeraLetra(String palabra) {
		String npropio = palabra;
		//TODO implementar funcion
		
		return npropio;
	}
}
