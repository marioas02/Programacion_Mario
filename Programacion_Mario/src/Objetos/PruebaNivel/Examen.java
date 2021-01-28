/**
 * 
 */
package Objetos.PruebaNivel;

import java.util.Scanner;

/**
 * @author magui
 *
 */
public class Examen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);

		// Variables
		String taquillas[] = new String[11];
		int opcion;
		int numtaquilla;
		int aux = 0;

		// Relleno el Array con todo abierto
		for (int i = 0; i < taquillas.length; i++) {
			taquillas[i] = "Abierta";
		}

		System.out.printf("Bienvenido al Gimansio Rail.");

		// Bucle para repetir todo el proceso
		do {
			System.out.println("\nPulsa:\n\t1: Cerrar taquilla.\n\t2: Abrir taquilla.\n\t0: Salir.");
			opcion = Scanner.nextInt();
			/*
			 * Escoge la opcion y recorre el array, lo pinta en pantalla, le pregunta si
			 * quiere o abrir o cerrar depende de lo que haya escogido y cierra o abre el
			 * numero que escoja el usuario. He utilizado un aux para que si no hay ninguna
			 * abierta o cerrada me pinte que se puede hacer nada en esa opcion.
			 */
			if (opcion == 1) {
				for (int i = 0; i < taquillas.length; i++) {
					if (taquillas[i] == "Abierta") {
						System.out.print(i + ". " + taquillas[i] + "\n");
						aux++;
					}
				}
				if (aux == 0) {
					System.out.print("No hay ninguna taquilla Abierta");
				}
				if (aux > 0) {
					System.out.print("¿Que taquilla quiere cerrar?\n");
					numtaquilla = Scanner.nextInt();
					taquillas[numtaquilla] = "Cerrada";
					System.out.print("Cerrada con exito!\n");
					aux = 0;
				}

			}
			if (opcion == 2) {
				for (int i = 0; i < taquillas.length; i++) {
					if (taquillas[i] == "Cerrada") {
						System.out.print(i + ". " + taquillas[i] + "\n");
						aux++;
					}
				}
				if (aux == 0) {
					System.out.print("No hay ninguna taquilla Cerrada");
				}
				if (aux > 0) {
					System.out.print("¿Que taquilla quiere Abrir?\n");
					numtaquilla = Scanner.nextInt();
					taquillas[numtaquilla] = "Abierta";
					System.out.print("Abierta con exito!\n");
					aux = 0;
				}
			}

		} while (opcion != 0);

		System.out.printf("Gracias por venir a Rail.");

		Scanner.close();
	}
}