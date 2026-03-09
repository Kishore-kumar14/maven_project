package com.example;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Check if the user provided a number as an argument
        if (args.length == 0) {
            System.out.println("Please provide a number as a command-line argument.");
            return;
        }

        try {
            // Convert the first argument (String) to an Integer
            int num = Integer.parseInt(args[0]);
            
            System.out.println("Multiplication Table for: " + num);
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d = %d%n", num, i, num * i);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide a valid integer.");
        }
    }
}
