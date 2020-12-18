/**
 * 
 */
package Basicos;

import java.util.Date;

/**
 * @author magui
 *
 */
public class EjsStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String prueba = "Texto de prueba";
		
		System.out.print(prueba);
		
		prueba = "De forma similar hay posibilidad de convertir un array de bytes en un\r\n"
				+ "String. En este caso se tomará el array de bytes como si contuviera\r\n"
				+ "códigos de caracteres, que serán traducidos por su carácter\r\n"
				+ "correspondiente al ser convertido a String. Hay que indicar la tabla de\r\n"
				+ "códigos que se utilizará (si no se indica se entiende que utilizamos el\r\n"
				+ "código ASCII:";
		
		System.out.printf("\n%s", prueba);

		int ent = 34;
		int ent2 = 44;
		Date fecha = new Date();
		
		System.out.print(String.valueOf(ent) + String.valueOf(ent2) + String.valueOf(fecha));

		prueba = "Sencillo";
		System.out.println(prueba.charAt(3));
	}

}
