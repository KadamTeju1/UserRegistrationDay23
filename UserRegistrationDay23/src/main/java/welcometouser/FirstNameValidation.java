package welcometouser;

import welcometouser.NameValidator;
public class FirstNameValidation {
    public static void main(String[] args) {
            // Lambda expression for validating the first name
            NameValidator firstNameValidator = (name) -> {
                // Check if the name starts with a capital letter and has a minimum length of 3 characters
                return name.matches("[A-Z][a-zA-Z]{2,}");
            };

            // Get user input for the first name
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter your first name: ");
            String firstName = scanner.nextLine();

            // Validate the first name using the lambda expression
            if (firstNameValidator.validate(firstName)) {
                System.out.println("Valid first name.");
            } else {
                System.out.println("Invalid first name. First name should start with a capital letter and have a minimum of 3 characters.");
            }

            scanner.close();
        }
}