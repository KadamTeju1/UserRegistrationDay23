package welcometouser;

import java.util.Scanner;
import java.util.function.Predicate;

public class EmailValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lambda expression to validate an email address
        Predicate<String> emailValidator = email -> email.matches("^abc\\.bl\\.co(@xyz\\.in)?|(@abc\\.bl\\.co(@xyz\\.in)?)?$");

        System.out.print("Enter an email address: ");
        String email = scanner.nextLine();

        if (emailValidator.test(email))
        {
            System.out.println("Valid email address");
        }
        else
        {
            System.out.println("Invalid email address");
        }

        scanner.close();
    }
}
