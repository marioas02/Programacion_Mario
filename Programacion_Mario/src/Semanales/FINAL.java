/**
 * 
 */
package Semanales;

import java.util.Scanner;

/**
 * @author magui
 *
 */
public class FINAL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        
        int rows, cols, c, num1, num2, z, count;
        boolean check;
        String[] size, b;
        String dat, text;
        
        do
        {
            size = sc.nextLine().split(" ");
            rows = Integer.parseInt(size[0]);
            cols = Integer.parseInt(size[1]);
            if (rows != 0 && cols != 0)
            {
                char[][] table = new char[rows][cols];

                for (int i = 0; i < rows; i++)
                {
                    dat = sc.nextLine();
                    for (int j = 0; j < cols; j++)
                    {
                        table[i][j] = dat.charAt(j);
                    }
                }

                c = sc.nextInt();
                sc.nextLine();
                
                for (int i = 0; i < c; i++) 
                {
                    b = sc.nextLine().split(" ");
                    
                    num1 = Integer.parseInt(b[0])-1;
                    num2 = Integer.parseInt(b[1])-1;
                    text = b[2];
                    
                    check = false;
                    count = 0;
                    
                    if (text.equals("ARRIBA"))
                    {
                        z = num1;
                        while (z >= 0 && !check)
                        {
                            if (table[z][num2] == 'X')
                                check = true;
                            count++;
                            z--;
                        }
                    }
                    else if (text.equals("ABAJO"))
                    {
                        z = num1;
                        while (z < rows && !check)
                        {
                            if (table[z][num2] == 'X')
                                check = true;
                            count++;
                            z++;
                        }
                    }
                    else if (text.equals("IZQUIERDA"))
                    {
                        z = num2;
                        while (z >= 0 && !check)
                        {
                            if (table[num1][z] == 'X')
                                check = true;
                            count++;
                            z--;
                        }
                    }
                    else if (text.equals("DERECHA"))
                    {
                       z = num2;
                        while (z < cols && !check)
                        {
                            if (table[num1][z] == 'X')
                                check = true;
                            count++;
                            z++;
                        } 
                    }
                    count--;
                    if (check)
                    {
                        System.out.println(count);
                    }
                    else
                        System.out.println("NINGUNO");
                }
                
                System.out.println("---");
            }
        }while(rows != 0 || cols != 0);
    } 
}
//System.out.printf("\n");
//for(int i=0; i<numero.length; i++) {
//	System.out.println(numero[i]);
//}
//for(int i=0; i<palos.length; i++) {
//	System.out.println(palos[i]);
//}
