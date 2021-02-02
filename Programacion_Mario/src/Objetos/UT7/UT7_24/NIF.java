package Objetos.UT7.UT7_24;

import java.util.ArrayList;

import Objetos.UT6.UT6_22y23.Libro;

public class NIF {
	private int DNI;
	private char letra;
	
	public NIF() {
		setDNI(DNI);
		setLetra(letra);
	}
	
	public NIF(int DNI, char letra) {
		
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int DNI) {
		this.DNI = DNI;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}
	
	private char calcularLetra() {
        char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        return letras[DNI % 23];
    }
}
