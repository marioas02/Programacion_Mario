/**
 * 
 */
package UT6_20;

/**
 * @author Mario 
 * Clase de PERSONA.
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
		setNombre(nombre);
		setApellidos(apellidos);
		setAnio(anio);
		setMes(mes);
		setDia(dia);
		setSexo(sexo);
	}
	
	//Getter públicos para todos los atributos
	public String getNombre() {
		return this.nombre;
	}
	public String getApellidos() {
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
	public int getEdad() {
		int edad = java.time.LocalDate.now().getYear() - this.anioNacimiento;
		return edad;
	}

	//Setters públicos para todos los atributos
	public void setNombre(String nombre) {
		//Convierto el nombre a palabra con la primera en mayusculas
		nombre = toUpperPrimeraLetra(nombre);
		//Si es menor que 4, uso sin especificar
		if(nombre.length()<4)
			nombre="Sin especificar";
		
		this.nombre = nombre;
	}
	public void setApellidos(String apellidos) {
		//Convierto la primera letra de cada apellido en mayuscula si es que hay
		apellidos = convertirNombresPropios(apellidos);
		
		//Si es menor que 4, uso sin especificar
		if(apellidos.length() < 4 )
			apellidos="Sin especificar";
		
		this.apellidos = apellidos;
	}
	public void setAnio(int anio) {
		//Verifico que no sea menor que 1900 o mayor que 2020
		if(anio<1900 || anio>2020)
			anio = 2000;
		
		this.anioNacimiento = anio;
	}
	public void setMes(int mes) {
		//Verifico que no sea menor que 1 o mayor que 12
		if(mes<1 || mes>12)
			mes = 1;
		
		this.mesNacimiento = mes;
	}
	public void setDia(int dia) {
		//Verifico que no sea menor que 1 o mayor que 31
		if(dia<1 || dia>31)
			dia = 1;
		
		this.diaNacimiento = dia;
	}
	public void setSexo(char sexo) {
		//Verifico que no sea otro caracter entre H o M
		if (sexo != 'H' || sexo != 'M')
			sexo = 'X';
		
		this.sexo = sexo;
	}
	
	//Métodos y funciones
	public String mostrarEdad() {
		return "En la actualidad tengo "+getEdad()+" años";
	}
	public String saludar() {
		return "Hola soy "+this.nombre+" "+this.apellidos+" y naci el "+this.diaNacimiento+"/"+this.mesNacimiento+"/"+this.anioNacimiento;
	}
	private String toUpperPrimeraLetra(String palabra) {
		String npropio = palabra;
		String letra=palabra.substring(0,1).toUpperCase();
		npropio=letra+npropio.substring(1);
	
		return npropio;
	}
	private String convertirNombresPropios(String nombrespropios) {
		//Convierto los apellidos en un array de strings separandolo por espacios
		String[] array_propios = nombrespropios.split(" ");

		//Convierto cada elemento del array , en una palabra con la primera en mayusculas
		for (int i=0;i<array_propios.length;i++)
			array_propios[i] = toUpperPrimeraLetra(array_propios[i]);

		//Creo la cadena de apellidos ya formateada concatenando los apellidos del array
		String nombres_formateado = "";
		for (int i=0;i<array_propios.length;i++)
			nombres_formateado = nombres_formateado + array_propios[i] +" ";

		return nombres_formateado;
	}
}
