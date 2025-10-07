import java.util.Scanner;

public class AgeValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            String input = scanner.nextLine();
            int age = Integer.parseInt(input);

            System.out.println("Your age is: " + age);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
        finally {
            System.out.println("Age validation check complete.");
            scanner.close();
        }
    }
}
