/**
 * 
 */
package UT6_20.copy;

/**
 * @author magui
 *
 */
public class Actividad20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Prueba
		Persona yo = new Persona();		
		yo.setNombre("mario");
		System.out.println(yo.getNombre());
		yo.setApellidos("Aguirre sanz");
		System.out.println(yo.getApellidos());
		yo.setAnio(2002);
		yo.setMes(01);
		yo.setDia(15);
		yo.setSexo('H');
		System.out.println(yo.saludar());
		System.out.println(yo.mostrarEdad());
		
		Persona invento = new Persona("PEPE", "LOPEZ garcia", 8000, 34, -3, 'G');
		System.out.println(invento.saludar());
	}

}
