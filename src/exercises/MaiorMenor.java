package exercises;

import java.util.Scanner;

public class MaiorMenor {
	public static void encontrarMaiorMenor(int[] numeros) {

		if (numeros.length == 0) {
			System.out.println("O vetor está vazio.");
			return;
		}

		int maior = numeros[0];
		int menor = numeros[0];
		
		for (int numero : numeros) {
			if (numero > maior) {
				maior = numero;
			}
			
			if (numero < menor) {
				menor = numero;
			}
		}
		
		System.out.println("O maior número é: " + maior);
		System.out.println("O menor número é: " + menor);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos elementos terá o vetor: ");
		int dados = sc.nextInt();
		int[] numeros = new int[dados];
		
		System.out.println();
		System.out.println("Digite os números no vetor: ");
		for (int i = 0; i<dados; i++) {
			numeros[i] = sc.nextInt();
		}
		encontrarMaiorMenor(numeros);
	}
}
