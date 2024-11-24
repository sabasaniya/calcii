import java.util.Scanner;

public class Calci {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2, result;
        String operator;
        
        try {
            // Taking input for the first number
            System.out.print("Enter the first number: ");
            num1 = scanner.nextDouble();
            
            // Taking input for the operator
            System.out.print("Enter the operator (+, -, *, /): ");
            operator = scanner.next();
            
            // Taking input for the second number
            System.out.print("Enter the second number: ");
            num2 = scanner.nextDouble();
            
            // Perform the calculation based on the operator
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                
                case "-":
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                
                case "*":
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                
                case "/":
                    // Handling division by zero
                    if (num2 == 0) {
                        throw new ArithmeticException("Cannot divide by zero.");
                    }
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                    break;
                
                default:
                    System.out.println("Invalid operator.");
                    break;
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid numbers and operators.");
        } finally {
            System.out.println("Calculator operation completed.");
            scanner.close();  // Close the scanner resource
        }
    }
}

