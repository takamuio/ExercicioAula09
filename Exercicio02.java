// Leia um vetor de 20 posições. 
// Contar e escrever quantos valores pares e ímpares ele possui. Imprimir na tela

import java.util.ArrayList;

public class Exercicio02 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList();

        int contPar = 0, contImpar = 0;

        for (int i = 0; i < 19; i++) {
            numeros.add(i + 1);

            if (numeros.get(i) % 2 == 0) {
                contPar++;
            }
            contImpar = numeros.size() - contPar;
        }

        System.out.println("Os numeros digitador foram: " + numeros);
        System.out.println("Foram digitados " + contPar + " números pares.");
        System.out.println("E " + contImpar + " números ímpares.");
    }

}
