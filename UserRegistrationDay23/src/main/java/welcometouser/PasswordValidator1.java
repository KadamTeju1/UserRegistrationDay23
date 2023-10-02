package welcometouser;

import java.util.Scanner;
import java.util.function.Predicate;

public class PasswordValidator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lambda expression to validate a password
        Predicate<String> passwordValidator = password -> password.length() >= 8 && containsUppercase(password);

        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        if (passwordValidator.test(password)) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }

        scanner.close();
    }

    private static boolean containsUppercase(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }
}
