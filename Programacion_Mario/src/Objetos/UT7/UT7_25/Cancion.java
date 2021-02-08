package Objetos.UT7.UT7_25;

public class Cancion {
	private String titulo;
	private String artista;
	private int duracion;

	public Cancion() {

	}

	public Cancion(String titulo, String autor, int duracion) {
		setTitulo(titulo);
		setArtista(artista);
		setDuracion(duracion);
	}

	public String getTitulo() {
		return titulo;
	}

	public String getArtista() {
		return artista;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return this.titulo + " - " + this.artista + " (" + this.duracion + " minutos)";
	}
}