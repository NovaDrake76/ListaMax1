/*
 * Escreva um algoritmo que leia uma sequência de
 * números do usuário e realize a soma desses números. 
 * Encerre a execução quando um número negativo for digitado.
 */
package listamax1;

import java.util.Scanner;

public class Sequencia {
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           
           for (int i = 0; i >= 0;) {
               System.out.println("Soma Total: ");
               System.out.println(i);
               int n = Integer.parseInt(sc.nextLine());
               i = i+n;
           }
       }

    
}
