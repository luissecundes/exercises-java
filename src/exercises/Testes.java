package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Testes {

	public static void removerNumerosImpares(List<Integer> lista) {

		lista.removeIf(numero -> numero % 2 != 0);

	}
	
	public static void removerNumerosNegativos(List<Integer> lista) {

		lista.removeIf(numero -> numero < 0);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> numeros = new ArrayList<>(
				List.of(-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

		System.out.println("Esta é a lista original: " + numeros);
		System.out.println();
		System.out.println();
		removerNumerosImpares(numeros);
		System.out.println("Esta é a lista sem os números ímpares: " + numeros);
		System.out.println();
		System.out.println();
		removerNumerosNegativos(numeros);
		System.out.println("Esta é a lista sem os números negativos e os ímpares: " + numeros);
		sc.close();

	}

}
