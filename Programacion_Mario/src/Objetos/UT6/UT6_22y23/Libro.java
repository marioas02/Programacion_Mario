package Objetos.UT6.UT6_22y23;

public class Libro {

	/**
	 * Atributos de nuestra clase privada.
	 */
	private String titulo;
	private String autor;
	private int ejemplares;
	private int prestados;
	private int num;
	
	/**
	 * Constructor vacio
	 */
	public Libro() {

	}

	/**
	 * Constructor
	 * @param titulo Nombre del libro.
	 * @param autor Autor del libro.
	 * @param ejemplares Cuantos libros hay.
	 * @param prestados Cuantos libros hay prestados.
	 */
	public Libro(String titulo, String autor, int ejemplares, int prestados) {
		setTitulo(titulo);
		setAutor(autor);
		setEjemplares(ejemplares);
		setPrestados(prestados);
	}

	/**
	 * Getter de titulo
	 * @return
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * Getter del Autor
	 * @return
	 */
	public String getAutor() {
		return autor;
	}
	/**
	 * Getter de Ejemplares
	 * @return
	 */
	public int getEjemplares() {
		return ejemplares;
	}
	/**
	 * Getter de Prestados
	 * @return
	 */
	public int getPrestados() {
		return prestados;
	}
	/**
	 * Setter de titulo
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * Setter del Autor
	 * @param autor
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	/**
	 * Setter de Ejemplares
	 * @param ejemplares
	 */
	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}
	/**
	 * Setter de Prestados
	 * @param prestados
	 */
	public void setPrestados(int prestados) {
		this.prestados = prestados;
	}

	/**
	 * Metodo prestamo el cual calcula si se puede hacer un
	 * prestamo o si no.
	 */
	public boolean prestamo() {
		boolean prestado = false;
		if (prestados < ejemplares) {
			prestado = true;
			prestados++;
		} else {
			prestado = false;
		}
		return prestado;
	}
	
	/**
	 * Metodo devolucion el cual calcula si hay algun prestamo
	 * y lo devuelve si es que se puede.
	 */
	public boolean devolucion() {
		boolean devuelto = false;
		if (prestados > 0) {
			devuelto = true;
			prestados--;
		} else {
			devuelto = false;
		}

		return devuelto;
	}
	
	public int numejemplares() {
		num = this.ejemplares - this.prestados;
		return num;
		
	}
	/**
	 * Metodo toString para pintar en pantalla lo que el usuario
	 * introduce, el titulo, el autor, los prestados y el numero
	 * de ejemplares.
	 */
	@Override
	public String toString() {
		return "Titulo: " + this.titulo + "\nAutor: " + this.autor + "\nEjemplares: " + this.ejemplares
				+ "\nPrestados: " + this.prestados;
	}

}























