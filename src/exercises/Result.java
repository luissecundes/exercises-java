package exercises;

import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static void countSort(List<List<String>> arr) {
        int n = arr.size();

        List<List<String>> firstHalf = arr.subList(0, n / 2);
        List<List<String>> secondHalf = arr.subList(n / 2, n);

        for (List<String> pair : firstHalf) {
            pair.set(1, "-");
        }

        // Criar um array de listas para armazenar as cadeias de caracteres ordenadas
        List<String>[] sortedArray = new List[100];

        // Inicializar as listas no array
        for (int i = 0; i < 100; i++) {
            sortedArray[i] = new ArrayList<>();
        }

        // Adicionar as cadeias de caracteres à lista correspondente no array
        for (int i = 0; i < n; i++) {
            int index = Integer.parseInt(arr.get(i).get(0));
            String element = arr.get(i).get(1);

            if (i < n / 2) {
                // Adicionar traço à primeira metade da matriz
                element = "-";
            }

            sortedArray[index].add(element);
        }

        // Imprimir as cadeias de caracteres ordenadas
        for (List<String> list : sortedArray) {
            System.out.print(list.stream().collect(joining(" ")) + " ");
        }
    }
}


