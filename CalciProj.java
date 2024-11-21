import java.util.*;
class CalciProj {
    public static void main(String[] args) {
        // Ensure there are exactly 3 arguments (operation, num1, num2)
        if (args.length != 3) {
            System.out.println("Usage: java CalciProj <operation> <num1> <num2>");
            System.exit(1);
        }

        String operation = args[0]; // Operation type (Add, Subtract, etc.)
        double num1 = Double.parseDouble(args[1]); // First number
        double num2 = Double.parseDouble(args[2]); // Second number

        // Perform the chosen operation
        switch (operation) {
            case "Add":
                System.out.println("Result: " + (num1 + num2));
                break;
            case "Subtract":
                System.out.println("Result: " + (num1 - num2));
                break;
            case "Multiply":
                System.out.println("Result: " + (num1 * num2));
                break;
            case "Divide":
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}
