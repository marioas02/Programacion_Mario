package UT6_22;

public class Libro {

	//Atributos
	private String titulo;
	private String autor;
	private int ejemplares;
	private int prestados;
	
	// Construcutor vacior
	public Libro(){
		
	}
	
	// Constructores
	public Libro(String titulo, String autor, int ejemplares, int prestados) {
		setTitulo(titulo);
		setAutor(autor);
		setEjemplares(ejemplares);
		setPrestados(prestados);
	}
	// Getters
	public String getTitulo() {
		return this.titulo;
	}
	public String getAutor() {
		return this.autor;
	}
	public int getEjemplares() {
		return this.ejemplares;
	}
	public int getPrestados() {
		return this.prestados;
	}
	
	// Setters
	public void setTitulo(String titulo) {
		
	}
	public void setAutor(String autor) {
		
	}
	public void setEjemplares(int ejemplares) {
	
	}
	public void setPrestados(int prestados) {
		
	}
	
	// Métodos y funciones
	public int prestamo() {
		if(prestados<ejemplares)
			
		return prestados;
	}
	public int devolucion() {
		
	}
	
}
