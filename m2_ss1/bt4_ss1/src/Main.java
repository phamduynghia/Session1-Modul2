import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = scanner.nextDouble();

        double square = number * number;
        System.out.println("The square of " + number + " is " + square);
        double cube = number * number * number;
        System.out.println("The cube of " + number + " is " + cube);
    }
}