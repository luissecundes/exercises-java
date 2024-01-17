package exercises;

import java.util.Locale;
import java.util.Scanner;

public class CalculaMedia {

	public static double calcularMedia(double[] notas) {
		
		double soma = 0;
		for (double nota : notas) {
			soma = soma + nota;			
		}
		return soma / notas.length;
    }

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Estrutura para fazer o usuário definir o número de espaços no array e definir os valores inseridos
		int n = sc.nextInt();
		double[] notas = new double[n];
		for (int i = 0; i < n; i++) {
			notas[i] = sc.nextDouble();
		}
		
		
		double media = calcularMedia(notas);
		
        System.out.println("A média das notas é: " + media);

	}

}
