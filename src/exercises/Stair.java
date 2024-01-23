package exercises;

import java.util.Scanner;

public class Stair {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de degraus da escada: ");
		int altura = sc.nextInt(); 

		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < altura - i - 1; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < i + 1; k++) {
				System.out.print("#");
			}

			System.out.println();
		}
	}

}
