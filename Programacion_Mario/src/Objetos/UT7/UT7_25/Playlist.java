package Objetos.UT7.UT7_25;

import java.util.ArrayList;

public class Playlist {
	/**
	 * Atributos.
	 */
	ArrayList<Cancion> canciones;
	String nombre;
	/**
	 * Constructor.
	 */
	public Playlist() {
		canciones = new ArrayList<Cancion>();
	}
	/**
	 * Constructor con parametros.
	 * @param nombre de la Playlist
	 */
	public Playlist(String nombre) {
		this.nombre = nombre;
		canciones = new ArrayList<Cancion>();
	}
	/**
	 * Método para añadir una cancion en la Playlist
	 * @param titulo de la canción
	 * @param artista de la canción
	 * @param duracion de la canción
	 */
	public void anadirCancion(String titulo, String artista, int duracion) {
		canciones.add(new Cancion(titulo, artista, duracion));
	}
	/**
	 * Método que obtiene una canción según su posición.
	 * @param posicion de la canción.
	 * @return
	 */
	public Cancion obtieneCancion(int posicion) {
		return canciones.get(posicion);
	}
	/**
	 * Método que cuenta cuantas canciones hay en la Playlist.
	 * @return
	 */
	public int obtieneTotalCanciones() {
		int contador;
		contador = canciones.size();
		return contador;
	}
	/**
	 * Método que muestra en pantalla todo los datos de
	 * las canciones de la Playlist.
	 * @return
	 */
	public StringBuilder mostrarPlaylist() {
		StringBuilder cancion = new StringBuilder("");
		for (int i = 0; i < canciones.size(); i++) {
			cancion.append(canciones.get(i).toString());
			cancion.append("\n");
		}
		return cancion;
	}
	/**
	 * Método que te dice la duración entera de la Playlist.
	 * @return
	 */
	public int totalDuracionPlaylist() {
		int total = 0;
		for(Cancion c: canciones) {
			total+=c.getDuracion();
		}
		return total;
	}
	/**
	 * Método que reproduce la Playlist entera.
	 * @return
	 */
	public StringBuilder reproducirPlaylist() {
		StringBuilder cancion = new StringBuilder("");
		if(canciones.size()>0) {
			for(int i = 0; i < canciones.size(); i++) {
				cancion.append(canciones.get(i).reproducir());
				cancion.append("\n");
			}
		}else {
			cancion.append("La playlist no tiene canciones");
		}
		return cancion;
	}
	/**
	 * Método que reproduce una canción segun la posición
	 * que ponga el usuario.
	 * @param posicion de la cancion
	 * @return
	 */
	public String reproducirCancion(int posicion) {
		return canciones.get(posicion).reproducir();
	}
	/**
	 * Método que elimina toda la Playlist.
	 */
	public void limpiarPlaylist() {
		canciones.clear();
	}
	/**
	 * Método que elimina una canción según la posición
	 * que ponga el usuario.
	 * @param posicion de la canción
	 * @return
	 */
	public boolean eliminarCancion(int posicion) {
		if(canciones.size()>0) {
			if(posicion<=canciones.size()) {
				canciones.remove(posicion);
				return true;
			}else {
				return false;
			}		
		}else {
			return false;
		}
	}
	/**
	 * Metódo para encontrar canción por titulo.
	 * @param nombre de la canción.
	 * @return
	 */
	public Cancion encontrarCancionPorTitulo(String nombre) {
		int aux = 0;
		for (int i = 0; i < canciones.size(); i++) {
			if (canciones.get(i).getTitulo().equals(nombre)) {
				aux = i;
			}
		}
		return canciones.get(aux);
	}
	/**
	 * Método para encontrar canciones según su artista.
	 * @param artista de las canciones.
	 * @return
	 */
	public ArrayList<Cancion> encontrarCancionesPorArtista(String artista) {
		ArrayList<Cancion> artistacancion = new ArrayList<Cancion>();
		for(int i = 0; i < canciones.size(); i++) {
			if(canciones.get(i).getArtista().equals(artista)) {
				artistacancion.add(new Cancion(canciones.get(i).getTitulo(),
						canciones.get(i).getArtista(),
						canciones.get(i).getDuracion()));
			}
		}
		return artistacancion;
	}
}