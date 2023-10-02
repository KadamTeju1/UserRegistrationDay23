package welcometouser;

import java.util.Scanner;
import java.util.function.Predicate;

public class MobileNumberValidator
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lambda expression to validate a mobile number format
        Predicate<String> mobileNumberValidator = number -> number.matches("^\\d{2,4} \\d{10}$");

        System.out.print("Enter a mobile number (e.g., '91 1234567890'): ");
        String mobileNumber = scanner.nextLine();

        if (mobileNumberValidator.test(mobileNumber)) {
            System.out.println("Valid mobile number");
        } else {
            System.out.println("Invalid mobile number");
        }

        scanner.close();
    }
}
