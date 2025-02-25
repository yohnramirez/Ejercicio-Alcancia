package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var alcancia = new Alcancia();
        var scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu");
            System.out.println("(1) Add coins");
            System.out.println("(2) Count coins");
            System.out.println("(3) Calculate total");
            System.out.println("(4) Break");
            System.out.println("(5) Exit");
            System.out.println("Select an option -> ");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter a coin (20, 50, 100, 200, 500) : ");
                    var typeCoin = scanner.nextInt();
                    alcancia.addCoin(typeCoin);
                    break;

                case 2:
                    alcancia.countByTypeCoin();
                    break;

                case 3:
                    var total = alcancia.getTotalSaved();
                    System.out.println("Your total is " + total);
                    break;

                case 4:
                    alcancia.breakSavings();
                    break;

                case 5:
                    System.out.println("Bye bye...");
                    scanner.close();
                    break;

                default:
                    System.out.println("Enter a valid option.");
            }
        }
    }
}