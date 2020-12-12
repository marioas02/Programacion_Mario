/**
 * 
 */
package Proyecto_Final;

import java.util.Scanner;

/**
 * @author Mario Aguirre y Carlos Calvo
 *
 */
public class ProyectoFinal_MarioAguirre_CarlosCalvo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

//DECLARACION
		int numero[][] = new int[10][10];
		String mapa[][] = new String[10][10];
		int fh = 99, ch = 99, aux = 0, borde = 0, paso = 1, salir=1;
		char direccion;

//EXPLICACION DEL PROGRAMA
		System.out.printf("Daredevil, es un superheroe ciego, necesita tu ayuda para saber donde hay un villano en una direccion.");
		System.out.printf("\nNuestro heroe se encuentra en una mision en un espacio de 9x9, ayudalo a encontrar villanos.");
		
//BUCLE PARA EMPEZAR
		do {
			fh = 99;
			ch = 99;
	
//DONDE QUIERE EL USUARIO EL HEROE
	//VERIFICAR FH Y CH
			while (fh == 99) {
				System.out.printf("\nDiga la fila que quiere poner al heroe: ");
				fh = entrada.nextInt();
				if (fh < 10 && fh > -1) {
					while (ch == 99) {
						System.out.printf("Diga la columna que quiere poner al heroe: ");
						ch = entrada.nextInt();
						if (ch > 9 || ch < 0) {
							System.out.printf("Recuerde que las dimensiones han de ser como maximo 9x9.\n\n");
							ch = 99;
						} else {

						}
					}
				} else {
					System.out.printf("Recuerde que las dimensiones han de ser como maximo 9x9.\n\n");
					fh = 99;
				}
			}
			

//RECORRER EL ARRAY METIENDO NUMEROS ALEATORIOS DEL 1 AL 2
			for (int i = 0; i < numero.length; i++) {
				for (int j = 0; j < numero.length; j++) {
					numero[i][j] = (int) (Math.random() * 2) + 1;
				}
			}
	
//CAMBIO DE NUMEROS A CARACTERES.
			for (int i = 0; i < numero.length; i++) {
				for (int j = 0; j < numero.length; j++) {
					if (numero[i][j] == 1) {
						mapa[i][j] = "X";
					} else {
						mapa[i][j] = "·";
					}
				}
			}
	
//PONGO EL HEROE EN SITIO
			for (int i = 0; i < 1; i++) {
				mapa[fh][ch] = "H";
			}
	
//PINTAR EL MAPA
			for (int i = 0; i < mapa.length; i++) {
				System.out.print("\n");
				for (int j = 0; j < mapa[i].length; j++) {
					System.out.print(mapa[i][j] + " ");
				}
			}
	
//PEDIMOS DIRECCION
			System.out.println("\n\nLas direcciones pueden ser: \n\t r=Right \n\t l=left \n\t u=Up \n\t d=down");
			System.out.printf("Escoge una de las direcciones para mover al heroe: ");
			direccion = entrada.next().charAt(0);
			
//FILTROS DE DIRECCIONES		
		// DERECHA
			if (direccion == 'r') {
				aux = ch;
				do {
					if (aux != 9) {
						if (numero[fh][ch + 1] == 1) {
							System.out.printf("Has dado: %d pasos y has encontrado a un Villano.", paso);
							aux++;
						} else if (numero[fh][ch + 1] == 2) {
							ch++;
							paso++;
							aux++;
						}
	
					} else if (aux == 9) {
						System.out.printf("Has llegado al borde del mapa, a la derecha del heroe no hay Villanos.");
						borde = 1;
					}
				} while (numero[fh][aux] == 2 && borde == 0);
			}
		// IZQUIERDA
			if (direccion == 'l') {
				aux = ch;
				do {
					if (aux != 0) {
						if (numero[fh][ch - 1] == 1) {
							System.out.printf("Has dado: %d pasos y has encontrado a un Villano.", paso);
							aux--;
						} else if (numero[fh][ch - 1] == 2) {
							ch--;
							paso++;
							aux--;
						}
	
					} else if (aux == 0) {
						System.out.printf("Has llegado al borde del mapa, a la izquierda del heroe no hay Villanos.");
						borde = 1;
					}
				} while (numero[fh][aux] == 2 && borde == 0);
			}
		//ARRIBA
			if (direccion == 'u') {
				aux = fh;
				do {
					if (aux != 0) {
						if (numero[fh - 1][ch] == 1) {
							System.out.printf("Has dado: %d pasos y has encontrado a un Villano.", paso);
							aux--;
						} else if (numero[fh - 1][ch] == 2) {
							fh--;
							paso++;
							aux--;
						}
	
					} else if (aux == 0) {
						System.out.printf("Has llegado al borde del mapa, encima del heroe no hay Villanos.");
						borde = 1;
					}
				} while (numero[aux][ch] == 2 && borde == 0);
			}
		//ABAJO
			if (direccion == 'd') {
				aux = fh;
				do {
					if (aux != 9) {
						if (numero[fh + 1][ch] == 1) {
							System.out.printf("Has dado: %d pasos y has encontrado a un Villano.", paso);
							aux++;
						} else if (numero[fh + 1][ch] == 2) {
							fh++;
							paso++;
							aux++;
						}
	
					} else if (aux == 9) {
						System.out.printf("Has llegado al borde del mapa, debajo del heroe no hay Villanos.");
						borde = 1;
					}
				} while (numero[aux][ch] == 2 && borde == 0);
			}
			
//SALIDA O REPETICION
			System.out.printf("\n\nSi quiere otro mapa pulse 1, si quiere salir pulse 0: ");
			salir = entrada.nextInt();
			paso=1;
		} while (salir==1);
		
		entrada.close();
	}
}