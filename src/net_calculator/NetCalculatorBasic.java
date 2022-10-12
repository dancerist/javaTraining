package net_calculator;

import java.util.Scanner;

public class NetCalculatorBasic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double net, totalCost;

        System.out.println("10% discount code applied");

        System.out.print("How much is the total purchase? ");
        totalCost = scanner.nextDouble();

        net = totalCost - (.10 * totalCost);

        System.out.println("The total net purchase is: " + net);
    }
}