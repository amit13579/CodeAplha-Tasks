package com.bank;

import java.util.Scanner;

public class Utils {
    private static double balance = 0;

    public static void deposit(Scanner scanner) {
        System.out.println();
        System.out.print("Enter amount to deposit: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            System.out.println();
            scanner.next(); // discard the non-double input
            return;
        }
        double deposit = scanner.nextDouble();
        if (deposit <= 0) {
            System.out.println("Deposit amount must be positive.");
            System.out.println();
            return;
        }
        balance += deposit;
        System.out.println();
        System.out.println("Deposit successful!");
        System.out.println();
    }

    public static void withdraw(Scanner scanner) {
        System.out.print("Enter amount to withdraw: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            System.out.println();
            scanner.next(); // discard the non-double input
            return;
        }
        double withdraw = scanner.nextDouble();
        if (withdraw <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            System.out.println();
            return;
        }
        if (withdraw > balance) {
            System.out.println();
            System.out.println("Insufficient balance!");
            return;
        }
        balance -= withdraw;
        System.out.println();
        System.out.println("Withdrawal successful!");
        System.out.println();
    }

    public static void checkBalance() {
        System.out.println("Your balance is: " + balance);
        System.out.println();
    }

    public static void exitProgram() {
        System.out.println("XXXX-----Exiting program.-----XXXX");
        System.exit(0);
    }
}
