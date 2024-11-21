import java.util.Scanner;

class CalciProj {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double num1, num2;
        double result;
        int choice;
        
        // Display menu
        System.out.println("Simple Calculator");
        System.out.println("Choose an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
        
        while (true) {
            // Ask for user choice
            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextInt();
            
            // Exit condition
            if (choice == 5) {
                System.out.println("Exiting calculator. Goodbye!");
                break;
            }
            
            // Input numbers
            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();
            
            // Perform calculations based on the user's choice
            switch (choice) {
                case 1: // Add
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case 2: // Subtract
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case 3: // Multiply
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case 4: // Divide
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please choose between 1 and 5.");
            }
        }
        
        scanner.close();
    }
}
