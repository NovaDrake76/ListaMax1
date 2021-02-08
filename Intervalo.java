/*
 * Ler 10 valores, um de cada vez, e 
 * contar quantos deles estão no intervalo 
 * [10,50] e quantos deles estão fora deste
 * intervalo, mostrando estas informações.
 */
package listamax1;

import java.util.Scanner;

public class Intervalo {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            int[] valores = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; 
            
            for (int i = 0; i < 10; i++) {
            System.out.println("Digite o valor " + (i+1) + " :");
            valores[i] = Integer.parseInt(sc.nextLine());
            }
            
            int dentro = 0;
            int fora = 0;
            
            for (int k = 0; k < 10; k++) {
                if (valores[k] >=10 && valores[k] <=50) {
                    dentro++;
                }else{
                    fora++;
                }
            }
            
            System.out.println(dentro + " Estão entre 10 e 50, e " + fora + " não estão.");
            
        }

    
}
