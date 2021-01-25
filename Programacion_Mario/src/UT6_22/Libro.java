package UT6_22;

public class Libro {

	// Atributos
	private String titulo;
	private String autor;
	private int ejemplares;
	private int prestados;

	// Construcutor vacior
	public Libro() {

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
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public int getPrestados() {
		return prestados;
	}

	// Setters
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public void setPrestados(int prestados) {
		this.prestados = prestados;
	}

	// Métodos y funciones
	public boolean prestamo() {
		boolean p = false;
		if (prestados < ejemplares) {
			p = true;
			prestados++;
		} else {
			p = false;
		}
		return p;
	}

	public boolean devolucion() {
		boolean p = false;
		if (prestados > 0) {
			p = true;
			prestados--;
		} else {
			p = false;
		}

		return p;
	}

}
