/**
 * 
 */
package Objetos.Ejemplos;

/**
 * @author MarioAguirre
 *
 */
public class Ejemplos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("unused")
		float valores[] = {1,1,1,2,2,3,3,4,5,6,7};
//		System.out.print
		
		int valor = 4;
		System.out.println(valor+"! = "+Estadisticas.permutaciones(valor));
		
		int m=4, n=3;
		System.out.println("VariacionSR de m = "+m+" y n = "+n+": "+Estadisticas.variacionSR(n, m));
		
		int m1=5, n1=6;
		System.out.println("VariacionCR de m = "+m1+" y n = "+n1+": "+Estadisticas.variacionCR(n1, m1));
		
		
	
	
	}

}
