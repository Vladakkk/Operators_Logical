package app;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static double tax;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input your income: ");

        int inCome = sc.nextInt();

        if (inCome > 0 & inCome <= 10000) {
            tax = inCome * 0.025;
            System.out.printf("Tax is: %.2f%n ", tax);

        } else if (inCome > 10000 & inCome <= 25000) {
            tax = inCome * 0.043;
            System.out.printf("Tax is: %.2f%n", tax);

        } else if (inCome > 25000) {
            tax = inCome * 0.067;
            System.out.printf("Tax is: %.2f%n", tax);
        }
    }
}