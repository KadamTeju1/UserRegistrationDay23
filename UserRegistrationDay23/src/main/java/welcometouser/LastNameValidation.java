package welcometouser;

import java.util.Scanner;

public class LastNameValidation {
    public static void main(String[] args) {
        // Lambda expression for validating a valid last name
        NameValidator lastNameValidator = (name) -> {

            return !name.isEmpty() && name.matches("^[A-Z][a-zA-Z]{2,}$");
        };

        // Get user input for the last name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        // Validate the last name using the lambda expression
        if (lastNameValidator.validate(lastName)) {
            System.out.println("Valid last name.");
        } else {
            System.out.println("Invalid last name. Last name should start with a capital letter and have a minimum of 3 characters.");
        }

        scanner.close();
    }
}
