package Objetos.UT7.UT7_25;

public class Cancion {
	/**
	 * Atributos de nuestra clase privada.
	 */
	private String titulo;
	private String artista;
	private int duracion;
	/**
	 * Constructor vacio
	 */
	public Cancion() {

	}
	/**
	 * 
	 * @param titulo de la canción.
	 * @param artista de la canción.
	 * @param duracion de la canción.
	 */
	public Cancion(String titulo, String artista, int duracion) {
		setTitulo(titulo);
		setArtista(artista);
		setDuracion(duracion);
	}
	/**
	 * Getter del titulo.
	 * @return
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * Getter del titulo.
	 * @return
	 */
	public String getArtista() {
		return artista;
	}
	/**
	 * Getter de la duración.
	 * @return
	 */
	public int getDuracion() {
		return duracion;
	}
	/**
	 * Setter del título.
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * Setter del artista
	 * @param artista de la canción.
	 */
	public void setArtista(String artista) {
		this.artista = artista;
	}
	/**
	 * Setter de la duración.
	 * @param duracion de la canción.
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	/**
	 * Método toString.
	 */
	@Override
	public String toString() {
		return this.titulo + " - " + this.artista + " (" + this.duracion + " minuto/s)";
	}
	/**
	 * Método reproducir.
	 * @return
	 */
	public String reproducir() {
		return "Reproduciendo..." + this.titulo;
	}
}