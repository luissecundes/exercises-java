package exercises;

import java.util.Scanner;

public class InserirValorMatriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a proporção da matriz: ");
		int proporcaoMatriz = sc.nextInt();
		int[][] matriz = new int[proporcaoMatriz][proporcaoMatriz];

		System.out.println("Digite os valores na matriz linha a linha: ");
		// Forma de percorrer uma matriz completa. No final onde tem o nextInt, significa que é permitido o usuário inserir dados em cada campo da matriz.
		for (int i = 0; i < proporcaoMatriz; i++) {
			for (int j = 0; j < proporcaoMatriz; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		// Imprime a diagonal da Matriz.
		for (int i = 0; i < proporcaoMatriz; i++) {
			System.out.println(matriz[i][i]);
		}

		System.out.println("----------------");
		System.out.println("----------------");

		int count = 0; // uma variável para armazenar a quantidade de negativos
		
		// Percorre a matriz completa e no final foi colocada uma condição para incrementar o 'count'.
		for (int i = 0; i<proporcaoMatriz; i++) {
			for (int j = 0; j<proporcaoMatriz; j++) {
				if (matriz[i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.println("O total de números negativos é: " + count);
		sc.close();
	}

}
