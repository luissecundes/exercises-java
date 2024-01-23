package exercises;

import java.util.Scanner;

public class BirthdayCake {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira a quantidade de velas: ");
		int quantidade = sc.nextInt();
		int[] alturaVelas = new int[quantidade];

		int alturaMaxima = 0;
		int contagemVelas = 0;

		System.out.println("Insira a altura das velas: ");
		for (int i = 0; i < quantidade; i++) {
			alturaVelas[i] = sc.nextInt();
			if (alturaVelas[i] > alturaMaxima) {
				alturaMaxima = alturaVelas[i];
			}
		}

		for (int altura : alturaVelas) {
			if (altura == alturaMaxima) {
				contagemVelas++;
			}
		}

		System.out.println("A quantidade de velas altas são: " + contagemVelas);

	}

}
