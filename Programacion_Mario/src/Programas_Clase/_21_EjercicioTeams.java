///**
// * 
// */
//package UT3;
//
//import java.util.Scanner;
//
///**
// * @author MarioAguirre
// *
// */
//public class _21_EjercicioTeams {
//
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		Scanner entrada = new Scanner(System.in); 
//
////        int numero_usuario;
////        int suma_de_numeros;
////        int aux;
////        float media;
////        int total_suma = 0;
////        float contador = -1;
////        int numero_mayor = 0;
////        int numero_menor = 0;
////        
////        
////        System.out.println("Para parar este programa de suma tiene que poner un 0");
////       
////        do{ 
////        	contador = contador + 1;
////        	System.out.print("Introduzca un numero: ");
////        	numero_usuario = entrada.nextInt();
////        	aux = numero_usuario;
////        	suma_de_numeros = aux + total_suma;
////            total_suma = suma_de_numeros;
////            if(total_suma>numero_usuario) {
////            	total_suma = numero_mayor;
////            }
////            else if(total_suma<numero_usuario) {
////            	numero_usuario = numero_mayor;
////            }
////            else if(total_suma<numero_usuario) {
////            	total_suma = numero_mayor;
////            }
////            else if(total_suma<numero_usuario) {
////            	numero_usuario = numero_mayor;
////            }
////        }while(numero_usuario != 0);
//// 
////        System.out.println("Esta es la suma de los numeros introducidos: " +suma_de_numeros );
////        media = suma_de_numeros / contador;
////        System.out.printf("Esta es la media: %5.2f ", media);
////		
////		
////		int cuenta=0;
////		int num;
////		int contador=0;
////		int min = Integer.MAX_VALUE;
////		int max = Integer.MIN_VALUE;
////		
////		do {
////			System.out.println("Escribe numeros para sumar, hacer la media, y mayor o menor. 0 - Finaliza.");
////			num = entrada.nextInt();
////			if(num!=0) {
////				cuenta+=num;
////				contador++;
////				if(num>max) {
////					max=num;
////				}
////				if(num<min) {
////					min=num;
////				}
////			}
////		}while(num!=0);
////		
////        entrada.close();
////
////    }  
////}