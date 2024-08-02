import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double length,width,perimeter,area;
Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle:");
        length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle:");
        width = scanner.nextDouble();

        perimeter = (length + width) * 2;
        area = length * width;
        System.out.println("The area of the rectangle is "+area);
        System.out.println("The perimeter of the rectangle is "+perimeter);

    }
}