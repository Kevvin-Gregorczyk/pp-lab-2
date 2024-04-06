import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę przedmiotów:");
        int numOfSubjects = scanner.nextInt();

        double[] grades = new double[numOfSubjects];

        for (int i = 0; i < numOfSubjects; i++) {
            System.out.println("Podaj ocenę z przedmiotu " + (i + 1) + ":");
            grades[i] = scanner.nextDouble();
        }

        double average = calculateAverage(grades);
        double median = calculateMedian(grades);

        System.out.println("Średnia ocen z przedmiotów: " + average);
        System.out.println("Mediana ocen z przedmiotów: " + median);

        scanner.close();
    }

    public static double calculateAverage(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static double calculateMedian(double[] array) {
        Arrays.sort(array);
        int length = array.length;
        if (length % 2 == 0) {
            return (array[length / 2 - 1] + array[length / 2]) / 2.0;
        } else {
            return array[length / 2];
        }
    }
}