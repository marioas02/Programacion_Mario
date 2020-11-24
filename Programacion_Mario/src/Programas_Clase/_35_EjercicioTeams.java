/**
 * 
 */
package Programas_Clase;

/**
 * @author MarioAguirre
 *
 */
public class _35_EjercicioTeams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int operacion;
		int numero=0;
		int multiplicador=0;
		int i;
		
		
		for(i=0;i<=10;i++) {
			operacion=numero*multiplicador;
			System.out.printf("%d * %d = %d\n", multiplicador, numero, operacion);
			numero++;
			
			
			if(numero==11) {
				System.out.println("\n");
				multiplicador++;
				numero=0;
				i=0;
			}
			
			if(operacion==100) {
				i=11;
			}
		}
	}
}
