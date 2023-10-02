package welcometouser;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Predicate;

public class PasswordValidator3
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define a set of sample email addresses
        Set<String> sampleEmails = new HashSet<>();
        sampleEmails.add("sample@email.com");
        sampleEmails.add("another@email.com");
        // Add more sample email addresses as needed

        // Lambda expression to validate a password
        Predicate<String> passwordValidator = password -> password.length() >= 8 && !containsSampleEmail(password, sampleEmails);

        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        if (passwordValidator.test(password)) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }

        scanner.close();
    }

    private static boolean containsSampleEmail(String password, Set<String> sampleEmails) {
        for (String sampleEmail : sampleEmails) {
            if (password.contains(sampleEmail)) {
                return true;
            }
        }
        return false;
    }
}
