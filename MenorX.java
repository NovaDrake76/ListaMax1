/*
 * Imprimir o menor inteiro positivo x cujo quadrado é superior a um valor L dado.
 */
package listamax1;

import java.util.Scanner;

public class MenorX {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Informe L");
         int L = Integer.parseInt(sc.nextLine());
         
         int x = 0;
         while(x*x < L){
             x++;
         }
         
         System.out.println(x);
         
    }

}
