import java.util.Scanner;

public class CalciProj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Check if there are command-line arguments
        if (args.length > 0) {
            // Simulate user input from arguments
            int choice = Integer.parseInt(args[0]);
            System.out.println("Choice from arguments: " + choice);
            // Perform calculation based on the choice
            switch(choice) {
                case 1:
                    System.out.println("Adding...");
                    break;
                case 2:
                    System.out.println("Subtracting...");
                    break;
                case 3:
                    System.out.println("Multiplying...");
                    break;
                case 4:
                    System.out.println("Dividing...");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } else {
            // Fall back to interactive input if no arguments are provided
            System.out.println("Simple Calculator");
            System.out.println("Choose an operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Adding...");
                    break;
                case 2:
                    System.out.println("Subtracting...");
                    break;
                case 3:
                    System.out.println("Multiplying...");
                    break;
                case 4:
                    System.out.println("Dividing...");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}
