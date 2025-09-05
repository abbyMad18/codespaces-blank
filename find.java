import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class find {

    public static void finder(String input, String p){
        Pattern pattern = Pattern.compile(p);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void main(String[] args) {
       finder("HeJgaHHVYDjbudfbGFSADGusaycytF", "[a-z]");//level2
       finder("uisGHFhGHYsfuuefiuGGyGGGfuGUGGuJJJADYuAYFWGYQW", "[a-z][A-Z]{3}([a-z]{1})[A-Z]{3}[a-z]");//level3
    }
}

