package exercises;

import java.util.Scanner;

public class VerificaPares {

    public static void verificarPares(int[] numeros) {
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero + " é par");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] vetor = new int[number];

        for (int i = 0; i < number; i++) {
            vetor[i] = sc.nextInt();
        }

        verificarPares(vetor);
    }
}
