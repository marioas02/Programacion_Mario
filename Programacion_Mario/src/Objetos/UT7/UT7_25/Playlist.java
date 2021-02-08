package Objetos.UT7.UT7_25;

import java.util.ArrayList;

public class Playlist {
	ArrayList<Cancion> canciones;
	@SuppressWarnings("unused")
	private String nombre;
	

	public Playlist() {
		canciones = new ArrayList<Cancion>();
	}

	public Playlist(String nombre) {
		this.nombre = nombre;
		canciones = new ArrayList<Cancion>();
	}
	
	public void anadirCancion(String titulo, String artista, int duracion) {
		canciones.add(new Cancion(titulo, artista, duracion));
	}
	
//	public
	
	public int obtieneTotalCanciones() {
		int contador;
		contador = canciones.size();
		return contador;
	}
	
//	public int totalDuracionPlaylist() {
//		int total = 0;
//		for(Cancion cancion: canciones) {
//			total += cancion.duracion;
//		}
//		return total;
//	}
}
