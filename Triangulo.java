
package listamax1;

import java.util.Scanner;

/**
 * Ler três valores do teclado 
 * e dizer se eles formam um triângulo. 
 * Caso afirmativo, dizer seu tipo (
 * equilátero, isósceles ou escaleno).
 */

public class Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o primeiro valor? ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.println("Qual o segundo valor? ");
        int y = Integer.parseInt(sc.nextLine());
        System.out.println("Qual o terceiro valor? ");
        int z = Integer.parseInt(sc.nextLine());
        
    if(x<y+z && z<x+y && y<x+z && x>y-z && z>x-y && y>x-z){
        
        if(x==y && y==z ){
            System.out.println("É um triângulo equilátero");
        }else if(x==y || x==z || y==z){
            System.out.println("É um triângulo isósceles");
        }else if(x!=y || x!=z || y!=z){
            System.out.println("É um triângulo escaleno");
        }
        
    }else{
            System.out.println("Não é possível formar um triângulo");
        }
}}
