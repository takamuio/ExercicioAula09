/*  Faça um programa para ler um vetor com valor indeterminado. 
Após isto, ler mais um número qualquer, calcular e escrever quantas vezes esse 
número aparece no vetor. Sempre imprimir na tela os processos do vetor.

 */

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner ler1 = new Scanner(System.in);
        Scanner ler2 = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList();

        int tamanho = 0;
        int numero;

        System.out.println("Digite o tamanho do vetor: ");
        tamanho = ler1.nextInt();
        System.out.println("Digite um valor para o vetor: ");
        numero = ler2.nextInt();
        
        
        System.out.println("==========================================");

        for (int i = 0; i < tamanho; i++){
            numeros.add(numero);
        }
        
        int somaNumeros = 0;
        for (int n : numeros) {
            somaNumeros += n;
        }

        System.out.println("A soma dos numeros digitados: \n"
                + somaNumeros);

        System.out.println("A quantidade de numeros digitados é: \n"
                + numeros.size());

    }

}
