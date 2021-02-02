package Objetos.UT7.UT7_24;

public class NIF {
	private int DNI;
	private char letra;
	
	public NIF() {
		DNI=0;
		letra=' ';
	}
	
	public NIF(int DNI) {
		this.DNI=DNI;
		this.letra=calcularLetra();
	}
	public int getDNI() {
		return DNI;
	}
	public void setDNI(int DNI) {
		this.DNI = DNI;
		this.letra=calcularLetra();
	}
	private char calcularLetra() {
        char[] letras = {'T','R','W','A','G','M','Y','F','P',
        		'D','X','B','N','J','Z','S','Q','V','H','L',
        		'C','K','E'};
        return letras[DNI % 23];
    }
	@Override
	public String toString() {
		return String.format("%08d", DNI)+'-'+letra;
	}

	
}
