package Transport;

public class Validate {
    public static String validateString(String value) {
        return value == null || value.isBlank() || value.isEmpty() ? " данные не введены" : value;
    }
}
