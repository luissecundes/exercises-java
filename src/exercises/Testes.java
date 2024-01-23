package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Testes {

	public static List<Integer> gradingStudents(List<Integer> grades) {
		
		List<Integer> roundedGrades = new ArrayList<>();

        for (int grade : grades) {
            if (grade < 38 || grade % 5 < 3) {
                roundedGrades.add(grade);
            } else {
                roundedGrades.add((grade / 5 + 1) * 5);
            }
        }

        return roundedGrades;
	    }

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		sc.close();
	}

}
