/**
 * 
 */
package Objetos.UT7.UT7_24;

/**
 * @author MarioAguirre
 *
 */
public class Actividad24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NIF minif = new NIF(18082739, 'R');
		System.out.println(minif.getDNI() + "-" + minif.getLetra());
		minif.setLetra('U');
		System.out.println(minif.getDNI() + "-" + minif.getLetra());
		minif.setLetra('R');
		System.out.println(minif.getDNI() + "-" + minif.getLetra());
	}

}
