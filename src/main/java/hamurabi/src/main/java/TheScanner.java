package hamurabi.src.main.java;


import java.util.InputMismatchException;

public class TheScanner {

    static java.util.Scanner scanner = new java.util.Scanner(System.in);
    static int getNumber(String message) {
        while (true) {
            System.out.print(message);
            try {
                return scanner.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("\"" + scanner.next() + "\" isn't a number dumdum! Try again.");
            }
        }
    }
}
