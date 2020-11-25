/**
*
*/
package Programas_Clase; 

import java.util.Scanner; 

/** 
* @author Mario 
* 
*/ 
public class _24_EjercicioTeams { 
/**
* @param args 
*/ 
public static void main(String[] args) { 
	// TODO Auto-generated method stub 
	
	int numero=0;
	int suma=0;
	@SuppressWarnings("unused")
	int contadordenumeros=0;
	Scanner entrada = new Scanner(System.in); 
	
	do { 
		contadordenumeros++; 
		System.out.println("Introduce números"); 
		numero = entrada.nextInt(); 
		
		//suma me va sumando todo desde dentro, hasta que yo le diga con una orden, que me lo pinte por pantalla 
		if (numero %2==0) { 
			suma += numero;
		}

	}while(numero!=0);

	System.out.println("FIN"); 
	System.out.println("La suma de los números pares es "+suma);
	entrada.close();

	}
}