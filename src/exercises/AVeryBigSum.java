package exercises;

import java.util.List;
import java.util.Scanner;

public class AVeryBigSum {

	public static long aVeryBigSum(List<Integer> ar) {
		long total = 0;
		
		for (long numeros : ar) {
			total = total + numeros;
		}
		return total;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		sc.close();
	}

}
