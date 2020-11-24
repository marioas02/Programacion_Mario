package Basicos;

public class Condiciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Uso de if -else - else if
		//Escribir si un numero es par o impar
		int numero = 23;
		if (numero%2 == 0) {
			System.out.println("Es par");
		}
		else {
			System.out.println("Es impar");
		}
		
		//Indicar si es multiplo de 10, de 2, de 3, o ninguno de estos
		if (numero%10 == 0) {
			System.out.println("Es multiplo de 10");
		}
		else if (numero%2 == 0){
			System.out.println("Es multiplo de 2");
		}
		else if (numero%3 == 0) {
			System.out.println("Es multilpo de 3");
		}
		else {
			System.out.println("Ninguno de estos");
		}
		
		//Uso de distintos operadores lógicos (<, >, ==, !=, &&, ||)
		
	}

}
