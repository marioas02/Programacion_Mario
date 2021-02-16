/**
 * 
 */
package Objetos.Tienda;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author MarioAguirre
 *
 */
public class Tienda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ScannerMenu = new Scanner(System.in);
		Scanner ScannerInt = new Scanner(System.in);
		Scanner ScannerString = new Scanner(System.in);
		
		int opcion = 0;
		
		ArrayList<Articulo> catalogo = new ArrayList<Articulo>();
		inicializarCatalogo(catalogo);
		
		
		do {
			opcion = menu(ScannerMenu);

			switch (opcion) {
			
			case 0:
				System.out.println("Has escogido la opción 0");
				System.out.println("Muchas Gracias por su compra.");
				break;
			
			case 1:
				addArticuloCatalogo(catalogo, ScannerInt, ScannerString);
				mostrarCatalogo(catalogo);
				break;
			
			case 2:
				break;
				
			case 3:
				break;
				
			default:
				System.out.println("Opcion icorrecta, lea atentamente.");
				break;

			}
		} while (opcion != 0);
		
		ScannerInt.close();
		ScannerString.close();
	}
	
	private static int menu(Scanner ScannerInt) {
		int opcion = 0;
		System.out.println("");
		System.out.println(
				"Pulsa:\n\t1: Alta Artículo."
				+ "\n\t2: Comprar Artículo."
				+ "\n\t3: Confirmar Carrtio."
				+ "\n\t0: Salir.");
		System.out.printf("Escribe un número del menú: ");
		opcion = ScannerInt.nextInt();
		System.out.println("");
		return opcion;
	}
	
	private static void inicializarCatalogo(ArrayList<Articulo> c) {
		c.add(new Articulo("0001", "Monitor", 200.00F, 10));
		c.add(new Articulo("0002", "Teclado", 10.00F, 100));
		c.add(new Articulo("0003", "RJ45 2m", 4.50F, 50));
		c.add(new Articulo("0004", "Ratón", 20.00F, 15));
	}
	
	private static void addArticuloCatalogo(ArrayList<Articulo> c, Scanner sc, Scanner sn) {
		System.out.println("Introduce el código del nuevo Artículo: ");
		String codigo = sc.nextLine();
		System.out.println("Introduce el nombre del nuevo Artículo: ");
		String nombre = sc.nextLine();
		System.out.println("Introduce el precio del nuevo Artículo: ");
		float precio = sn.nextFloat();
		System.out.println("Introduce el stock del nuevo Artículo: ");
		int stock = sn.nextInt();

		c.add(new Articulo(codigo, nombre, precio, stock));
	}
	
	private static void mostrarCatalogo(ArrayList<Articulo> c) {
		for(Articulo a: c) {
			System.out.println(a);
		}
	}
	
	@SuppressWarnings("unused")
	private static void comprar(ArrayList<Articulo> c) {
		/*
		 * Mostrar el catalogo
		 * Pedimos articulo por código, lo buscamos
		 * 		Si existe Pedimos cantidad
		 * 			Si hay disponibilidad
		 * 				Añadimos al carricoche
		 * Repetir mientras
		 */
		
		mostrarCatalogo(c);
		System.out.println("");
		
	}
	
	@SuppressWarnings("unused")
	private static void confirmarCarrito() {
		/*
		 * Mostramos carrito articulo + cantidades + el total
		 * Preguntamos confirmacion
		 * 		Si se confirma
		 * 			Modificar en el catalogo el stock de los articulos del carrito, restando
		 * 			las cantidades al stock
		 * 			Cambiar el estado del Carrito
		 * Mostramos un mensaje.
		 */
	}
	
	
	
	
	
}
