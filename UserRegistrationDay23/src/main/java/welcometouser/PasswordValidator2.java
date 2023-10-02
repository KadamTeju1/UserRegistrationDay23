package welcometouser;

import java.util.Scanner;
import java.util.function.Predicate;

public class PasswordValidator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lambda expression to validate a password
        Predicate<String> passwordValidator = password -> password.length() >= 8 && hasExactlyOneSpecialCharacter(password);

        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        if (passwordValidator.test(password)) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }

        scanner.close();
    }

    private static boolean hasExactlyOneSpecialCharacter(String password) {
        int specialCharCount = 0;
        for (char c : password.toCharArray()) {
            if (isSpecialCharacter(c)) {
                specialCharCount++;
                if (specialCharCount > 1) {
                    return false; // More than one special character found
                }
            }
        }
        return specialCharCount == 1; // Exactly one special character found
    }

    private static boolean isSpecialCharacter(char c) {
        // Define your list of special characters here, for example:
        String specialCharacters = "!@#$%^&*()_+";
        return specialCharacters.contains(String.valueOf(c));
    }
}
