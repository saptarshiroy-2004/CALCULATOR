import java.util.Scanner;

class Calculator {
    double num1;
    double num2;

    public void add(double a, double b) {
        this.num1 = a;
        this.num2 = b;
    }

    public double sum() {
        return num1 + num2;
    }

    public void minus(double a, double b) {
        this.num1 = a;
        this.num2 = b;
    }

    public double diff() {
        return num1 - num2;
    }

    public void mul(double a, double b) {
        this.num1 = a;
        this.num2 = b;
    }

    public double multiply() {
        return num1 * num2;
    }

    public void div(double a, double b) {
        this.num1 = a;
        this.num2 = b;
    }

    public double division() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Division by zero!");
            return Double.NaN; // Return "Not a Number" if division by zero.
        }
    }
}

public class CALCULATOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("ENTER WHAT OPERATION YOU WANT TO PERFORM: ");
        System.out.println("1. ADDITION");
        System.out.println("2. SUBTRACTION");
        System.out.println("3. MULTIPLICATION");
        System.out.println("4. DIVISION");

        int choice = sc.nextInt();

        System.out.print("ENTER THE FIRST NUMBER: ");
        double num1 = sc.nextDouble();

        System.out.print("ENTER THE SECOND NUMBER: ");
        double num2 = sc.nextDouble();

        switch (choice) {
            case 1:
                calculator.add(num1, num2);
                System.out.println("RESULT: " + calculator.sum());
                break;
            case 2:
                calculator.minus(num1, num2);
                System.out.println("RESULT: " + calculator.diff());
                break;
            case 3:
                calculator.mul(num1, num2);
                System.out.println("RESULT: " + calculator.multiply());
                break;
            case 4:
                calculator.div(num1, num2);
                System.out.println("RESULT: " + calculator.division());
                break;
            default:
                System.out.println("INVALID CHOICE!");
        }

        sc.close();
    }
}
