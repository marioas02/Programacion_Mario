/**
 * 
 */
package Semanales;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author magui
 *
 */
public class Semanal_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner (System.in);
		
		char palos [] = new char [4];
		int numero [] = new int [4];
		int cont=1;
		int salir=1;
		
		do {
			
//LE EXPLICO LAS PROPIEDADES DEL PROGRAMA.
			System.out.printf("Los palos son: \n\t d = DIAMANTES \n\t p = PICAS \n\t t = TREBOLES \n\t c = CORAZONES.\n");
	
//PIDO DATOS Y MIRO HABER SI CUMPLE LAS PROPIEDADES.
			for(int i=0;i<numero.length;i++) {
				System.out.printf("Escribe el numero de la %da carta: ", cont);
				numero[i] = entrada.nextInt();
				
				if(numero[i]>=1 && numero[i]<=13 ) {
					System.out.printf("Escribe el palo de la %da carta: ", cont);
					palos[i] = entrada.next().charAt(0);
					
					if(palos[i] == 'd'|| palos[i] == 'p'|| palos[i] == 't'|| palos[i] == 'c') {
						cont++;
					}else {
						System.out.println("El palo tiene que ser: d, p, t o c");
						i=i-1;
					}
				}
				else {
					System.out.println("Los numeros tiene que ir entre 1-13");
					i=i-1;
				}
			}
			
//ORDENO LOS NUMEROS PARA DEPUES MIRAR DE QUE TIPO DE ESCALERA ES.
			Arrays.sort(numero);
			
//REPETICION DE UN NUMERO
			if(numero[0]==numero[1]||numero[0]==numero[2]||numero[0]==numero[3]||numero[1]==numero[2]||numero[1]==numero[3]||numero[2]==numero[3]) {
				System.out.println("No hay escalera");
			}
			else {
			
//MIRO Y FILTRO QUE TIPO ES PARA DECIRLE QUE CARTA LE FALTA.		
					if(palos[0]!=palos[1]&&palos[0]!=palos[2]&&palos[0]!=palos[3]) {
						System.out.println("No se puede hacer escalera.");
					}
					
//ORDENADO CON EL 0=AS		
					else if(numero[0]==1&&numero[0]==numero[1]-1&&numero[1]==numero[2]-1&&numero[2]==numero[3]-1&&numero[3]==numero[2]+1) {
						System.out.printf("Para hacer escalera te falta: %d %c", numero[3]+1, palos[0]);
					}
					
//ORDEN CON EL 0=AS Y 1=11 Y 2=12 Y 3=13
					else if(numero[0]==1&&numero[3]==13&&numero[1]==11&&numero[2]==12) {
						System.out.printf("Para hacer escalera te falta: %d %c", numero[1]-1, palos[0]);
					}
					
//ORDENADO CON EL 3=13		
					else if(numero[3]==13&&numero[0]==numero[1]-1&&numero[1]==numero[2]-1&&numero[2]==numero[3]-1&&numero[3]==numero[2]+1) {
						System.out.printf("Para hacer escalera te falta: %d %c", 1, palos[0]);
					}
					
//ORDENADO TODA LAS CARTAS SIN EL 1 NI EL 13		
					else if(numero[0]==numero[1]-1&&numero[1]==numero[2]-1&&numero[2]==numero[3]-1&&numero[3]==numero[2]+1) {
						System.out.printf("Para hacer escalera te falta: %d %c", numero[3]+1, palos[0]);
					}
					
//DESORDEN EL ENTRE EL 0 Y EL 1		
					else if(numero[0]==numero[1]-2&&numero[1]==numero[2]-1&&numero[2]==numero[3]-1) {
						System.out.printf("Para hacer escalera te falta: %d %c", numero[1]-1,palos[0]);
					}
					
//DESORDEN EL ENTRE EL 1 Y EL 2		
					else if(numero[0]==numero[1]-1&&numero[1]==numero[2]-2&&numero[2]==numero[3]-1) {
						System.out.printf("Para hacer escalera te falta: %d %c", numero[2]-1,palos[0]);
					}
					
//DESORDEN EL ENTRE EL 2 Y EL 3		
					else if(numero[0]==numero[1]-1&&numero[1]==numero[2]-1&&numero[2]==numero[3]-2) {
						System.out.printf("Para hacer escalera te falta: %d %c", numero[3]-1,palos[0]);
					}
					
//DESORDEN EN LA ROTATIVA 1,13,12,11,10
					else if(numero[0]==1&&numero[3]==12&&numero[1]==10&&numero[2]==11) {
						System.out.printf("Para hacer escalera te falta: %d %c", numero[3]+1,palos[0]);
					}
					else if(numero[0]==1&&numero[3]==13&&numero[1]==10&&numero[2]==12) {
						System.out.printf("Para hacer escalera te falta: %d %c", numero[1]+1,palos[0]);
					}
					else if(numero[0]==1&&numero[3]==13&&numero[1]==10&&numero[2]==11) {
						System.out.printf("Para hacer escalera te falta: %d %c", numero[1]+2,palos[0]);
					}
					else {
						System.out.println("No se puede hacer escalera.");
					}
			}
			
			System.out.printf("\n\n\tSi quiere salir pulse 2, si quiere otra mano pulse 1: \n\n");
			salir=entrada.nextInt();
			cont=1;
			
			}while(salir==1);
		entrada.close();
	}
}

//PSEUDOCÓDIGO:
//	
//	DECLARAR LAS 2 ARRAY DE PALOS Y LETRAS, UN CONTADOR INICIALIZARLO A 1 Y EL SALI A 1.
//	CREAR UN BUCLE CON LA CONDICION DE SALIDA.
//	CREAR UN BUCLE PARA PEDIR DATOS Y METERLOS AL ARRAY DE NUMEROS Y PALOS Y PONERLOS EN EL ARRAY CORRESPONDIENTE.
//	COMPROBAR QUE LOS NUMEROS NO SEAN MAYORES QUE 13 O MENORES QUE 1.
//	COMPROBAR QUE LOS PALOS SON IGUALES.
//	COMPROBAR TODAS LAS ESCALERAS Y MIRAR SI CONCUERDA CON ALGUN FILTRO.
//	SI NO DECIR QUE NO HAY ESCALERA.
//	PREGUNTAR SI QUIERE FINALIZAR CON LA CONIDCION DEL BUCLE. 