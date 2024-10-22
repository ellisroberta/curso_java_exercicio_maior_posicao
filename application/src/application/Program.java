package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt(); // Lê a quantidade de números
        double[] vect = new double[n]; // Cria o vetor

        System.out.println();
        for (int i=0; i<vect.length; i++) {
            System.out.print("Digite um número: ");
            double number = sc.nextDouble(); // Lê cada número
            vect[i] = number; // Armazena no vetor
        }

        double maior = vect[0]; // Inicializa o maior número
        int posicao = 0; // Inicializa a posição do maior número
        for (int i=1; i<n; i++) {
            if (vect[i] > maior) { // Verifica se o número atual é maior
                maior = vect[i]; // Atualiza o maior número
                posicao = i; // Atualiza a posição
            }
        }

        System.out.println("\nMAIOR VALOR = " + maior); // Exibe o maior número
        System.out.println("POSICAO DO MAIOR VALOR = " + posicao); // Exibe a posição

        sc.close(); // Fecha o Scanner
    }
}