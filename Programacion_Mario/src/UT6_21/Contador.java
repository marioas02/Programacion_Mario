package UT6_21;

public class Contador {
	// Atributos
	private int cont = 0;

	// Constricutor vacio
	public Contador() {

	}

	// Constructores
	public Contador(int cont) {
		setContador(cont);
	}

	public Contador(Contador c1) {
		setContador(c1.getContador());
	}

	// Setters
	public void setContador(int cont) {
		if (cont < 0)
			cont = 0;
		this.cont = cont;
	}

	// Getters
	public int getContador() {
		return cont;
	}

	// Métodos
	public void aumentar() {
		cont++;
	}

	public void disminuir() {
		cont--;
		if (cont < 0)
			cont = 0;
	}
}
