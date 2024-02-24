package com.bank;

import java.util.Scanner;

public class BankQuizApplication {
    private static double balance = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println();
            System.out.print("Enter your choice: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                System.out.println();
                scanner.next(); // discard the non-integer input
                continue;
            }
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Utils.deposit(scanner);
                    break;
                case 2:
                    Utils.withdraw(scanner);
                    break;
                case 3:
                    Utils.checkBalance();
                    break;
                case 4:
                    Utils.exitProgram();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
