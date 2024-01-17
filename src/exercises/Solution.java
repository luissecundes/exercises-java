package exercises;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		scanner.nextLine();

		List<List<String>> arr = new ArrayList<>();

		IntStream.range(0, n).forEach(i -> {
			arr.add(Stream.of(scanner.nextLine().split(" ")).collect(toList()));
		});

		Result.countSort(arr);

		scanner.close();
	}
}