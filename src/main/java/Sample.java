import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Sample {
    public static void main(String[] args) {
        System.out.println(useRegex("3312-1834-1234-1234"));
    }
    public static boolean useRegex(final String input) {
        // Compile regular expression
        final Pattern pattern = Pattern.compile("\\d\\d\\d\\d-\\d\\d\\d\\d-\\d\\d\\d\\d-\\d\\d\\d\\d", Pattern.CASE_INSENSITIVE);
        // Match regex against input
        final Matcher matcher = pattern.matcher(input);
        // Use results...
        return matcher.matches();
    }
}