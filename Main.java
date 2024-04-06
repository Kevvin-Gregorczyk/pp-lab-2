import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę przedmiotów:");
        int numOfSubjects = scanner.nextInt();

        double[] grades = new double[numOfSubjects];

        for (int i = 0; i < numOfSubjects; i++) {
            double grade;
            do {
                System.out.println("Podaj ocenę z przedmiotu " + (i + 1) + ":");
                grade = scanner.nextDouble();
                if (grade <= 0 || grade >= 6) {
                    System.out.println("Wpisz ocene od 1 do 6 Polskie szkolnictwo...");
                }
            } while (grade <= 0 || grade >= 6);
            grades[i] = grade;
        }

        System.out.println("Oceny z przedmiotów:");
        for (int i = 0; i < numOfSubjects; i++) {
            System.out.println("Ocena z przedmiotu " + (i + 1) + ": " + grades[i]);
        }

        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        System.out.println("Suma ocen: " + sum);

        double average = sum / numOfSubjects;
        System.out.println("Średnia ocen z przedmiotów: " + average);

        double median = calculateMedian(grades);
        System.out.println("Mediana ocen z przedmiotów: " + median);

        scanner.close();
    }

    public static double calculateMedian(double[] grades) {
        Arrays.sort(grades);

        if (grades.length % 2 == 0) {
            int middleIndex = grades.length / 2;
            return (grades[middleIndex - 1] + grades[middleIndex]) / 2;
        } else {
            return grades[grades.length / 2];
        }
    }
}