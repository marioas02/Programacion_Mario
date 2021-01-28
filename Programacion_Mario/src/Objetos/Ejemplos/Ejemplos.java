/**
 * 
 */
package Objetos.Ejemplos;

/**
 * @author magui
 *
 */
public class Ejemplos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche micoche = new Coche("Rojo","7777AAA", 70000);
		Coche ocoche = new Coche("Gris","1234ABC", 0);
		
		System.out.println("La matricula de micoche es: " +micoche.matricula);
		System.out.println("La matricula de oche es: " +ocoche.matricula + ". Y su color es: " +ocoche.color);
	}

}
