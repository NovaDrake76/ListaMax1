/*
 * Calcular a soma dos 100 primeiros nº naturais.
 */
package listamax1;

public class Naturais {
   
    
        public static void main(String[] args) {
            int soma = 0;
            for (int i = 1; i <= 100; i++) {
                soma=soma+i;
            }
            System.out.println(soma);
        }
    
}
