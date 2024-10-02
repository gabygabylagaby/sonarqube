package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double num1 = 10;
        double num2 = 5;

        System.out.println("Sum: " + calculator.add(num1, num2));
        System.out.println("Difference: " + calculator.subtract(num1, num2));
        System.out.println("Product: " + calculator.multiply(num1, num2));
        System.out.println("Quotient: " + calculator.divide(num1, num2));
    }
}
