/**
 * 
 */
package Basicos;

import java.util.Random;

/**
 * @author magui
 *
 */
public class DSADASD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char mapa [][]=new char[9][9];
		
		
		char[] chars = "X·".toCharArray();
		StringBuilder caracter = new StringBuilder(2);
		Random random = new Random();
		for (int i = 0; i <mapa.length; i++) {
			for (int j=0; j<mapa.length;j++) {
				char mapa1 = chars[random.nextInt(chars.length)];
				
			    caracter.append(mapa1);
			}
		       
		}
		System.out.println("");
		String output = caracter.toString();
		
		System.out.println(output);
	}
}