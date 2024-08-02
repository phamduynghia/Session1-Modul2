import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number1,number2,number3;
        Scanner scanner = new Scanner(System.in);


        System.out.print("nhập số thứ nhất: ");
        number1 = scanner.nextDouble();
        System.out.print("nhập số thứ hai: ");
        number2 = scanner.nextDouble();
        System.out.print("nhập số thứ ba: ");
        number3 = scanner.nextDouble();

        double sum = number1 + number2 + number3;
        double avg = sum / 2;

        System.out.println( "The sum: "+sum);
        System.out.println( "The avg: "+avg);
    }
}