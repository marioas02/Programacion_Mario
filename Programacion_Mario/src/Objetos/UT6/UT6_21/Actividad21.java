/**
 * 
 */
package Objetos.UT6.UT6_21;

import java.util.ArrayList;

/**
 * @author magui
 *
 */
public class Actividad21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Prueba
		Contador c1 = new Contador();
		Contador c2 = new Contador(5);
		System.out.println("Valor del contador 1: " + c1.getContador());
		System.out.println("Valor del contador 2: " + c2.getContador());
		c2.aumentar();
		System.out.println("Valor del contador 2 tras aumentar: " + c2.getContador());
		c2.disminuir();
		System.out.println("Valor del contador 2 tras disminuir: " + c2.getContador());
		Contador c3 = new Contador(2);
		c3.aumentar();
		System.out.println("Valor del contador 3 tras aumentar: " + c3.getContador());

		ArrayList<Contador> contadores = new ArrayList<Contador>();
		contadores.add(c1);
		contadores.add(c2);
		contadores.add(c3);
		for (int i = 0; i < contadores.size(); i++) {
			contadores.get(i).disminuir();
			System.out.println("Valor del contador " + (i + 1) + " - " + contadores.get(i).getContador());
		}

	}

}
