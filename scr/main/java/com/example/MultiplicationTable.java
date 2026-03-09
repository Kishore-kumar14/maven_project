package com.example;

public class MultiplicationTable {
    public static void main(String[] args) {
        // 1. Check if an argument was passed
        if (args.length == 0) {
            System.out.println("No number provided. Defaulting to table of 5.");
            printTable(5);
            return;
        }

        // 2. Try to parse the argument
        try {
            int num = Integer.parseInt(args[0]);
            printTable(num);
        } catch (NumberFormatException e) {
            System.err.println("Error: '" + args[0] + "' is not a valid number.");
            System.exit(1); // Tells Maven the execution failed
        }
    }

    private static void printTable(int n) {
        System.out.println("--- Multiplication Table for " + n + " ---");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", n, i, (n * i));
        }
    }
}
