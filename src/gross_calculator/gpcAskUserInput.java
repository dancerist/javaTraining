package gross_calculator;

import java.util.Scanner;

public class gpcAskUserInput {

    public static void main(String[] args) {
        //note: Declared once
        Scanner scanner = new Scanner(System.in);

        //1. Get the number of hours worked
        int hours = 0;
        System.out.println("How many hours did you work?");

        hours = scanner.nextInt();

        //2. Get the hourly pay rate
        double payRate = 0;
        System.out.println("How much hourly pay rate");

        payRate = scanner.nextDouble();

        //3. Multiply hours and pay rate
        double grossPay = hours * payRate;

        //4. Display result
        System.out.println("Gross pay: " + grossPay);
    }
}