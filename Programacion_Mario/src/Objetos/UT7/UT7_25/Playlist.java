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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void anadirCancion(String titulo, String artista, int duracion) {
		canciones.add(new Cancion(titulo, artista, duracion));
	}

	public Cancion obtieneCancion(int posicion) {
		return canciones.get(posicion);
	}

	public int obtieneTotalCanciones() {
		int contador;
		contador = canciones.size();
		return contador;
	}

	public StringBuilder mostrarPlaylist() {
		StringBuilder cancion = new StringBuilder("");
		for (int i = 0; i < canciones.size(); i++) {
			cancion.append(canciones.get(i).toString());
			cancion.append("\n");
		}
		return cancion;
	}

	public int totalDuracionPlaylist() {
		int total = 0;
		for(Cancion c: canciones) {
			total+=c.getDuracion();
		}
		return total;
	}
	
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
	
	public void reproducirCancion(int posicion) {
		canciones.get(posicion).reproducir();
	}
	
	public String reproducirCancion1(int posicion) {
		return canciones.get(posicion).reproducir();
	}

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
	
	public Cancion encontrarCancionPorTitulo(String nombre) {
		
		return null;
		
	}
	
//	for(int i=0; i<libros.size(); i++) {
//		if(libros.get(i).getTitulo().equals(titulo)) {
//			libros.remove(i).getTitulo().equals(titulo);
//			System.out.println("Borrado.");
//		}else {
//			System.out.println("Libro no encontrado.");
//		}
//	}
	
	
	
	
}
