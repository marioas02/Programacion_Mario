/**
 * 
 */
package Programas_Clase;

import java.util.Scanner;
/**
 * @author magui
 *
 */
public class prueba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		// PREGUNTA PARA NAIRA: SALE DEL PROGRAMA AL FINZALIZAR UN VILLANO O HA DE
		// CLICAR ALGO,A
		// PREGUNTA PARA NAIRA: SON PREDETERMINADAS LAS FILAS Y COLUMNAS?

		int numero[][] = new int[10][10];
		String mapa[][] = new String[10][10];
		int fh = 0, ch = 0, aux = 0, borde = 0, paso = 1;
		char direccion;

//DONDE QUIERE EL USUARIO EL HEROE
		

//RECORRER EL ARRAY METIENDO NUMEROS ALEATORIOS DEL 1 AL 2
		for (int i = 0; i < numero.length; i++) {
			for (int j = 0; j < numero.length; j++) {
				numero[i][j] = (int) (Math.random() * 2) + 1;
			}
		}
		for (int i = 0; i < numero.length; i++) {
			System.out.print("\n");
			for (int j = 0; j < numero[i].length; j++) {
				System.out.print(numero[i][j] + " ");
			}
		}
//CAMBIO DE NUMEROS A CARACTERES.
		for (int i = 0; i < numero.length; i++) {
			for (int j = 0; j < numero.length; j++) {
				if (numero[i][j] == 1) {
					mapa[i][j] = "·";
				} else {
					mapa[i][j] = "*";
				}
			}
		}

//PONGO EL HEROE EN SITIO
		for (int i = 0; i < 1; i++) {
			mapa[0][0] = "@";
		}
		for (int i = 0; i < 1; i++) {
			mapa[9][9] = "@";
		}
//PINTAR EL MAPA
		System.out.print("\n");
		for (int i = 0; i < mapa.length; i++) {
			System.out.print("\n");
			for (int j = 0; j < mapa[i].length; j++) {
				System.out.print(mapa[i][j] + " ");
			}
		}
		//||mapa[9][ch+1]=="·"||mapa[fh+1][9]=="·"
		while(aux==0||mapa[fh+1][ch+1]=="·"&&mapa[fh][ch+1]=="·"&&mapa[fh+1][ch]=="·"){
			
			if(fh<=8 || ch<=8) {
			if(mapa[fh+1][ch+1]=="·") {
				mapa[fh+1][ch+1]="@";
				fh++;
				ch++;
			}
			else if(fh==9) {
				if(mapa[fh][ch+1]=="·") {
					mapa[fh][ch+1]="@";
					ch++;
				}else{
					if(mapa[fh][ch+1]=="*") {
						aux++;
					}
				}
			}
			else if(ch==9) {
				if(mapa[fh+1][ch]=="·") {
					mapa[fh+1][ch]="@";
					fh++;
				}else {
					if(mapa[fh+1][ch]=="*") {
						aux++;
					}					
				}
			}
			else if(mapa[fh+1][ch+1]=="*") {
				if(mapa[fh][ch+1]=="·") {
					mapa[fh][ch+1]="@";
					ch++;
				}else {
					if (mapa[fh+1][ch]=="·"){
						mapa[fh+1][ch]="@";
						fh++;
					}else {
						aux++;
					}
				}
			}
			else if(mapa[fh+1][ch+1]=="@") {
				aux++;
			}
			}else {
				if(fh==9) {
					if(mapa[fh][ch+1]=="·") {
						mapa[fh][ch+1]="@";
						ch++;
					}else{
						if(mapa[fh][ch+1]=="*") {
							aux++;
						}
					}
				}
				if(ch==9) {
					if(mapa[fh+1][ch]=="·") {
						mapa[fh+1][ch]="@";
						fh++;
					}else {
						if(mapa[fh+1][ch]=="*") {
							aux++;
						}					
					}
				}
				
			}
		}
		System.out.print("\n");
		for (int i = 0; i < mapa.length; i++) {
			System.out.print("\n");
			for (int j = 0; j < mapa[i].length; j++) {
				System.out.print(mapa[i][j] + " ");
			}
		}
		
		entrada.close();
	}
}
