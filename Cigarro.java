
package listamax1;

import java.util.Scanner;

/**
 * Calcular a quantidade dinheiro gasta por um fumante.
 * Dados: o número de anos que ele fuma, o nº de cigarros
 * fumados por dia e o preço de uma carteira.
 */
public class Cigarro {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Fuma há quantos anos?");
        int anos = Integer.parseInt(sc.nextLine());
        System.out.println("Fuma quantos cigarros por dia?");
        int diarios = Integer.parseInt(sc.nextLine());
        System.out.println("Quanto custa uma carteira de cigarros?");
        double preco = Double.parseDouble(sc.nextLine());

        int cigarrosdias = anos*365;
        double carteiras = (cigarrosdias*diarios)/20;
        double gasto = carteiras*preco;
        
        int i = 0;
        i = (cigarrosdias*diarios % 20);
        if(i<20){
            gasto = (carteiras+1)*preco;
        }
        
        System.out.println("Tu gastou R$" + gasto);
        
    }
    
}
