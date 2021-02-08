
package listamax1;

import java.util.Scanner;

/**
 *
 * Ler dois números inteiros, x e y, e 
 * imprimir o quociente e o resto da divisão
 * inteira entre eles.
 */
public class Divisao {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Qual o X?");
            int x = Integer.parseInt(sc.nextLine());
            System.out.println("Qual o Y?");
            int y = Integer.parseInt(sc.nextLine());
            
            double quociente = x/y;
            double resto = x%y;
            
            System.out.println("Quociente: " + quociente);
            System.out.println("Resto: " + resto);
        }
}
