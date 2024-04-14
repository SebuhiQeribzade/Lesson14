package MathOperations;

class MathOperations {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to subtract two integers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method to subtract two doubles
    public double subtract(double a, double b) {
        return a - b;
    }

    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to multiply three integers
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // Method to multiply two doubles
    public double multiply(double a, double b) {
        return a * b;
    }

    // Method to divide two integers
    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero.");
            return Double.NaN; // Not-a-Number
        }
        return (double) a / b;
    }

    // Method to divide two doubles
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero.");
            return Double.NaN; // Not-a-Number
        }
        return a / b;
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        // Test various method overloads
        System.out.println("Addition:");
        System.out.println("5 + 3 = " + math.add(5, 3));
        System.out.println("5.5 + 3.7 = " + math.add(5.5, 3.7));
        System.out.println("5 + 3 + 2 = " + math.add(5, 3, 2));

        System.out.println("\nSubtraction:");
        System.out.println("5 - 3 = " + math.subtract(5, 3));
        System.out.println("5.5 - 3.7 = " + math.subtract(5.5, 3.7));

        System.out.println("\nMultiplication:");
        System.out.println("5 * 3 = " + math.multiply(5, 3));
        System.out.println("5.5 * 3.7 = " + math.multiply(5.5, 3.7));
        System.out.println("5 * 3 * 2 = " + math.multiply(5, 3, 2));

        System.out.println("\nDivision:");
        System.out.println("10 / 2 = " + math.divide(10, 2));
        System.out.println("5 / 0 = " + math.divide(5, 0));
    }
}
