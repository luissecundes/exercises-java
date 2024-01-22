package exercises;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

class MiniMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        
    	  long sum = 0;
    	    long min = Long.MAX_VALUE;
    	    long max = Long.MIN_VALUE;

    	    // Calcula a soma total
    	    for (int num : arr) {
    	        sum = sum + num;
    	    }

    	    // Encontra o mínimo e máximo excluindo um número por vez
    	    for (int num : arr) {
    	        long currentSum = sum - num;
    	        min = Math.min(min, currentSum);
    	        max = Math.max(max, currentSum);
    	    }

    	    System.out.println(min + " " + max);

    }



    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        MiniMaxSum.miniMaxSum(arr);

        bufferedReader.close();
    }
}