/**
 * 
 */
package Objetos.Ejemplos;

import java.util.Arrays;

/**
 * @author MarioAguirre
 *
 */
public class Estadisticas {
	
	public static float media(float[] valores) {
//		float valores[] = new float[6];
		int sum = 0;
		float media;
		int j=2;
		for(int i=0;i<=valores.length;i++) {
			sum=(int) (sum+valores[i]);
			j++;
		}
		media=sum/j;
		
		return media;
		
	}
	
	public static float moda(float[] valores) {
		
		Arrays.sort(valores);
		for(int i=0;i<=valores.length;i++) {
			
		}
		return 0;
		//TODO
	}
	
	private static int factorial(int valor) {
		if(valor == 1) {
			return 1;
		}else {
			return valor*factorial(valor-1);
		}
	}
	
	public static int permutaciones(int n) {
		return factorial(n);
	}
	
	public static int variacionSR(int n, int m) {
		int resultado = 0;
		if(n<=m) {
			resultado=(factorial(m))/factorial(m-n);
		}
		return resultado;
				
	}
	
	public static int variacionCR(int n1, int m1) {
		int resultado = 0;
		resultado=(int) Math.pow(m1, n1);
		return resultado;
		}
}
