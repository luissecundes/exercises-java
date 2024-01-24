package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Testes {

	public static void verificaParesImpares(ArrayList<Integer> lista) {
		System.out.println("Números pares: ");
		for (int numeros : lista) {
			if (numeros % 2 == 0) {
				System.out.println(numeros + " ");
			}
		}
		
		System.out.println("Números ímpares: ");
		for (int numeros : lista) {
			if (numeros % 2 != 0) {
				System.out.println(numeros + " ");
			}
		}
        System.out.println(); 

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> numeros = new ArrayList<>(List.of(5, 12, 8, 7, 20, 15));
		
		verificaParesImpares(numeros);

        sc.close();

	}

}
