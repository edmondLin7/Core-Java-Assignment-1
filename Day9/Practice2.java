package Day9;

import java.util.*;

public class Practice2 {
    public static void info(String name, int rollNum, String interests) {
        System.out.println("Hey, my name is " + name
                + " and my roll number is " + rollNum
                + ". My field of interest are " + interests
        );
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = "";
        int rollNum = 0;
        String interest = "";
        try {
            System.out.println("Enter name: ");
            name = scan.next();
        } catch (InputMismatchException e) {
            System.out.println("Enter number only");
            throw new RuntimeException();
        }
        try {
            System.out.println("Enter rollNum: ");
            rollNum = Integer.parseInt(scan.next());
        } catch (InputMismatchException e) {
            System.out.println("Enter number only");
            throw new RuntimeException();
        }
        try {
            System.out.println("Enter interests: ");
            interest = scan.next();
        } catch (InputMismatchException e) {
            System.out.println("Enter number only");
            throw new RuntimeException();
        }
        Practice2.info(name, rollNum, interest);

    }
}
