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

        scanner.close();
    }
}