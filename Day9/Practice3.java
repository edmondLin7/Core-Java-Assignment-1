package Day9;

import java.util.*;
class Average {
    public static void printAvg(int a, int b, int c) {
        System.out.println((a + b + c) / 3);
    }
}
public class Practice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstN = 0;
        int secondN  = 0;
        int thirdN = 0;
        try {
            System.out.println("Enter name: ");
            firstN = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Enter number only");
            throw new RuntimeException();
        }
        try {
            System.out.println("Enter rollNum: ");
            secondN = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Enter number only");
            throw new RuntimeException();
        }
        try {
            System.out.println("Enter interests: ");
            thirdN = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Enter number only");
            throw new RuntimeException();
        }
        Average.printAvg(firstN, secondN, thirdN);

    }
}