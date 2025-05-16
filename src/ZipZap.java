import java.util.Scanner;

public class ZipZap {
    public static void printZipZap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            boolean isDivisibleBy3 = (i % 3 == 0);
            boolean isDivisibleBy5 = (i % 5 == 0);
            if (isDivisibleBy3 && isDivisibleBy5) {
                System.out.println("ZipZap");
            } else if (isDivisibleBy5) {
                System.out.println("Zap");
            } else if (isDivisibleBy3) {
                System.out.println("Zip");
            } else {
                System.out.println(i);
            }
        }
    }



}








