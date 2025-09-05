import java.util.regex.Matcher;
import java.util.regex.Pattern;

public static void main(String[] args) {
        String input = "HeLlO";
        Pattern pattern = Pattern.compile("[a-z]");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
}