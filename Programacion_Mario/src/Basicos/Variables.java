/**
 * 
 */
package Basicos;

/**
 * @author MarioAguirre
 *
 */
public class Variables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//PARA QUE NO ME DE ERRO ESTA CLASS:
				
		//Entero (4 bytes de memoria)
		int entero = 10;

		//Decimal
		float decimal_corto = 9.39F;
		double decimal_largo;
		
		//Caracteres (2 bytes de memria)
		char letra;
		
		//Bit = 0 o 1
		//Byte = 8 bits, ej: 000111000
		//Bytes (1 byte de memoria)
		byte b;
		
		//Cadenas de caracteres
		String cadena = "Hola Clase";
		
		//Casting
		b = (byte) entero;
		System.out.print(b);
		
		System.out.println(decimal_corto);
		System.out.println((int)decimal_corto);
		
		String numero = "100";
		System.out.println(Integer.parseInt(numero));
		
		//Operaciones con variables +, -, /, %
		System.out.println(numero + numero); //Concatenación de cadenas
		System.out.println(entero + entero + " aqui concateno enteros.");
		
		//entero = 10
		entero = entero/2;
		//aqui entero vale 5
		//Operaciones con resto
		int resto = entero%2; // Resto aqui valdria 1
		//HOLAAAAAAAAAAAA
	}
}
