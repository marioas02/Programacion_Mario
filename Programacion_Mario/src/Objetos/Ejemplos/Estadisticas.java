/**
 * 
 */
package Objetos.Ejemplos;

/**
 * @author MarioAguirre
 *
 */
public class Estadisticas {
	
	public static float media(float[] valores) {
		float media = 0;
		for (float i: valores) {
			media = media+i;
		}
		if(valores.length>0) {
			media = media/valores.length;
		}
		return media;
		
	}
	
	public static float moda(float[] valores) {
		int maxrepes = 0;
		float moda = 0;

		for (int i = 0; i < valores.length; i++) {
			int repeticiones = 0;
			for (int j = 0; j < valores.length; j++) {
				if (valores[i] == valores[j]) {
					repeticiones++;
				}
				if (repeticiones > maxrepes) {
					moda = valores[i];
					maxrepes = repeticiones;
				}
			}
		}
		return moda;
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
