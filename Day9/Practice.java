package Day9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        double firstN = 0;
        double secondN = 0;
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter first number: ");
            firstN = scan.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Enter number only");
            throw new RuntimeException();
        }
        try {
            System.out.println("Enter second number: ");
            secondN = scan.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Enter number only");
            throw new RuntimeException();
        }
        System.out.println((int)(firstN * secondN));
    }
}
