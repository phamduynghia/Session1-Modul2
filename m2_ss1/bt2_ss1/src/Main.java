import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final double rate =23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the amount in USD :");
        double usd = scanner.nextDouble();
        double vnd = usd * rate;
        System.out.println("The equivalent rate is:"+vnd );
    }
}