/**
 * 
 */
package PruebaNivel;

/**
 * @author magui
 *
 */
public class ReservarTaquilla {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taquillas[] taquillas = new Taquillas[10];
		
		for(int i=0;i<taquillas.length;i++) {
			taquillas[i]= new Taquillas(i+1, "Sin asignar", false);
		}
		
		System.out.println(taquillas[0].numero);
		System.out.println(taquillas[3].numero);
		System.out.println(taquillas[9].numero);
		System.out.println(taquillas[2].codSocio);
		System.out.println("La taquilla 4 esta: " +taquillas[4].numero);
		
		if (!taquillas[4].cerrada) {
			taquillas[4].cerrada = true;
		}
		
		System.out.println("La taquilla 4 esta: " +taquillas[4].numero);

	}

}
