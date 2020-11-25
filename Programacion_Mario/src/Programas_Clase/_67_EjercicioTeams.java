/**
 * 
 */
package Programas_Clase;

/**
 * @author magui
 *
 */
public class _67_EjercicioTeams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[] = new int[10];         
        int B[] = new int[10];
        boolean repetidos = false;         
        
        //Los creo con valores aleatorios
        for(int i=0; i<A.length; i++) {
            A[i]=(int)(Math.random()*50)+1; 
            B[i]=(int)(Math.random()*50)+1;
        } 
        
        // Los pinto en pantalla
        for(int i=0; i<A.length; i++) {
            System.out.print(A[i] + " "); 
        } 
        System.out.print("\n");
        for(int i=0; i<B.length; i++) {
            System.out.print(B[i] + " "); 
        } 
        System.out.print("\n\n");

        for(int i=0; i<A.length; i++) { 
            for(int j=0; j<B.length; j++) { 
                    if(B[j]==A[i]) { 
                         repetidos = true;
                    }
            } 
        } 
        
        if (repetidos) {
        	System.out.println("A tiene valores repetidos en B");
        }else {
        	System.out.println("A NO tiene valores repetidos en B");
        }
         
	}

}