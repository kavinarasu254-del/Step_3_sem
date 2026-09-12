package Week_2;

public class LibraryIsbnValidator {

    public String normalizeCode(String raw) {
        String trimmed = raw.trim();

        if (trimmed.length() < 3) {
            return trimmed.toUpperCase();
        }

        return trimmed.substring(0, 3).toUpperCase() + trimmed.substring(3);
    }

    public String validateAndFormat(String code) {
        if (code.length() != 13) {
            return "Invalid: wrong length";
        }

        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: publisher code must be 3 letters";
            }
        }

        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: non-digit body";
            }
        }

        StringBuilder formatted = new StringBuilder();
        formatted.append("[")
                .append(code.substring(0, 3))
                .append("] YEAR: ")
                .append(code.substring(3, 7))
                .append(" | CATALOG: ")
                .append(code.substring(7));

        return formatted.toString();
    }

    public static void main(String[] args) {
        LibraryIsbnValidator validator = new LibraryIsbnValidator();

        String input1 = "pen2026004251";
        String normalized1 = validator.normalizeCode(input1);
        System.out.println(validator.validateAndFormat(normalized1));

        String input2 = "12N2026004251";
        String normalized2 = validator.normalizeCode(input2);
        System.out.println(validator.validateAndFormat(normalized2));
    }
}