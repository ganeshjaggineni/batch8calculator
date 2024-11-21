import java.util.Scanner;

class CalciProj {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Insufficient arguments provided. Usage: <operation> <num1> <num2>");
            return;
        }

        String operation = args[0]; // Case-sensitive matching
        double num1 = Double.parseDouble(args[1]);
        double num2 = Double.parseDouble(args[2]);

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
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid operation. Choose Add, Subtract, Multiply, or Divide.");
        }
    }
}
