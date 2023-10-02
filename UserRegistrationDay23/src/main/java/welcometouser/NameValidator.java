package welcometouser;

@FunctionalInterface
public interface NameValidator {
    boolean validate(String name);
}
