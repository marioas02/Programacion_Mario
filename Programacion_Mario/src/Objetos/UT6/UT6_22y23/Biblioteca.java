package Objetos.UT6.UT6_22y23;

import java.util.Scanner;

public class Biblioteca {
	
	private String titulo;
	private String autor;
	private int ejemplares;
	private int prestados;
	
	public Biblioteca() {
		
	}
	
	public Biblioteca(String titulo, String autor, int ejemplares, int prestados) {
		setTitulo(titulo);
		setAutor(autor);
		setEjemplares(ejemplares);
		setPrestados(prestados);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public int getPrestados() {
		return prestados;
	}

	public void setPrestados(int prestados) {
		this.prestados = prestados;
	}

	public String menu1() {
		Scanner Scanner = new Scanner(System.in);
		System.out.println("\nPulsa:\n\t1: Alta Libro.\n\t2: Consultar Libro.\n\t3: Baja Libro.\n\t4: Prestamo Libro.\n\t0: Salir.");
		int opcion = Scanner.nextInt();
		
		Scanner.close();
		return "Ha escogido la Opcion: "+opcion;
		
	}
	
}
