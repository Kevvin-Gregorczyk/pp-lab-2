import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę przedmiotów:");
        int numOfSubjects = scanner.nextInt();

        double sum = 0;
        for (int i = 1; i <= numOfSubjects; i++) {
            System.out.println("Podaj ocenę z przedmiotu " + i + ":");
            double grade = scanner.nextDouble();
            sum += grade;
        }

        double average = sum / numOfSubjects;
        System.out.println("Średnia ocen z przedmiotów: " + average);

        scanner.close();
    }
}