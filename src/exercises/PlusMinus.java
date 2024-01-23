package exercises;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o tamanho do array: ");
		int tamanho = sc.nextInt();
		int[] array = new int[tamanho];

		System.out.println("Insira os valores de entrada: ");
		for (int i = 0; i < tamanho; i++) {
			array[i] = sc.nextInt();
		}

		int positivos = 0;
		int negativos = 0;
		int zeros = 0;
		
		for (int elemento : array) {
            if (elemento > 0) {
                positivos++;
            } else if (elemento < 0) {
                negativos++;
            } else {
                zeros++;
            }
        }

        double proporcaoPositivos = (double) positivos / tamanho;
        double proporcaoNegativos = (double) negativos / tamanho;
        double proporcaoZeros = (double) zeros / tamanho;

        System.out.printf("Proporção de positivos: %.6f%n", proporcaoPositivos);
        System.out.printf("Proporção de negativos: %.6f%n", proporcaoNegativos);
        System.out.printf("Proporção de zeros: %.6f%n", proporcaoZeros);

	}

}
