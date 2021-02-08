/*
 * Gerar 20 números de 1000 a 1999 
 * e escrever aqueles que divididos por 11 dão
 * um resto igual a 5. Obs. use Random para gerar o número
 */
package listamax1;

import java.util.Random;

public class Aleatorio {
        public static void main(String[] args) {
            Random r  = new Random();
            int a = 1000;
            int b = 1999;
                
            int[] numeros = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,};
            
            for (int i = 0; i < 20; i++) {
               numeros[i] = r.nextInt((b-a)+1)+a;
            }
             
            for (int i = 0; i < 20; i++) {
                if (numeros[i]%11 ==5) {
                    System.out.println(numeros[i]);
                }
            }     
        }

    
}
