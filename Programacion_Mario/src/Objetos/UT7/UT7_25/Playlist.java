package Objetos.UT7.UT7_25;

import java.util.ArrayList;

public class Playlist {
	ArrayList<Cancion> canciones;
	String nombre;

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

	public String obtieneCancion(int posicion) {
		return canciones.get(posicion).toString();
	}

	public int obtieneTotalCanciones() {
		int contador;
		contador = canciones.size();
		return contador;
	}

//	@SuppressWarnings("unused")
	public StringBuilder mostrarPlaylist() {
		
		StringBuilder cancion1 = null;
		
		StringBuilder cancion = null;
		for (int i = 0; i < canciones.size(); i++) {
			cancion = cancion1.append(canciones.get(i).toString());
		}
		return cancion;
//		for (int i = 0; i < canciones.size(); i++) {
//			cancion = canciones.get(i).toString();
//		}
//		return cancion;
		
	}

//	public int totalDuracionPlaylist() {
//		int total = 0;
//		for(Cancion cancion: canciones) {
//			total += cancion.duracion;
//		}
//		return total;
//	}
}
